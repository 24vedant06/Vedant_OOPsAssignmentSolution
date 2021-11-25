import java.util.*;


public class Main {

	public static void main(String[] args) {
		admin a = new admin();
		Hr h = new Hr();
		Tech t = new Tech();
		
		a.departmentName();
		a.getTodaysWork();
		a.getWorkDeadline();
		a.isTodayAHoliday();
		
		System.out.println("");
		
		h.departmentName();
		h.doActivity();
		h.getTodaysWork();
		h.getWorkDeadline();
		h.isTodayAHoliday();
		
		System.out.println("");
		
		t.departmentName();
		t.getTodaysWork();
		t.getWorkDeadline();
		t.getTechStackInformation();
		t.isTodayAHoliday();
		
	}

}