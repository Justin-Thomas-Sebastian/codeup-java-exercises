package shapes;

/** INHERITANCE/POLYMORPHISM EXERCISE **/
//public class Rectangle {
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        System.out.println("This method is being called from Rectangle");
//        return this.length * this.width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("This method is being called from Rectangle");
//        return (2 * this.length) + (2 * this.width);
//    }
//}

/** INTERFACES/ABSTRACT EXERCISE **/
public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width){
        super(length, width);
    }

    public double getPerimeter() {
        System.out.println("This method is being called from Rectangle");
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea() {
        System.out.println("This method is being called from Rectangle");
        return this.length * this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}