package com.keane.dbcon;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
//import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionHolder {

	public static ConnectionHolder instance = null;
	private DataSource ds = null;

	private ConnectionHolder() {

	}

	public static ConnectionHolder getInstance() throws DBConnectionException {
		synchronized (ConnectionHolder.class) {
			if (instance == null) {
				instance = new ConnectionHolder();
				instance.initDataSource();
			}
		}
		return instance;
	}

	public Connection getConnection() throws DBConnectionException {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new DBConnectionException(e);
		}
	}

	public void dispose() throws DBConnectionException {
		BasicDataSource bds = (BasicDataSource) ds;
		try {
			bds.close();
		} catch (SQLException e) {
			throw new DBConnectionException("Unable to close the connection", e);
		}
	}

	
	private void initDataSource() throws DBConnectionException {
        ds = new BasicDataSource();
        ((BasicDataSource) ds).setDriverClassName("com.mysql.cj.jdbc.Driver");
        ((BasicDataSource) ds).setUrl("jdbc:mysql://localhost:3306/finalcasestudy");
        ((BasicDataSource) ds).setUsername("root");
        ((BasicDataSource) ds).setPassword("admin");

		
		
	}

}