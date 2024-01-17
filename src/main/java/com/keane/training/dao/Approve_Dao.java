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
import com.keane.training.domain.Approval;

public class Approve_Dao {
	
	//approve institute 
			public static int approve_institute(Approval ap) throws DBFWException{
				
				ConnectionHolder ch=null;
				Connection con=null;
				int result=0;
				try {
					
					ch=ConnectionHolder.getInstance();
					con=ch.getConnection();
					
					final ParamMapper UPDATEINSTITUTE=new ParamMapper() {
						
						@Override
						public void mapParams(PreparedStatement pStmt) throws SQLException {

							pStmt.setString(1, ap.getApproval_Status());
							pStmt.setString(2, ap.getInstitute_Id());
							
						}
				
					};
					
					result=DBHelper.executeUpdate(con, SQLMapper.OPERATIONADMINAPPROVE,UPDATEINSTITUTE);
					
				}catch(DBConnectionException e) {
					System.out.println(e);
				}
				return result;
			}
			
			public boolean validateUser(final String Approval_Status) throws DAOAppException {
				ConnectionHolder ch = null;
				Connection con = null;
				List users = null;

				ParamMapper paramMapper = new ParamMapper() {

					@Override
					public void mapParams(PreparedStatement pStmt) throws SQLException {
						pStmt.setString(1,Approval_Status);
					}
				};
				try {
					ch = ConnectionHolder.getInstance();
					con = ch.getConnection();
					users = DBHelper.executeSelect(con, SQLMapper.VALIDATEAPPROVE,SQLMapper.VALIDATEAPPROVEOUTMAPPER,paramMapper);

				} catch (DBConnectionException e) {
					throw new DAOAppException(e);
				} catch (DBFWException e) {
					throw new DAOAppException(e);
				}

				return (users != null && users.size() > 0);

			}

			public static int approve_institute(String string) {
				// TODO Auto-generated method stub
				return 0;
			}
}
