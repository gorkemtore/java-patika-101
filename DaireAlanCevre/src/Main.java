import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        double alan, cevre,dilimAlan;
        int merkezAci, yaricap;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz: ");
        yaricap = input.nextInt();
        System.out.print("Merkez açı giriniz: ");
        merkezAci = input.nextInt();
        cevre = 2*pi*yaricap;
        alan = pi*yaricap*yaricap;
        dilimAlan = alan*merkezAci/360;

        System.out.print("Dilimin Alanı : "+dilimAlan + "\nAlan : "+ alan+"\nÇevre : "+cevre);

    }
}