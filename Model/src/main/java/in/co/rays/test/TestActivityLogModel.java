package in.co.rays.test;

import java.text.SimpleDateFormat;

import in.co.rays.bean.ActivityLogBean;
import in.co.rays.model.ActivityLogModel;

public class TestActivityLogModel {

	public static void main(String[] args) {
		
//		testAdd();
//		testUpdate();
//		testDelete();
		testSearch();

	}
	
	public static void testAdd() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ActivityLogBean bean = new ActivityLogBean();
		ActivityLogModel model = new ActivityLogModel();
		
		try {
			bean.setActivityId(2);
			bean.setActivityName("Dance");
			bean.setPerformedBy("Dancer");
			bean.setActivityTime(sdf.parse("2026-02-10"));
			bean.setActivityStatus("Coming Soon");
			
			model.add(bean);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testUpdate() {
		
		ActivityLogBean bean = new ActivityLogBean();
		ActivityLogModel model = new ActivityLogModel();
		
		bean.setActivityName("Cricket");
		bean.setActivityId(1);
		
		model.update(bean);
		
	}
	
   public static void testDelete() {
		
		ActivityLogBean bean = new ActivityLogBean();
		ActivityLogModel model = new ActivityLogModel();
		
		bean.setActivityId(1);
		
		model.delete(bean);
		
	}
   
   public static void testSearch() {
	   ActivityLogModel model = new ActivityLogModel();
	   
	   model.search();
	   
   }

}
