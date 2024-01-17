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
import com.keane.training.domain.Delete;
import com.keane.training.domain.Institute;

public class Institute_Dao {
	
	static Logger log = Logger.getLogger(Institute_Dao.class);


		//register
		public static int register_institute(final Institute i) throws DBFWException  {
			
			ConnectionHolder ch=null;
			Connection con=null;
			int result=0;
			
			try {
				
				ch=ConnectionHolder.getInstance();
				con=ch.getConnection();
				
				final ParamMapper REGISTERINSTITUTE= new ParamMapper() {
					
					@Override
					public void mapParams(PreparedStatement pStmt) throws SQLException {
						
						pStmt.setString(1, i.getInstitute_Id());
						pStmt.setString(2,i.getInstitute_Name());
						pStmt.setString(3, i.getAffiliation_Date());
						pStmt.setString(4,i.getAddress());
						pStmt.setInt(5,i.getNumber_of_Seats());
						pStmt.setInt(6, i.getNumber_of_Course());
						pStmt.setString(7, i.getPassword());
						
					}
				};
				
				//statement execution
				result=DBHelper.executeUpdate(con, SQLMapper.INSERTINSTITUTE, REGISTERINSTITUTE);
				
			}catch(DBConnectionException e) {
				System.out.println(e);
			}
			
			return result;
			
		}
		
		public boolean validateUser(final String Institute_Id) throws DAOAppException {
			ConnectionHolder ch = null;
			Connection con = null;
			List users = null;

			ParamMapper paramMapper = new ParamMapper() {

				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					pStmt.setString(1, Institute_Id);
				}
			};
			try {
				ch = ConnectionHolder.getInstance();
				con = ch.getConnection();
				users = DBHelper.executeSelect(con, SQLMapper.VALIDATEINSTITUTE,SQLMapper.VALIDATEINSTITUTEDETAILSOUTMAPPER,paramMapper);

			} catch (DBConnectionException e) {
				throw new DAOAppException(e);
			} catch (DBFWException e) {
				throw new DAOAppException(e);
			}

			return (users != null && users.size() > 0);

		}
		
		
	//login
		public static List login_institute(final String Institute_Name,final String Password) throws DBFWException  {
			
			ConnectionHolder ch=null;
			Connection con=null;
			List list=null;
			
			try {
				
				ch=ConnectionHolder.getInstance();
				con=ch.getConnection();
				
				final ParamMapper LOGININSTITUTE= new ParamMapper() {
					

					@Override
					public void mapParams(PreparedStatement pStmt) throws SQLException {
						
						pStmt.setString(1, Institute_Name);
						pStmt.setString(2, Password);
						
					}
				};
				
				//statement execution
				list=DBHelper.executeSelect(con,SQLMapper.FETCHlOGININSTITUTE,SQLMapper.FETCHINSTITUTEOUTMAPER,LOGININSTITUTE);			
			}catch(DBConnectionException e) {
				System.out.println(e);
			}
			
			return list;
			
		}

	//delete
		public static int delete_institute( Delete i) throws DBFWException{
			
			ConnectionHolder ch=null;
			Connection con=null;
			int result=0;
			try {
				
				ch=ConnectionHolder.getInstance();
				con=ch.getConnection();
				
				final ParamMapper DELETEINSTITUTE=new ParamMapper() {
					
					@Override
					public void mapParams(PreparedStatement pStmt) throws SQLException {

						pStmt.setString(1, i.getInstitute_Id());						
					}
			
				};
				
				result=DBHelper.executeUpdate(con, SQLMapper.OPERATIONADMINDELETE,DELETEINSTITUTE);
				
			}catch(DBConnectionException e) {
				System.out.println(e);
			}
			return result;
		}
		
	//Update Institute
		public static int update_institute( String Institute_Id, int Number_Of_Course) throws DBFWException{
			
			ConnectionHolder ch=null;
			Connection con=null;
			int result=0;
			try {
				
				ch=ConnectionHolder.getInstance();
				con=ch.getConnection();
				
				final ParamMapper UPDATEINSTITUTE=new ParamMapper() {
				@Override
					public void mapParams(PreparedStatement pStmt) throws SQLException {
					
					pStmt.setInt(1,Number_Of_Course);
					pStmt.setString(2,Institute_Id);
										
					}
			
				};
				
				result=DBHelper.executeUpdate(con, SQLMapper.OPERATIONINSTITUTEUPDATE,UPDATEINSTITUTE);
				
			}catch(DBConnectionException e) {
				System.out.println(e);
			}
			return result;
		}

		public boolean validateDelete(final String Institute_Id) throws DAOAppException {
			ConnectionHolder ch = null;
			Connection con = null;
			List users = null;

			ParamMapper paramMapper = new ParamMapper() {

				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					pStmt.setString(1, Institute_Id);
				}
			};
			try {
				ch = ConnectionHolder.getInstance();
				con = ch.getConnection();
				users = DBHelper.executeSelect(con, SQLMapper.VALIDATEDELETE,SQLMapper.VALIDATEDELETEOUTMAPPER,paramMapper);

			} catch (DBConnectionException e) {
				throw new DAOAppException(e);
			} catch (DBFWException e) {
				throw new DAOAppException(e);
			}

			return (users != null && users.size() > 0);

		}
		
		public boolean validateProfile(final int Number_of_Course) throws DAOAppException {
			ConnectionHolder ch = null;
			Connection con = null;
			List users = null;

			ParamMapper paramMapper = new ParamMapper() {

				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					pStmt.setInt(1, Number_of_Course);
				}
			};
			try {
				ch = ConnectionHolder.getInstance();
				con = ch.getConnection();
				users = DBHelper.executeSelect(con, SQLMapper.VALIDATEPROFILE,SQLMapper.VALIDATEPROFILEOUTMAPPER,paramMapper);

			} catch (DBConnectionException e) {
				throw new DAOAppException(e);
			} catch (DBFWException e) {
				throw new DAOAppException(e);
			}

			return (users != null && users.size() > 0);

		}

		public static int update_institute(Institute i) {
			// TODO Auto-generated method stub
			return 0;
		}

		public static int delete_institute(String string) {
			// TODO Auto-generated method stub
			return 0;
		}
		
}
