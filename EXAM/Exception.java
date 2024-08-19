// package Java-Lab.EXAM;

public class Exception {
    public static void main(String[] args) {
        try{
            int i=5/0;
            System.out.println("hello");
        }
        catch(ArithmeticException e){
            System.out.println("error");
        }
        System.out.println("world");
    }
}
