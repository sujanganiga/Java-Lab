
/**
 * A
 */
public class TwoA {
    public static void main(String[] args) {
        C c = new C(1, 2, 3.0f, 4.0f, 5, 6);
        //D d = new D(7, 8, 9.0f, 10.0f, 11, 12);

        // Displaying values
        c.displayValues();
       // d.displayValues();

        // Demonstrating method overriding and super keyword
       c.show();
       // d.show();

        // Demonstrating final method
       // c.finalMethod();

        // Demonstrating final class
        //FinalClass finalClass = new FinalClass();
        //finalClass.showFinal();
    }
}
/**
 * A
 */ 
class A {
    private int a1,a2;
    protected float f1, f2;
    public int a3, a4;

    public A() {
        System.out.println("Default constructor of Class A");
    }

    // Parameterized constructor
    public A(int a1, int a2, float f1, float f2, int a3, int a4) {
        this.a1 = a1;
        this.a2 = a2;
        this.f1 = f1;
        this.f2 = f2;
        this.a3 = a3;
        this.a4 = a4;
        System.out.println("Default constructor of Class A");
    }

    // Method to display values
    public void displayValues() {
        System.out.println("a1: " + a1 + ", a2: " + a2 + ", f1: " + f1 + ", f2: " + f2 + ", a3: " + a3 + ", a4: " + a4);
    }

    public void show() {
        System.out.println("This is Class A");
    }

    public final void finalMethod() {
        System.out.println("This is a final method in Class A, it cannot be overridden");
    }
    
}

class B extends A {
    // Default constructor
    public B() {
        super();
        System.out.println("Default constructor of Class B");
    }

    // Parameterized constructor
    public B(int a1, int a2, float f1, float f2, int a3, int a4) {
        super(a1, a2, f1, f2, a3, a4);
        System.out.println("Default constructor of Class B");
    }

    // Overriding show method
    @Override
    public void show() {
        super.show(); // Calling the superclass method
        System.out.println("This is Class B");
    }
}

class C extends B {
    // Default constructor
    public C() {
        System.out.println("Default constructor of Class C");
    }

    // Parameterized constructor
    public C(int a1, int a2, float f1, float f2, int a3, int a4) {   
        super(a1, a2, f1, f2, a3, a4);
        System.out.println("Default constructor of Class C");
    }

    // Overriding show method
    @Override
    public void show() {
        super.show(); // Calling the superclass method
        System.out.println("This is Class C");
    }
}
class D extends B {
    // Default constructor
    public D() {
        System.out.println("Default constructor of Class D");
    }

    // Parameterized constructor
    public D(int a1, int a2, float f1, float f2, int a3, int a4) {
        super(a1, a2, f1, f2, a3, a4);
    }

    // Overriding show method
    @Override
    public void show() {
        super.show(); // Calling the superclass method
        System.out.println("This is Class D");
    }
}

final class FinalClass {
    public void showFinal() {
        System.out.println("This class cannot be inherited further");
    }
}
