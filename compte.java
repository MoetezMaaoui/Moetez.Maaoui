package ex2;

public class compte {
	private int num;
	private float sold =0;
	public static int count = 0;
	public compte() {
		this.sold = 0;
		count+=1;
		this.num = count;
	}
	
	public float deposer(float m) {
		return (this.sold += m);
	}
	
	public float retirer(float m) {
		return (this.sold -= m);
	}
	
	public float avoirSold() {
		return (this.sold );
	}
	
	public int avoirNum() {
		return (this.num );
	}
	
	public float transferer(float m, compte c) {
		this.sold -= m;
		return(c.sold += m);
	}
	
	
	
	
}
