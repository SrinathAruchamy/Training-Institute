package com.keane.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.keane.dbcon.ConnectionHolder;
import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.dbfw.DBHelper;
import com.keane.dbfw.ParamMapper;
import com.keane.training.domain.Request;

public class Request_Dao {
	
public static int request_institute(final Request r) throws DBConnectionException,DBFWException  {
		
		ConnectionHolder ch=null;
		Connection con=null;
		int result=0;
		
		try {
			
			ch=ConnectionHolder.getInstance();
			con=ch.getConnection();
			
			final ParamMapper REQUESTINSTITUTE= new ParamMapper() {
				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {

					pStmt.setInt(1, r.getRequest_Id());
					pStmt.setString(2,r.getMessage());
					pStmt.setString(3, r.getStudent_Id());
					
				}
			};
			
			//statement execution
			result=DBHelper.executeUpdate(con, SQLMapper.OPERATIONSTUDENTREQUEST,REQUESTINSTITUTE);
			
		}catch(DBConnectionException e) {
			System.out.println(e);
		}
		
		return result;
		
	}

//view request

	public static List getrequest() throws DBConnectionException, DBFWException, SQLException
	{
		
		List list=null;
		ConnectionHolder ch=null;
		Connection con=null;
		try {
			ch=ConnectionHolder.getInstance();
			con=ch.getConnection();
	
			list=DBHelper.executeSelect(con,SQLMapper.OPERATIONINSTITUTEREQUEST,SQLMapper.FETCHREQUESTOUTMAPER);	
		} catch (DBConnectionException e) {
			throw new DBConnectionException("Unable to connect to db"+e);
		
		}
		return list;

	}
	
	public boolean validateUser(final int Request_Id) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		List users = null;

		ParamMapper paramMapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {
				pStmt.setInt(1, Request_Id);
			}
		};
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			users = DBHelper.executeSelect(con, SQLMapper.VALIDATERESPONSE,SQLMapper.VALIDATERESPONSEOUTMAPPER,paramMapper);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);

	}
	

}
