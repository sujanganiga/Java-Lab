
import java.io.*;
public class varBufferedRead {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter yor name");
        String str=br.readLine();
        int i=br.read();
        System.out.println(str+i);
        System.out.println(i);

    }
}
