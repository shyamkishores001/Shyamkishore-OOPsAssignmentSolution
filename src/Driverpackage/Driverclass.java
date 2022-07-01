package Driverpackage;

import Department.superdepartment;
import Department.Hrdepartment;
import Department.Admindepartment;
import Department.Techdepartment;

public class Driverclass {

	public static void main(String[] args) {
		Hrdepartment hr = new Hrdepartment();
		Admindepartment admin = new Admindepartment();
		Techdepartment tech = new Techdepartment();
		
		System.out.println("\nWelcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());
        
        System.out.println("\nWelcome to "+hr.departmentName());
        System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());
        
        System.out.println("\nWelcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
        
        
        
	}

}
