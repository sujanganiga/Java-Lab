//package Java-Lab.EXAM;

public class stringCreationTypes {
    public static void main(String[] args) {
        String str1="java";
        char ch[]={'j','a','v','a'};
        String str2=new String(ch);
        String str3="java";
        String str4=new String("java");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str4);

    }
}
