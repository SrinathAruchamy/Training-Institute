package com.keane.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.keane.dbcon.ConnectionHolder;
import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.dbfw.DBHelper;
import com.keane.dbfw.ParamMapper;
import com.keane.training.domain.Student;

public class Student_Dao {
	
	static Logger log = Logger.getLogger(Student_Dao.class);

	//register
	
			public static int register_student(final Student s) throws DBConnectionException,DBFWException  {
				
				ConnectionHolder ch=null;
				Connection con=null;
				int result=0;
				
				try {
					
					ch=ConnectionHolder.getInstance();
					con=ch.getConnection();
					
					final ParamMapper REGISTERSTUDENT= new ParamMapper() {
						
						@Override
						public void mapParams(PreparedStatement pStmt) throws SQLException {

							pStmt.setString(1, s.getStudent_Id());
							pStmt.setString(2, s.getName());
							pStmt.setString(3, s.getQualification());
							pStmt.setLong(4, s.getContact_Number());
							pStmt.setString(5, s.getAddress());
							pStmt.setString(6, s.getEmail_Id());
							pStmt.setInt(7, s.getUser_Id());
							pStmt.setString(8, s.getPassword());
						}

					};
					
					//statement execution
					result=DBHelper.executeUpdate(con, SQLMapper.INSERTSTUDENT, REGISTERSTUDENT);
					
				}catch(DBConnectionException e) {
					System.out.println(e);
				}
				
				return result;
				
			}
			
			public boolean validateUser(final String Student_Id) throws DAOAppException {
				ConnectionHolder ch = null;
				Connection con = null;
				List users = null;

				ParamMapper paramMapper = new ParamMapper() {

					@Override
					public void mapParams(PreparedStatement pStmt) throws SQLException {
						pStmt.setString(1, Student_Id);
					}
				};
				try {
					ch = ConnectionHolder.getInstance();
					con = ch.getConnection();
					users = DBHelper.executeSelect(con, SQLMapper.VALIDATESTUDENT,SQLMapper.VALIDATESTUDENTDETAILSOUTMAPER,paramMapper);

				} catch (DBConnectionException e) {
					throw new DAOAppException(e);
				} catch (DBFWException e) {
					throw new DAOAppException(e);
				}

				return (users != null && users.size() > 0);

			}
			
			
			//login
			
			public static List login_student(final String Student_Id) throws DBFWException  {
				
				ConnectionHolder ch=null;
				Connection con=null;
				List list=null;
				
				try {
					
					ch=ConnectionHolder.getInstance();
					con=ch.getConnection();
					
					final ParamMapper LOGINSTUDENT= new ParamMapper() {
						
						
						@Override
						public void mapParams(PreparedStatement pStmt) throws SQLException {
						
							pStmt.setString(1, Student_Id);
							
						}
					};
					
					//statement execution
					list=DBHelper.executeSelect(con,SQLMapper.FETCHLOGINSTUDENT,SQLMapper.FETCHSTUDENTOUTMAPER,LOGINSTUDENT);			
				}catch(DBConnectionException e) {
					System.out.println(e);
				}
				
				return list;
				
			}
			
			//student details
			public static List getStudent() throws DBConnectionException, DBFWException, SQLException
			{
						
				List list=null;
				ConnectionHolder ch=null;
				Connection con=null;
				try {
					ch=ConnectionHolder.getInstance();
					con=ch.getConnection();
					
					list=DBHelper.executeSelect(con, SQLMapper.OPERATIONADMINSTUDENT,SQLMapper.FETCHSTUDENTDETAILSOUTMAPER);	
					} catch (DBConnectionException e) {
						throw new DBConnectionException("Unable to connect to db"+e);
						}
					return list;
			}
			
			
			//Update Profile
			public static int update_student(String Student_Id,long Contact_Number) throws DBFWException{
				
				ConnectionHolder ch=null;
				Connection con=null;
				int result=0;
				try {
					
					ch=ConnectionHolder.getInstance();
					con=ch.getConnection();
					
					final ParamMapper UPDATESTUDENT=new ParamMapper() {
						
						@Override
						public void mapParams(PreparedStatement pStmt) throws SQLException {
							// TODO Auto-generated method stub
							
							pStmt.setLong(1,Contact_Number);
							pStmt.setString(2,Student_Id);
							
						}
				
					};
					
					result=DBHelper.executeUpdate(con, SQLMapper.OPERATIONSTUDENTUPDATE,UPDATESTUDENT);
					
				}catch(DBConnectionException e) {
					System.out.println(e);
				}
				return result;
			}
			
			public boolean validateUpdate(final long Contact_Number) throws DAOAppException {
				ConnectionHolder ch = null;
				Connection con = null;
				List users = null;

				ParamMapper paramMapper = new ParamMapper() {

					@Override
					public void mapParams(PreparedStatement pStmt) throws SQLException {
						pStmt.setLong(1, Contact_Number);
					}
				};
				try {
					ch = ConnectionHolder.getInstance();
					con = ch.getConnection();
					users = DBHelper.executeSelect(con, SQLMapper.VALIDATEUPDATE,SQLMapper.VALIDATEUPDATEOUTMAPPER,paramMapper);

				} catch (DBConnectionException e) {
					throw new DAOAppException(e);
				} catch (DBFWException e) {
					throw new DAOAppException(e);
				}

				return (users != null && users.size() > 0);

			}
		     
	

			

}
