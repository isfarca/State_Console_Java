package headfirst.state.kaugummizustand;

public class VerkauftZustand implements Zustand {
 
    KaugummiAutomat kaugummiAutomat;
 
    public VerkauftZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
       
	public void m�nzeEinwerfen() {
		System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
	}
 
	public void m�nzeAuswerfen() {
		System.out.println("Zu sp�t, leider haben Sie den Griff schon gedreht");
	}
 
	public void griffDrehen() {
		System.out.println("Auch wenn Sie zweimal drehen, bekommen Sie keine zweite Kugel");
	}
 
	public void kugelAusgeben() {
		kaugummiAutomat.kugelFreigeben();
		if (kaugummiAutomat.getAnzahl() > 0) {
			kaugummiAutomat.setZustand(kaugummiAutomat.getKeineM�nzeZustand());
		} else {
			System.out.println("Hoppla, keine Kugeln da!");
			kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
		}
	}
 
	public String toString() {
		return "gibt Kugel aus";
	}
}


