import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int guess(){
        Scanner sc = new Scanner(System.in);
        System.out.print("0 ile 100 arasında bir sayı giriniz : :");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        int right = 5;
        boolean isWin = false;
        while (right > 0){
            if(guess() == number){
                isWin = true;
                break;
            }
            right--;
            System.out.print("Tekrar deneyiniz... ");
        }

        if (isWin){
            System.out.println("Tebrikler!!! Doğru Tahmin.");
        }else {
            System.out.println("Üzgünüz, oyun bitti!");
        }

    }
}