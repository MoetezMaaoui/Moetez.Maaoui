package ex1;

public class classe_entier {
	private int e1 ;
	static int nb = 0;
	
	public classe_entier(int e1){
		this.e1 = e1;
	}
	public int factoriel() {
		int f = 1;
		for(int i=1;i<=this.e1;i++) {
			f *= i; 
		}
		return f;
	}
	public int absolu() {
		if(this.e1>=0)
			return this.e1;
		else
			return (this.e1*(-1));
	}
	public String comparer(int n1,int n2) {
		if(n1>n2)
			return (n1 +" est plus grand que "+n2);
		else if (n2>n1)
			return (n2 +" est plus grand que "+n1);
		else
			return (n2 +" et "+n1+" sont egaux");	
	}
	
	
	public String premier() {
		for(int i=2;i<this.e1;i++) {
			if (this.e1%i == 0)
					return (this.e1+" n'est premier ");
		}return (this.e1+" est premier ");
	}
	
	
}
