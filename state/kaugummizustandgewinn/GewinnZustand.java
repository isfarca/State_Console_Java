package headfirst.state.kaugummizustandgewinn;

public class GewinnZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public GewinnZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
 
	public void m�nzeEinwerfen() {
		System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
	}
 
	public void m�nzeAuswerfen() {
		System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
	}
 
	public void griffDrehen() {
		System.out.println("Auch wenn Sie zweimal drehen, bekommen Sie keine zweite Kugel");
	}
 
	public void kugelAuswerfen() {
		System.out.println("SIE HABEN GEWONNEN! Sie bekommen zwei Kugeln f�r Ihr Geld");
		kaugummiAutomat.kugelFreigeben();
		if (kaugummiAutomat.getAnzahl() == 0) {
			kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
		} else {
			kaugummiAutomat.kugelFreigeben();
			if (kaugummiAutomat.getAnzahl() > 0) {
				kaugummiAutomat.setZustand(kaugummiAutomat.getKeineM�nzeZustand());
			} else {
            	System.out.println("Hoppla, keine Kugeln da!");
				kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
			}
		}
	}
 
	public String toString() {
		return "gibt zwei Kugeln aus, denn SIE HABEN GEWONNEN!";
	}
}
