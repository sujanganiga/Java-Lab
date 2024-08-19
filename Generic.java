@SuppressWarnings("unchecked")
class MyArray<T>{
    T A[]=(T[]) new Object[10];
    int len=0;

    public void append(T v){
        A[len++]=v;
    }
    public void display(){
        for(int i=0;i<len;i++){
            System.out.println(A[i]);
        }
    }
}
class MyArray2<T> extends MyArray<T>{

}
public class Generic {
    public static void main(String[] args) {
        MyArray2<String> ma=new MyArray2<>();
        ma.append("gg");
        ma.append("vk");
        ma.append("rs");
        ma.display();


    }
}
