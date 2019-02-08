package headfirst.state.kaugummi;

public class KaugummiAutomat {
 
	final static int AUSVERKAUFT = 0;
	final static int KEINE_M�NZE = 1;
	final static int HAT_M�NZE = 2;
	final static int VERKAUFT = 3;
 
	int zustand = AUSVERKAUFT;
	int anzahl = 0;
  
	public KaugummiAutomat(int anzahl) {
		this.anzahl = anzahl;
		if (anzahl > 0) {
			zustand = KEINE_M�NZE;
		}
	}
  
	public void m�nzeEinwerfen() {
		if (zustand == HAT_M�NZE) {
			System.out.println("Sie k�nnen keine weitere M�nze einwerfen");
		} else if (zustand == KEINE_M�NZE) {
			zustand = HAT_M�NZE;
			System.out.println("Sie haben eine M�nze eingeworfen");
		} else if (zustand == AUSVERKAUFT) {
			System.out.println("Sie k�nnen keine M�nze einwerfen, Automat ist ausverkauft");
		} else if (zustand == VERKAUFT) {
        	System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
		}
	}

	public void m�nzeAuswerfen() {
		if (zustand == HAT_M�NZE) {
			System.out.println("M�nze wird zur�ckgegeben");
			zustand = KEINE_M�NZE;
		} else if (zustand == KEINE_M�NZE) {
			System.out.println("Sie haben keine M�nze eingeworfen");
		} else if (zustand == VERKAUFT) {
			System.out.println("Zu sp�t, leider haben Sie den Griff schon gedreht");
		} else if (zustand == AUSVERKAUFT) {
        	System.out.println("Auswurf nicht m�glich, Sie haben keine M�nze eingeworfen");
		}
	}
 

 
 
	public void griffDrehen() {
		if (zustand == VERKAUFT) {
			System.out.println("Auch wenn Sie zweimal drehen, bekommen Sie keine zweite Kugel!");
		} else if (zustand == KEINE_M�NZE) {
			System.out.println("Sie haben gedreht, aber es ist keine M�nze da");
		} else if (zustand == AUSVERKAUFT) {
			System.out.println("Sie haben gedreht, aber es sind keine Kugeln da");
		} else if (zustand == HAT_M�NZE) {
			System.out.println("Sie haben den Griff gedreht ...");
			zustand = VERKAUFT;
			kugelAusgeben();
		}
	}
 
	public void kugelAusgeben() {
		if (zustand == VERKAUFT) {
			System.out.println("Eine Kugel rollt aus dem Ausgabeschacht");
			anzahl = anzahl - 1;
			if (anzahl == 0) {
				System.out.println("Hoppla, keine Kugeln da!");
				zustand = AUSVERKAUFT;
			} else {
				zustand = KEINE_M�NZE;
			}
		} else if (zustand == KEINE_M�NZE) {
			System.out.println("Sie m�ssen zuerst bezahlen");
		} else if (zustand == AUSVERKAUFT) {
			System.out.println("Es wird keine Kugel ausgegeben");
		} else if (zustand == HAT_M�NZE) {
			System.out.println("Es wird keine Kugel ausgegeben");
		}
	}
 
	public void auff�llen(int anzahl) {
		this.anzahl = anzahl;
		zustand = KEINE_M�NZE;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nKaukugel & Co KG");
		result.append("\nJava-gest�tzter Kaugummi-Standautomat Modell Nr. 2005\n");
		result.append("Bestand: " + anzahl + " Kaugummikugel");
		if (anzahl != 1) {
			result.append("n");
		}
		result.append("\nAutomat ");
		if (zustand == AUSVERKAUFT) {
			result.append("ausverkauft");
		} else if (zustand == KEINE_M�NZE) {
			result.append("bereit f�r M�nzeinwurf");
		} else if (zustand == HAT_M�NZE) {
			result.append("bereit f�r Drehen des Griffs");
		} else if (zustand == VERKAUFT) {
			result.append("gibt Kugel aus");
		}
		result.append("\n");
		return result.toString();
	}
}


