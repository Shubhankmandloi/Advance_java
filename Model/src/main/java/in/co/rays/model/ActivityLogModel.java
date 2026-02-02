package in.co.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.rays.bean.ActivityLogBean;
import in.co.rays.util.JDBCDataSource;

public class ActivityLogModel {
	
	public void add(ActivityLogBean bean) {
		
		Connection con = null;
		
		try {
			con = JDBCDataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into ActivityLog values(?,?,?,?,?)");
			ps.setLong(1, bean.getActivityId());
			ps.setString(2, bean.getActivityName());
			ps.setString(3, bean.getPerformedBy());
			ps.setDate(4, new java.sql.Date(bean.getActivityTime().getTime()));
			ps.setString(5, bean.getActivityStatus());
			
			int a = ps.executeUpdate();
			
			if(a>0)
				System.out.println("Data Insertion Success ....");
			else
				System.out.println("Data Insertion Failed ....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
   public void update(ActivityLogBean bean) {
		
		Connection con = null;
		
		try {
			con = JDBCDataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("update ActivityLog set activityName = ? where activityId = ? ");

			ps.setString(1, bean.getActivityName());
			ps.setLong(2, bean.getActivityId());
			
			int a = ps.executeUpdate();
			
			if(a>0)
				System.out.println("Data Updation Success ....");
			else
				System.out.println("Data Updation Failed ....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   
   public void delete(ActivityLogBean bean) {
		
		Connection con = null;
		
		try {
			con = JDBCDataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from ActivityLog where activityId = ?");

			ps.setLong(1, bean.getActivityId());
			
			int a = ps.executeUpdate();
			
			if(a>0)
				System.out.println("Data Deletion Success ....");
			else
				System.out.println("Data Deletion Failed ....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   
   public void search() {
	   Connection con = null;
	   
	   try {
		   con = JDBCDataSource.getConnection();
		   PreparedStatement ps = con.prepareStatement("select * from ActivityLog");
		   
		   ResultSet rs = ps.executeQuery();
		   
		   while(rs.next()) {
			   System.out.println(rs.getLong(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getDate(4)+" : "+rs.getString(5));
		   }
		   
		   
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	   
	   
   }

}
