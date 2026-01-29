package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import in.co.rays.bean.ReportBean;

public class ReportModel {
	
	public void Add(ReportBean bean) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into report values(?,?,?,?,?)");
		ps.setLong(1, bean.getReportId());
		ps.setString(2, bean.getReportName());
		ps.setDate(3, new java.sql.Date(bean.getGeneratedDate().getTime()));
		ps.setString(4, bean.getGeneratedBy());
		ps.setString(5, bean.getReportStatus());

		int a = ps.executeUpdate();

		if (a > 0)
			System.out.println("Data Inserted Success ...");
		else
			System.out.println("Data Insertion Failed ...");

	}

	public void Update(ReportBean bean) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
		PreparedStatement ps = con.prepareStatement("update report set reportName = ? where reportId = ?");
		ps.setString(1, bean.getReportName());
		ps.setLong(2, bean.getReportId());

		int a = ps.executeUpdate();

		if (a > 0)
			System.out.println("Data Updated Success ...");
		else
			System.out.println("Data Updation Failed ...");

	}

	public void Delete(long id) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from report where reportId = ?");
		ps.setLong(1, id);

		int a = ps.executeUpdate();

		if (a > 0)
			System.out.println("Data Deleted Success ...");
		else
			System.out.println("Data Deletion Failed ...");

	}

	public void Search() throws ClassNotFoundException, SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from report");

			ResultSet rs = ps.executeQuery();
			System.out.println(rs.next());
			while (rs.next()) {
				System.out.println("lkjhgfdghjkl");
				System.out.println(rs.getLong(1) + " : " + rs.getString(2) + " : " + rs.getDate(3) + " : "
						+ rs.getString(4) + " : " + rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
