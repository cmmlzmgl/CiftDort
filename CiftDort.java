import java.util.Scanner;

public class CiftDort {
    public static void main(String[] args) {

        int sum = 0;
        int sayi;
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Lütfen Bir Sayı Giriniz: ");
            sayi = input.nextInt();

            if ( sayi %4 == 0)
            {
                sum += sayi;
            }

        } while(sayi %2 == 0);

        System.out.print("Girdiğiniz Sayıların Toplamı: " + sum);

    }
}
