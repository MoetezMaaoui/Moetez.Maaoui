package ex2;

public class test_main {

	public static void main(String[] args) {
		compte co1,co2;
		co1 = new compte();
		co2 = new compte();
		
		co1.deposer(1200);
		co2.deposer(500);
		
		System.out.println("le montant dans le compte "+co1.avoirNum()+" est : "+co1.avoirSold());
		System.out.println("le montant dans le compte "+co2.avoirNum()+" est : "+co2.avoirSold());
		
		co2.transferer(700, co1);
		System.out.println("le montant dans co2 est : "+co2.avoirSold());
	}

}
