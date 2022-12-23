public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name, double salary, int workHours, int hireYear){
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
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
		if (currentYear- this.hireYear < 10) {
			
			return this.salary*0.05;

		}else if(currentYear - this.hireYear >= 10 && currentYear - this.hireYear<20) {
			
			return this.salary*0.10;		
			
		}else if(currentYear - this.hireYear >=20) {
			
			return this.salary*0.15;	
			
		}else {
			System.out.println("Out of range!");
			return 0;
		}
	}
	
	void printInfo() {
		//print what is known about employee
		System.out.println("Adı : "+this.name);
		System.out.println("Maaşı : "+this.salary);
		System.out.println("Çalışma Saati : "+this.workHours);
		System.out.println("Başlangıç Yılı : "+this.hireYear);
		System.out.println("Vergi : "+this.tax());
		System.out.println("Bonus : "+this.bonus());
		System.out.println("Maaş artışı : "+this.raiseSalary());
		double totalSalary = this.salary + this.bonus() + this.raiseSalary() - this.tax();
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+(this.salary + this.bonus()-this.tax()));
		System.out.println("Toplam maaş : "+totalSalary);

	}
	
	
}
