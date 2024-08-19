// package Java-Lab.EXAM;
import java.io.*;
public class FileInputStreamExample1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fin=new FileInputStream("abc.txt");
        int i=0;
        while((i=fin.read())!=-1){
            System.out.print((char)i);
        }
        fin.close();
    }
}
