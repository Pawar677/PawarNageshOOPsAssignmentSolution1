
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment A = new  AdminDepartment();//Object created to access AdminDepartment class
		HrDepartment H = new HrDepartment(); // Object created to access HrDepartment class
		TechDepartment T = new TechDepartment();//Object created to access TechDepartment class
		
	    A.departmentName();
	    A.getTodaysWork();
	    A.getWorkDeadline();
	    A.isTodayAHoliday();
	    System.out.println("");
	    
	    H.departmentName();
	    H.getTodaysWork();
	    H.getWorkDeadline();
	    H.isTodayAHoliday();
	    System.out.println("");
	    
	    T.departmentName();
	    T.getTodaysWork();
	    T.getWorkDeadline();
	    T.isTodayAHoliday();



	}

}
