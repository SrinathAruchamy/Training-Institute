package testcase;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.training.dao.Admin_Dao;
import com.keane.training.dao.Approve_Dao;
import com.keane.training.dao.Institute_Dao;

public class Admin_Testing {

	@Test
	public void test_adminlogin()throws DBFWException,DBConnectionException {
		List result=Admin_Dao.login_admin("A1","dharma4");
		assertEquals(1,result);
	}
private void assertEquals(int i,List result) {
	// TODO Auto-generated method stub
}

   @Test
   public void test_approve()throws DBFWException{
	   int result=Approve_Dao.approve_institute("Approved");
	   assertEquals(1,result);
   }
private void assertEquals(int i,int result) {
	// TODO Auto-generated method stub
}
@Test
public void test_delete()throws DBFWException{
	   int result=Institute_Dao.delete_institute("lt12");
	   assertEquals(1,result);
}
}