package ex1;
import java.util.Scanner;
public class test_main {

	public static void main(String[] args) {
		classe_entier E1;
		E1 = new classe_entier (5);
		
		System.out.println(E1.factoriel());
		System.out.println(E1.absolu());
		System.out.println(E1.premier());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrer x : ");
		int x  = sc.nextInt();
		System.out.println("entrer y : ");
		int y  = sc.nextInt();
		
		System.out.println(E1.comparer(x, y));
		
		System.out.println( E1.nb += 1);

	}

}
