package testcase;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.keane.dbfw.DBFWException;
import com.keane.training.dao.Institute_Dao;
import com.keane.training.dao.Student_Dao;

public class Student_Testing {

	@Test
	public void testLogin_student() throws DBFWException {
		List result=Student_Dao.login_student("11");
		assertTrue(result);
	}

	private void assertTrue(List result) {
		// TODO Auto-generated method stub
		
	}
   @Test
   public void testUpdate_student() throws DBFWException {
	   int result=Student_Dao.update_student("12",770853625);
	   assertEquals(1,result);
}
}