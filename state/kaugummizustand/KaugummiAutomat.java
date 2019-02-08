package headfirst.state.kaugummizustand;

public class KaugummiAutomat {
 
	Zustand ausverkauftZustand;
	Zustand keineM�nzeZustand;
	Zustand hatM�nzeZustand;
	Zustand verkauftZustand;
 
	Zustand zustand = ausverkauftZustand;
	int anzahl = 0;
 
	public KaugummiAutomat(int anzahlKugeln) {
		ausverkauftZustand = new AusverkauftZustand(this);
		keineM�nzeZustand = new KeineMuenzeZustand(this);
		hatM�nzeZustand = new HatMuenzeZustand(this);
		verkauftZustand = new VerkauftZustand(this);

		this.anzahl = anzahlKugeln;
 		if (anzahlKugeln > 0) {
			zustand = keineM�nzeZustand;
		} 
	}
 
	public void m�nzeEinwerfen() {
		zustand.m�nzeEinwerfen();
	}
 
	public void m�nzeAuswerfen() {
		zustand.m�nzeAuswerfen();
	}
 
	public void griffDrehen() {
		zustand.griffDrehen();
		zustand.kugelAusgeben();
	}

	void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}
 
	void kugelFreigeben() {
		System.out.println("Eine Kugel rollt aus dem Ausgabeschacht");
		if (anzahl != 0) {
			anzahl = anzahl - 1;
		}
	}
 
	int getAnzahl() {
		return anzahl;
	}
 
	void auff�llen(int anzahl) {
		this.anzahl = anzahl;
		zustand = keineM�nzeZustand;
	}

    public Zustand getZustand() {
        return zustand;
    }

    public Zustand getAusverkauftZustand() {
        return ausverkauftZustand;
    }

    public Zustand getKeineM�nzeZustand() {
        return keineM�nzeZustand;
    }

    public Zustand getHatM�nzeZustand() {
        return hatM�nzeZustand;
    }

    public Zustand getVerkauftZustand() {
        return verkauftZustand;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nKaukugel & Co KG");
		result.append("\nJava-gest�tzter Kaugummi-Standautomat Modell Nr. 2005");
		result.append("\nBestand: " + anzahl + " Kaugummikugel");
		if (anzahl != 1) {
			result.append("n");
		}
		result.append("\n");
		result.append("Automat " + zustand + "\n");
		return result.toString();
	}
}
