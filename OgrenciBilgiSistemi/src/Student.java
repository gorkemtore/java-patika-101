
public class Student {
	Course c1;
	Course c2;
	Course c3;
	
	String isim;
	String ogrNo;
	String sinif;
	double ortalama;
	
	Student(String isim, String ogrNo, String sinif, Course c1, Course c2, Course c3){
		c1.sozlu=0;
		c2.sozlu=0;
		c3.sozlu=0;
		c1.not=0;
		c2.not=0;
		c3.not=0;
		
		this.isim = isim;
		this.sinif=sinif;
		this.ogrNo = ogrNo;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		
		this.ortalama=0.0;
	}
	
	public void sinavNotlariniEkle(int c1, int c2, int c3) {
		
		if (c1>=0 && c1 <=100) {
			this.c1.not = c1;
		}
		if(c2>=0 && c2 <=100)
			this.c2.not = c2;
		if(c3>=0 && c3<=100)
			this.c3.not=c3;
		
	}
	
	public void sozluNotlariniEkle(int c1, int c2, int c3) {
			
			if (c1>=0 && c1 <=100) {
				this.c1.sozlu = c1;
			}
			if(c2>=0 && c2 <=100)
				this.c2.sozlu = c2;
			if(c3>=0 && c3<=100)
				this.c3.sozlu=c3;
			
		}
	
	void printNote() {
		System.out.println(c1.dersAdi + " sınav notu\t: "+c1.not);
		System.out.println(c2.dersAdi + " sınav notu\t: "+c2.not);
		System.out.println(c3.dersAdi + " sınav notu\t: "+c3.not);
		System.out.println(c1.dersAdi + " sozlu notu\t: "+c1.sozlu);
		System.out.println(c2.dersAdi + " sozlu notu\t: "+c2.sozlu);
		System.out.println(c3.dersAdi + " sozlu notu\t: "+c3.sozlu);
		
	}
	

	void gectiMi() {
		this.ortalama = (((this.c1.not+this.c2.not+this.c3.not)/3.0*0.8))+(((this.c1.sozlu+this.c2.sozlu+this.c3.sozlu)/3.0*0.2));
		
		
		printNote();
		System.out.println(this.ortalama >55 ? "\n"+this.isim+  " geçti. ":"\n"+this.isim+" kaldı. ");
		System.out.println("Ortalama : "+this.ortalama);
	}
}
