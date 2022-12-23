public class Match {
	Fighter f1;
	Fighter f2;
	int minKilo;
	int maksKllo;
	
	Match(Fighter f1, Fighter f2, int minKilo, int maksKilo){
		this.f1 = f1;
		this.f2 = f2;
		this.maksKllo = maksKilo;
		this.minKilo = minKilo;
	}
	
	Fighter ilkVurus() {
		double sans = Math.random() * 100;
		if(sans >50) {
			return this.f2;
		}else
			return this.f1;
	}
	
	
	boolean isCheck() {
		return (this.f1.agirlik >= minKilo && this.f1.agirlik <= maksKllo)&&
				(this.f2.agirlik >= minKilo && this.f2.agirlik <= maksKllo);
	}
	
	boolean isWin() {
		if(this.f1.can==0) {
			System.out.println(f2.isim + " kazandı! ");
			return true;
		}
		if(this.f2.can == 0) {
			System.out.println(f1.isim + " kazandı! ");
			return true;
		}
	
		
		return false;
		
	}
	
	void run()
	{
		if(isCheck()){
			
			while(this.f1.can >0 && this.f2.can>0) {
				System.out.println("---------YENİ ROUND----------");
				
				
				if(ilkVurus()==f1) {
					System.out.println("İlk vuruş sırası : "+f1.isim+" adlı dövüşçüde!");
					this.f1.can = this.f1.hit(this.f2);
					if (isWin()) {
						break;
					}
					
					this.f1.can = this.f2.hit(this.f1);
					if(isWin()) {
						break;
					}
				}else {
					System.out.println("İlk vuruş sırası : "+f2.isim+" adlı dövüşçüde!");
					this.f2.can = this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
					
					this.f2.can = this.f1.hit(this.f2);
					if(isWin()) {
						break;
					}
				}
				
				System.out.println();
				System.out.println(this.f1.isim+"'in kalan canı: "+this.f1.can);
				System.out.println(this.f2.isim+"'in kalan canı: "+this.f2.can);
				System.out.println();
								
			}
			
		}else {
			System.out.println("Sporcuların sikletleri uymuyor.");
		}
	}
	
	
	
	
}
