import java.util.Scanner;

public class Convert_Kilometers_To_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter distance in kilometers");
        float k = sc.nextInt();
        float m = (float) (k/1.609344);
        System.out.println("distance in miles = "+m);
    }
}
