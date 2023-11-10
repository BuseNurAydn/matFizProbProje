package matFizProbProje;

public class Problem {
	public static class Matematik{
		public static void Daire_alan(int yarýcap) {
			System.out.println("Dairenin alaný: " + (yarýcap*yarýcap*Math.PI));
		}
		public static void Ucgen_Cevre(int kenar1,int kenar2,int kenar3) {
			System.out.println("Çevresi: " + (kenar1 + kenar2 + kenar3));
		}
		
		
	}
	
	public static class Fizik{
		 public static void icCarpim(Vec vec1,Vec vec2) {
	            
	        int iccarpim = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
	        System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " in iç çarpýmý =  " + iccarpim);
	            
	        }
	}

}
