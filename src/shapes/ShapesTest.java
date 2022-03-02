package shapes;

public class ShapesTest {
    public static void main(String[] args){
        /** INHERITANCE/POLYMORPHISM EXERCISE **/
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println(" "); // whitespace for readability
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());

        /** INTERFACES/ABSTRACT EXERCISE **/
        // testing getArea and getPerimeter
        Measurable myShape1 = new Rectangle(5,4);
        System.out.println("myShape1.getPerimeter() = " + myShape1.getPerimeter());
        System.out.println("myShape1.getArea() = " + myShape1.getArea());
        System.out.println(" "); // whitespace for readability
        Measurable myShape2 = new Square(5);
        System.out.println("myShape2.getPerimeter() = " + myShape2.getPerimeter());
        System.out.println("myShape2.getArea() = " + myShape2.getArea());

        // Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        // The "Measurable" interface forces Rectangle class to implement getPerimeter

        // What happens if you try to call the getLength or getWidth methods of the myShape variable?
        // Why?
        // Compile-time error.
        // myShape variable has a type of "Measurable" and cannot resolve getLength/getWidth
    }
}