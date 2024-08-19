// package Java-Lab.EXAM;
class Nongen{
    Object ob;
      Nongen(Object o){
        ob=o;
      }
    
      Object getOb(){
        return ob;
      }
}
public class NonGenDemo {
    public static void main(String[] args) {
        Nongen iob=new Nongen(88);
        int v=(Integer)iob.getOb();
        System.out.println(v);

    }
}
