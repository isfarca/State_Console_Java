package headfirst.state.kaugummizustandgewinn;

public class KeineMuenzeZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public KeineMuenzeZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
 
	public void m�nzeEinwerfen() {
		System.out.println("Sie haben eine M�nze eingeworfen");
		kaugummiAutomat.setZustand(kaugummiAutomat.getHatM�nzeZustand());
	}
 
	public void m�nzeAuswerfen() {
		System.out.println("Sie haben keine M�nze eingeworfen");
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben gedreht, aber es ist keine M�nze da");
	 }
 
	public void kugelAuswerfen() {
		System.out.println("Sie m�ssen zuerst bezahlen");
	} 
 
	public String toString() {
		return "bereit f�r M�nzeinwurf";
	}
}
