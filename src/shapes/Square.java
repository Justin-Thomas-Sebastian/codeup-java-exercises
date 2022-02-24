package shapes;

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
