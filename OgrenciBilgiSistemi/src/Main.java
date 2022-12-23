
public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Naim","5325224141","TRH");
		Teacher t2 = new Teacher("Graham Bell", "0000", "FZK");
		Teacher t3 = new Teacher("Fatih","53493823","MAT");
		
		Course tarih = new Course("Tarih","101","TRH");
		Course matematik = new Course("Matematik","1001","MAT");
		Course fizik = new Course("Fizik","4004","FZK");
		
		tarih.addTeacher(t1);
		fizik.addTeacher(t2);
		matematik.addTeacher(t3);
		
		Student s1 = new Student("Görkem","6020","11",matematik, fizik,tarih);
		s1.sinavNotlariniEkle(50, 60, 70);
		s1.sozluNotlariniEkle(30, 70, 50);
		s1.gectiMi();
		System.out.println("----------------------------");
		
		Student s2 = new Student("Pınar","777","12",matematik,fizik,tarih);
		s2.sinavNotlariniEkle(100, 99, 99);
		s2.sozluNotlariniEkle(100, 100, 100);
		s2.gectiMi();
		
	}

}
