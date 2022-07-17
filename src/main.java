import java.util.Scanner;

public class main {

    static boolean isPalindrom(int sayi) {
        int temp = sayi, reversen = 0, lastNumber;
        while (temp != 0) {
            System.out.println("===============");
            System.out.println("Number =>" + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak =>" + lastNumber);
            reversen = (reversen * 10) + lastNumber;
            System.out.println("Yeni sayı =>" + reversen);
            temp /= 10;
        }
        if (sayi == reversen) {
            System.out.println("Palindrom sayıdır.");
            return true;
        } else {
            System.out.println("Palindrom sayı değildir");
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int n = input.nextInt();
        System.out.println(isPalindrom(n));
    }

}


