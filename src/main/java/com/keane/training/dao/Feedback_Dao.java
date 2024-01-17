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
import com.keane.training.domain.Feedback;

public class Feedback_Dao {
	
	public static int feedback(final Feedback f) throws DBConnectionException,DBFWException  {
		
		ConnectionHolder ch=null;
		Connection con=null;
		int result=0;
		
		try {
			
			ch=ConnectionHolder.getInstance();
			con=ch.getConnection();
			
			final ParamMapper FEEDBACK= new ParamMapper() {

				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					// TODO Auto-generated method stub
					pStmt.setInt(1, f.getFeedback_Id());
					pStmt.setString(2, f.getFeedback());
					pStmt.setString(3, f.getStudent_ID());
					
				}
			};
			
			//statement execution
			result=DBHelper.executeUpdate(con, SQLMapper.OPERATIONSTUDENTFEEDBACK,FEEDBACK);
			
		}catch(DBConnectionException e) {
			System.out.println(e);
		}
		
		return result;
		
	}
     
     
     //view feedback
	public static List getfeedback() throws DBConnectionException, DBFWException, SQLException
 	{
 		
 		List list=null;
 		ConnectionHolder ch=null;
 		Connection con=null;
 		try {
 			ch=ConnectionHolder.getInstance();
 			con=ch.getConnection();
 	
 			list=DBHelper.executeSelect(con,SQLMapper.OPERATIONINSTITUTEFEEDBACK,SQLMapper.FETCHFEEDBACKOUTMAPER);	
 		} catch (DBConnectionException e) {
 			throw new DBConnectionException("Unable to connect to db"+e);
 		
 		}
 		return list;

 }
	
	public boolean validateUser(final int Feedback_Id) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		List users = null;

		ParamMapper paramMapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {
				pStmt.setInt(1, Feedback_Id);
			}
		};
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			users = DBHelper.executeSelect(con, SQLMapper.VALIDATEFEEDBACK,SQLMapper.VALIDATEFEEDBACKOUTMAPPER,paramMapper);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);

	}
     

}
