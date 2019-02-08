package headfirst.state.kaugummizustand;

public class AusverkauftZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public AusverkauftZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
 
	public void m�nzeEinwerfen() {
		System.out.println("Sie k�nnen keine M�nze einwerfen, Automat ist ausverkauft");
	}
 
	public void m�nzeAuswerfen() {
		System.out.println("Auswurf nicht m�glich, Sie haben keine M�nze eingeworfen");
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben gedreht, aber es sind keine Kugeln da");
	}
 
	public void kugelAusgeben() {
		System.out.println("Es wird keine Kugel ausgegeben");
	}
 
	public String toString() {
		return "ausverkauft";
	}
}
