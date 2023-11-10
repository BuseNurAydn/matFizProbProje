package matFizProbProje;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1-Daire alan  2-��gen �evresi   3- 3 Boyutlu vekt�rlerin i� �arp�m�

		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Matematik ve Fizik Problemleri Program�na Ho�geldiniz...");
	        
	        String islemler = "��lemler...\n"
	                          + "1. Daire Alan� Hesaplama\n"
	                          + "2. ��gen �evresi Hesaplama\n"
	                          + "3. 2 Vekt�r�n �� �arp�m�n� Hesaplama\n"
	                          + "��k�� :  q";
	        
	        while(true) {
	            System.out.println(islemler);
	            System.out.print("��lemi Se�iniz : ");
	            String islem = scanner.nextLine();
	            
	            if (islem.equals("q")) {
	                System.out.println("Programdan ��k�l�yor...");
	                break;
	                
	            }
	            else if (islem.equals("1")){
	                
	                System.out.print("Dairenin Yar��ap� : ");
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
	                Vec vec1 = new Vec("Vekt�r1");
	                Vec vec2 = new Vec("Vekt�r2");
	                
	                Problem.Fizik.icCarpim(vec1, vec2);
	                
	            }
	            else {
	                System.out.println("Ge�ersiz i�lem...");
	                
	            }
	        }
	    }
	}


