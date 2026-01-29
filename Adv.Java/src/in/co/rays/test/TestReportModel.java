package in.co.rays.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import in.co.rays.bean.AddressBean;
import in.co.rays.bean.ReportBean;
import in.co.rays.model.ReportModel;

public class TestReportModel {
	
	public static ReportModel model = new ReportModel();

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		
		testAdd();
//		testUpdate();
//		testDelete();
//		testSearch();
		
	}
	
	public static void testAdd() throws ClassNotFoundException, SQLException, ParseException {
		ReportBean bean = new ReportBean();
		ReportModel model = new ReportModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setReportId(1);
		bean.setReportName("UDAY DABI");
		bean.setGeneratedDate(sdf.parse("2005-10-30"));
		bean.setGeneratedBy("New");
		bean.setReportStatus("Done");

		model.Add(bean);
	}

	public static void testUpdate() throws ClassNotFoundException, SQLException {
		ReportBean bean = new ReportBean();

		bean.setReportId(1);
//		bean.setPersonName("Aditya Sharma");
		bean.setReportName("Indore");
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
