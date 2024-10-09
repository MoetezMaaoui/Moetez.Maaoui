package ex3;

public class maison {
	private String type;
	private String adr;
	private int nbchambre ;
	private float surface ; 
	
	
	public  maison (String adr, String t, int n) {
		this.adr = adr ;
		this.type = t;
		this.nbchambre = n;
	}
	
	public  maison (String a, String t, int n, float s) {
		this.type = t;
		this.adr = a ;
		this.nbchambre = n;
		this.surface = s;
	}
	
	public void setSurface(float s) {
		this.surface = s;
	}
	
	public float calculPrix(float pmc) {
		float prix = this.surface * pmc;
		return(prix);
	}
	
	public float calculPrix() {
		int pmc = 2100;
		float prix = this.surface * pmc;
		return(prix); 
	}
	
	public String toChaine() {
		return(this.type+" de "+this.surface+" m2 a "+this.adr+"avec "+this.nbchambre+" chambre");
	}
	
	
	
}
