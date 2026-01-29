package in.co.rays.test;

import java.sql.SQLException;

import in.co.rays.bean.AddressBean;
import in.co.rays.model.AddressModel;

public class TestAddressModel {
	
	public static AddressModel model = new AddressModel();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		testAdd();
//		testUpdate();
//		testDelete();
//		testSearch();

	}
	
	public static void testAdd() throws ClassNotFoundException, SQLException {
		AddressBean bean = new AddressBean();
		
		bean.setAddressId(1);
		bean.setPersonName("Aditya Sharma");
		bean.setCity("Bhopal");
		bean.setState("MP");
		bean.setPincode("461223");
		
		model.Add(bean);
	}
	
	public static void testUpdate() throws ClassNotFoundException, SQLException {
		AddressBean bean = new AddressBean();
		
		bean.setAddressId(1);
//		bean.setPersonName("Aditya Sharma");
		bean.setCity("Indore");
//		bean.setState("MP");
//		bean.setPincode("461223");
		
		model.Update(bean);
	}
	
	public static void testDelete() throws ClassNotFoundException, SQLException {
//		
		
		model.Delete(1);
	}
	
	public static void testSearch() throws ClassNotFoundException, SQLException {
		model.Search();
	}

}
