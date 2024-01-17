package testcase;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.keane.dbfw.DBFWException;
import com.keane.training.dao.Admin_Dao;
import com.keane.training.dao.Institute_Dao;

public class Institute_Test {

	@Test
	public void testInstitute_login() throws DBFWException{
		List result=Institute_Dao.login_institute("MCET","mcet");
		assertTrue(result);
	}

	private void assertTrue(List result) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testUpdateInstitute() throws DBFWException
	{
	int result=Institute_Dao.update_institute("1", 500);
	assertEquals(1,result);

}
	
}