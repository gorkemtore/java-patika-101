
public class Teacher {
	String isim;
	String telefon;
	String brans;
	
	Teacher(String isim, String telefon, String brans){
		this.isim = isim;
		this.telefon = telefon;
		this.brans = brans;
		
	}
	
	void print() {
		System.out.println("Adı : "+this.isim);
		System.out.println("Telefonu : "+this.telefon);
		System.out.println("Branşı : "+this.brans);
	}
}
