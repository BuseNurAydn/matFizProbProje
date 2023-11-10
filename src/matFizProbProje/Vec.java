package matFizProbProje;

import java.util.Scanner;

public class Vec {
	private String isim;
	private int k;
	private int j;
	private int i;
	public Vec(String isim) {
		this.isim = isim;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Vektörün i,j ve k deðerlerini giriniz: ");
		System.out.println("i: ");
		int i = scan.nextInt();
		System.out.println("j: ");
		int j = scan.nextInt();
		System.out.println("k: ");
        int k = scan.nextInt();
		
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	
}



