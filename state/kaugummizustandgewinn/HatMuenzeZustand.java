package headfirst.state.kaugummizustandgewinn;

import java.util.Random;

public class HatMuenzeZustand implements Zustand {
	Random randomGewinn = new Random(System.currentTimeMillis());
	KaugummiAutomat kaugummiAutomat;
 
	public HatMuenzeZustand(KaugummiAutomat kaugummiAutomat) {
		this.kaugummiAutomat = kaugummiAutomat;
	}
  
	public void m�nzeEinwerfen() {
		System.out.println("Sie k�nnen keine weitere M�nze einwerfen");
	}
 
	public void m�nzeAuswerfen() {
		System.out.println("M�nze wird zur�ckgegeben");
		kaugummiAutomat.setZustand(kaugummiAutomat.getKeineM�nzeZustand());
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben den Griff gedreht ...");
		int gewinn = randomGewinn.nextInt(10);
		if ((gewinn == 0) && (kaugummiAutomat.getAnzahl() > 1)) {
			kaugummiAutomat.setZustand(kaugummiAutomat.getGewinnZustand());
		} else {
			kaugummiAutomat.setZustand(kaugummiAutomat.getVerkauftZustand());
		}
	}

    public void kugelAuswerfen() {
        System.out.println("Es wird keine Kugel ausgegeben");
    }
 
	public String toString() {
		return "bereit f�r Drehen des Griffs";
	}
}
