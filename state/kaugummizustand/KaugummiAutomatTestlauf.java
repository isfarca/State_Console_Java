package headfirst.state.kaugummizustand;

public class KaugummiAutomatTestlauf {

	public static void main(String[] args) {
		KaugummiAutomat kaugummiAutomat = new KaugummiAutomat(5);

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);
	}
}
