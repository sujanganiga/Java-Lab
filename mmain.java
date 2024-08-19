import java.util.*;
class Book{
    String name;
    int id;
    public Book(String name,int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "{" +name+","+id+" }";
    }
}
public class mmain {
    public static void main(String[] args) {
        Set<Book> bset=new HashSet<>();
        bset.add(new Book("ss",1));
        bset.add(new Book("ss",1));
        
        System.out.println(bset);
    }
}
