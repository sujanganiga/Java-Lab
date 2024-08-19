// package Java-Lab.EXAM;
import java.io.*;
public class RedingAndWriting {
    public static void main(String[] args) throws Exception{
        FileInputStream fin=new FileInputStream("abc.txt");
        FileOutputStream fos=new FileOutputStream("bbc.txt");
        int i=0;
        while((i=fin.read())!=-1){
            fos.write((byte)i);
        }
        fin.close();
        fos.close();
    }
}
