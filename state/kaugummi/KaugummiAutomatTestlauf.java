package headfirst.state.kaugummi;

public class KaugummiAutomatTestlauf {

	public static void main(String[] args) {
		KaugummiAutomat kaugummiAutomat = new KaugummiAutomat(5);

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.m�nzeAuswerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.m�nzeAuswerfen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.m�nzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);
	}
}
