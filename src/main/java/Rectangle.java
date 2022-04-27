import interfaces.Perimeter;

class Rectangle extends Shape implements Perimeter {

    private double length;
    private double width;

    public Rectangle(String color, double length,
                     double width)
    {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override
    public double perimeter() {
        return (length*2 + width*2) ;
    }

    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
                + " and area is : " + area() + " and perimeter is: " + perimeter();
    }



}


