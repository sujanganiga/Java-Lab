 interface IPoint {
    // Assuming Points property represents some characteristic like coordinates or count
    void setPoints(int points);
    int getPoints();
}
abstract class Shape {
    // Abstract method which might be implemented by concrete shapes
    public abstract void draw();
}
class Triangle extends Shape implements IPoint {
    private int points;

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}

class Circle extends Shape implements IPoint {
    private int points;

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}

class Hexagon extends Shape implements IPoint {
    private int points;

    @Override
    public void draw() {
        System.out.println("Drawing a Hexagon");
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}

class ThreeDCircle extends Circle {
    // Additional properties and methods specific to ThreeDCircle
    public void display(){
        super.draw();
    }
    // @Override
    // public void draw() {
    //     System.out.println("Drawing a 3D Circle");
    // }
}


public class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setPoints(3);
        triangle.draw();
        System.out.println("Triangle points: " + triangle.getPoints());

        Circle circle = new Circle();
        circle.setPoints(0);
        circle.draw();
        System.out.println("Circle points: " + circle.getPoints());

        Hexagon hexagon = new Hexagon();
        hexagon.setPoints(6);
        hexagon.draw();
        System.out.println("Hexagon points: " + hexagon.getPoints());

        ThreeDCircle threeDCircle = new ThreeDCircle();
        threeDCircle.setPoints(0);
        threeDCircle.display();
        System.out.println("ThreeDCircle points: " + threeDCircle.getPoints());
    }
}
