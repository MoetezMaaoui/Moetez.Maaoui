package ex3;

public class test_main {

	public static void main(String[] args) {
		maison m1,m2;
		m2 = new maison("une villa"," Nabeul",5);
		m1 = new maison("un duplex","Tunis",4,210);
		
		System.out.println(m1.toChaine());
		System.out.println(m2.toChaine());
		
		m2.setSurface(230);
		System.out.println("prix maison 2 1ere methode : "+m2.calculPrix());
		System.out.println("prix maison 2 2eme methode : "+m2.calculPrix(2100));
		
		System.out.println("prix maison 1 1ere methode : "+m1.calculPrix());
		System.out.println("prix maison 2 2eme methode : "+m1.calculPrix(2100));

	
	
	}

}
