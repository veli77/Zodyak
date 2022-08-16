import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sene;
        String Burc;
        System.out.println("Doğum yılınızı giriniz: ");
        sene = giris.nextInt();

        sene = sene % 12;
        if (sene < 6){
            if (sene < 3){
                if(sene < 1){
                    Burc = "Maymun";
                }else if(sene < 2){
                    Burc = "Horoz";
                }else{
                    Burc = "Köpek";
                }
            }else if (sene < 4){
                Burc = "Domuz";
            }else if (sene < 5){
                Burc = "Fare";
            }else{
                Burc = "Öküz";
            }
        }else if (sene < 9){
            if (sene < 7){
                Burc = "Kaplan";
            }else if(sene < 8){
                Burc = "Tavşan";
            }else{
                Burc = "Ejderha";
            }
        }else if(sene < 10){
            Burc = "Yılan";
        } else if (sene < 11) {
            Burc = "At";
        }else {
            Burc = "Koyun";
        }


        System.out.println("Çin Zodyağı Burcunuz: "+Burc);
    }
}
