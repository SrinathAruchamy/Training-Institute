package com.keane.training.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.keane.dbcon.ConnectionHolder;
import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.dbfw.DBHelper;

public class Faculty_Dao {

	public static List getfaculty() throws DBConnectionException, DBFWException, SQLException
	{
		
		List list=null;
		ConnectionHolder ch=null;
		Connection con=null;
		try {
			ch=ConnectionHolder.getInstance();
			con=ch.getConnection();
	
			list=DBHelper.executeSelect(con,SQLMapper.OPERATIONINSTITUTEFACULTY,SQLMapper.FETCHFACULTYOUTMAPER);	
		} catch (DBConnectionException e) {
			throw new DBConnectionException("Unable to connect to db"+e);
		
		}
		return list;

}
}
