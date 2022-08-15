import java.util.ArrayList;
import java.util.List;

public class ArrayList_Collections_Framework
{
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();


        // INSERTING THE DATA
        c.add(69);
        c.add(49);
        c.add(100);
        c.add(54);
        System.out.println("after insertion");
        System.out.println(c);
        System.out.println("------------------------------------------");


        // DELETING THE DATA
        c.remove(2);
        System.out.println("after deleting from index");
        System.out.println(c);
        System.out.println("------------------------------------------");

        // DISPLAYING THE DATA
        int d= c.get(2);
        System.out.println("displaying data of a particular index");
        System.out.println(d);
        System.out.println("-------------------------------------------");

        // TO CHANGE THE VALUE OF PARTICULAR INDEX
        c.set(1,90);
        System.out.println("after seting ");
        System.out.println(c);
        System.out.println("-------------------------------------------");

        // TO CHECK THE VALUE PRESENT IN THE LIST OR NOT
        boolean f = c.contains(100);
        System.out.println("checking the value is present or not");
        System.out.println(f);
        System.out.println("--------------------------------------------------");

        // TO DISPLAY DATA IN NORMAL FORM NOT IN THE FORM OF A LIST
        System.out.println("normal display not in form of list");
        for (int i = 0; i < c.size(); i++) {
            int a = c.get(i);
            System.out.println(a);
        }
        System.out.println("------------------------------------------------------");

        // DELETING ALL THE DATA
        c.clear();
        System.out.println("after clearing the list");
        System.out.println(c);
        System.out.println("--------------------------------------------");


    }
}
