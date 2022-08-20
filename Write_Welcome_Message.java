import java.util.Scanner;

public class Write_Welcome_Message {
    public static void main(String[] args) {
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.print("Hello "+a+" have a good day");

    }
}
