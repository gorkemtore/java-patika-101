
public class Fighter {
	String isim;
	int hasar;
	int can;
	int agirlik;
	int dodge;
	
	Fighter(String isim, int hasar, int can, int agirlik, int bloklamaSansi){
		
		this.isim = isim;
		this.hasar = hasar;
		this.can = can;
		this.agirlik = agirlik;	
		if (dodge>=0 && dodge<=100) {
			this.dodge = bloklamaSansi;
		}else {
			this.dodge = 0;
		}
		
	}
	
	int hit(Fighter foe) {//foe rakip-karşıt demek
		System.out.println(this.isim + " => " + foe.isim+" "+this.hasar+ " hasar vurdu.");
		if(foe.isDodge()) {
			System.out.println(foe.isim+" gelen hasarı blokladı!");
			return foe.can;
		}
		if(foe.can - this.hasar <0) {
			return 0;
		}
		
		return foe.can - this.hasar;
	}

	boolean isDodge() {
		double randomNumber = Math.random() * 100;
		return randomNumber <= this.dodge;
	}
}
