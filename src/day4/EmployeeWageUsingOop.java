package day4;

public class EmployeeWageUsingOop {

	static void message() {
		System.out.println("Welcome to Employee Wage Computation Program");
	}

	static double fullTimeHour = 8;
	static double partTimeHour = 4;
	static double wagePerHour = 20;
	static double workingDaysInMonth = 20;
	static double maxWorkingHoursInMonth = 100;

	static void attendence() {
		int IS_PRESENT = 1;
		double attendenceCheck = Math.floor(Math.random() * 10) % 2;
		if (attendenceCheck == IS_PRESENT) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	static void fullTimeEmployeeWage() {
		double fullTimeEmployeeWagePerDay;
		fullTimeEmployeeWagePerDay = wagePerHour * fullTimeHour;
		double fullTimeEmployeeWagePerMonth;
		fullTimeEmployeeWagePerMonth = fullTimeEmployeeWagePerDay * workingDaysInMonth;
		System.out.println("Fulltime Working Employee");
		System.out.println("Daily Wage for Full Time Employee is " + fullTimeEmployeeWagePerDay);
		System.out.println("Monthly Wage for Full Time Employee is " + fullTimeEmployeeWagePerMonth);
	}

	static void partTimeEmployeeWage() {
		double partTimeEmployeeWagePerDay;
		partTimeEmployeeWagePerDay = wagePerHour * partTimeHour;
		double partTimeEmployeeWagePerMonth;
		partTimeEmployeeWagePerMonth = partTimeEmployeeWagePerDay * workingDaysInMonth;
		System.out.println("Parttime Working Employee");
		System.out.println("Daily Wage for a Part Time Employee is " + partTimeEmployeeWagePerDay);
		System.out.println("Monthly Wage for Part Time Employee is " + partTimeEmployeeWagePerMonth);
	}

	static void employeeWageUsingSwitch() {
		double employeeCheck;
		employeeCheck = Math.floor(Math.random() * 10) % 2;
		switch ((int) employeeCheck) {
		case 0:
			fullTimeEmployeeWage();
			break;
		case 1:
			partTimeEmployeeWage();
			break;
		}
	}

	static void employeeWage() {
		int IS_PRESENT = 1;
		double attendenceCheck = Math.floor(Math.random() * 10) % 2;
		if (attendenceCheck == IS_PRESENT) {
			employeeWageUsingSwitch();
		} else {
			System.out.println("Employee is Absent");
		}
	}
	
	static void wagesTillCondition() {
		int empHours = 0, totalEmpHours = 0, totalWorkingDays = 0;

		while (totalEmpHours <= maxWorkingHoursInMonth && totalWorkingDays < workingDaysInMonth) {
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
				case 1:
					empHours = 4;
					break;
				case 2:
					empHours = 8;
					break;
				default:
					empHours = 0;
			}
			totalEmpHours += empHours;
			System.out.println("Day: " + totalWorkingDays + " Employee Hours: "+ empHours);
		}
		double totalEmpWage = totalEmpHours * wagePerHour;
		System.out.println("Total employee wage: " + totalEmpWage);
	}


	public static void main(String[] args) {
		message();
		employeeWage();
		wagesTillCondition();
	}
}
