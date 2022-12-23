public class Employee {
	String name;
	double salary;
	int workHours;
	int startYear;
	
	Employee(String name, double salary, int workHours, int hireYear){
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.startYear = hireYear;
		
	}
	
	double tax(){
		//calculate tax!
		if(this.salary <0) {
			System.out.println("Salary can not be less than zero!");
		}else {
			
			if(this.salary>=1000) {
				return this.salary*0.03;
			}	
		}
		return 0;			
	}
	
	double bonus() {
		if(this.workHours>40) {
			return (this.workHours-40) * 30;
		}
		return 0;
	}
	
	double raiseSalary() {
		int currentYear =2022;
		if (currentYear- this.startYear < 10) {
			
			return this.salary*0.05;

		}else if(currentYear - this.startYear >= 10 && currentYear - this.startYear<20) {
			
			return this.salary*0.10;		
			
		}else if(currentYear - this.startYear >=20) {
			
			return this.salary*0.15;	
			
		}else {
			System.out.println("Out of range!");
			return 0;
		}
	}
	
	void printInfo() {
		//print what is known about employee
		System.out.println("Employee name : "+this.name);
		System.out.println("Salary : "+this.salary);
		System.out.println("Work Hours : "+this.workHours);
		System.out.println("Start Year : "+this.startYear);
		System.out.println("Tax : "+this.tax());
		System.out.println("Bonus : "+this.bonus());
		System.out.println("Salary Increase : "+this.raiseSalary());
		double totalSalary = this.salary + this.bonus() + this.raiseSalary() - this.tax();
		System.out.println("Salary with Taxes and Bonuses : "+(this.salary + this.bonus()-this.tax()));
		System.out.println("Total Salary : "+totalSalary);

	}
	
	
}
