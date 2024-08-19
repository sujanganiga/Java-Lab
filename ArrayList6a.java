import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayList6a {
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<>();
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(arr.length);
        a.add("10d");
        a.add("20d");
        System.out.println(a);
        //a.remove("20d");
        a.add(0, "dd");
        System.out.println(a);
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }    
}
