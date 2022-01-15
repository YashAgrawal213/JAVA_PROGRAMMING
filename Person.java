import java.lang.*;
import java.util.Scanner;

public class Person {
    int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }
    public void am_I_Old() {
        String ans;
        if (age < 13) {
            ans = "You are young.";
        } else if (age >= 13 && age < 18) {
            ans = "You are a teenager.";
        } else {
            ans = "You are old.";
        }
        System.out.println(ans);
    }

    public void yearPasses() {
        age += 1;
    }
}

class Test
{
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        Person obj=new Person(age);
        obj.am_I_Old();
        obj.yearPasses();
        System.out.println(obj.age);
    }
}
