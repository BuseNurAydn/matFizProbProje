package matFizProbProje;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1-Daire alan  2-Üçgen çevresi   3- 3 Boyutlu vektörlerin iç çarpýmý

		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Matematik ve Fizik Problemleri Programýna Hoþgeldiniz...");
	        
	        String islemler = "Ýþlemler...\n"
	                          + "1. Daire Alaný Hesaplama\n"
	                          + "2. Üçgen Çevresi Hesaplama\n"
	                          + "3. 2 Vektörün Ýç Çarpýmýný Hesaplama\n"
	                          + "Çýkýþ :  q";
	        
	        while(true) {
	            System.out.println(islemler);
	            System.out.print("Ýþlemi Seçiniz : ");
	            String islem = scanner.nextLine();
	            
	            if (islem.equals("q")) {
	                System.out.println("Programdan Çýkýlýyor...");
	                break;
	                
	            }
	            else if (islem.equals("1")){
	                
	                System.out.print("Dairenin Yarýçapý : ");
	                int yaricap = scanner.nextInt();
	                scanner.nextLine();
	                
	                Problem.Matematik.Daire_alan(yaricap);
	                
	            }
	            else if (islem.equals("2")){
	                System.out.print("Kenar  1: ");
	                int kenar1 = scanner.nextInt();
	                System.out.println("Kenar 2 : ");
	                int kenar2 = scanner.nextInt();
	                System.out.println("Kenar 3 : ");
	                int kenar3 = scanner.nextInt();
	                scanner.nextLine();
	                
	                Problem.Matematik.Ucgen_Cevre(kenar1, kenar2, kenar3);
	                
	            }
	            else if (islem.equals("3")){
	                Vec vec1 = new Vec("Vektör1");
	                Vec vec2 = new Vec("Vektör2");
	                
	                Problem.Fizik.icCarpim(vec1, vec2);
	                
	            }
	            else {
	                System.out.println("Geçersiz iþlem...");
	                
	            }
	        }
	    }
	}


