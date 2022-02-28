package shapes;

/** INHERITANCE/POLYMORPHISM EXERCISE **/
public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }

    public double getPerimeter(){
        System.out.println("This method is being called from Square");
        return 4 * this.length;
    }

    public double getArea(){
        System.out.println("This method is being called from Square");
        return this.length * this.length;
    }
}

/** INTERFACES/ABSTRACT EXERCISE **/
//public class Square extends Quadrilateral implements Measurable{
//    public Square(double side){
//        super(side, side);
//    }
//
//    public double getPerimeter() {
//        System.out.println("This method is being called from Square");
//        return 4 * this.length;
//    }
//
//    public double getArea() {
//        System.out.println("This method is being called from Square");
//        return this.length * this.length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//        this.width = length;
//    }
//
//    public void setWidth(double width) {
//        this.length = width;
//        this.width = width;
//    }
//}
