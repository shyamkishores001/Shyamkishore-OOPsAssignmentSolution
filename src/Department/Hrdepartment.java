package Department;

public class Hrdepartment extends superdepartment{
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	public String departmentName() {
		return "Hr Department ";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}
