import java.util.ArrayList;
public class ArrayList6a {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(10);
        a.add(20);
        System.out.println(a);
        a.remove(1);
        a.set(0, 100);
        System.out.println(a.get(0));

    }    
}
