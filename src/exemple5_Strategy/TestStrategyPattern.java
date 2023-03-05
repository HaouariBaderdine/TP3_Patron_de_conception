package exemple5_Strategy;

public class TestStrategyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Article art1 = new Article("A1", 50);
		Article art2 = new Article("A2", 120);

		System.out.println(art1);
		art1.setStartegy(new PayerCarte());
		art1.payer();

		System.out.println("---------");

		System.out.println(art2);
		art2.setStartegy(new PayerPaypal());
		art2.payer();

	}

}
