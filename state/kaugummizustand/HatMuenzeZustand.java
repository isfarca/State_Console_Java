package headfirst.state.kaugummizustand;

public class HatMuenzeZustand implements Zustand {
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
		kaugummiAutomat.setZustand(kaugummiAutomat.getVerkauftZustand());
	}

    public void kugelAusgeben() {
        System.out.println("Es wird keine Kugel ausgegeben");
    }
 
	public String toString() {
		return "bereit f�r Drehen des Griffs";
	}
}
