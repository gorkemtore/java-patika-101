
public class Course {
	//Niteliklerde bir sınıf varsa en üste yazılır.
	Teacher teacher;
	
	String dersAdi;
	String kod;
	String dersKisaltmasi;//==Öğretmenin branşı
	int not;
	int sozlu;
	
	Course(String dersAdi, String kod, String dersKisaltmasi){
		this.dersAdi = dersAdi;
		this.kod = kod;
		this.dersKisaltmasi = dersKisaltmasi;
		int not = 0;
		int sozlu=0;
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.brans == this.dersKisaltmasi){
			this.teacher=teacher;
		}else {
			System.out.println(this.dersKisaltmasi+" dersine "+teacher.brans+ " öğretmeni atayamazsınız.");
		}
		
	}
	
	void printTeacher() {
		this.teacher.print();
	}
	
}


