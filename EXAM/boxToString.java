
/**
 * boxToString
 */

class Box{
    double h;
    double w;
    double l;
    Box(double h,double w,double l){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    public String toString(){
        return "area is ->"+(l*h*w);
    }
}

public class boxToString {

    public static void main(String[] args) {
        Box b=new Box(10,20,30);
        String s="box b : ";
        System.out.println(b);
        System.out.println(s);
    }
}