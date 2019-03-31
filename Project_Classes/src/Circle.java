//Jedi Colinco
public class Circle extends Shape{
    private double radius = 1.0;
    final private double pi = 3.1416;
    
    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double radius){
        if(radius > 0){
            this.radius = radius;
        }
        else
            System.out.println("Error... Radius cannot be 0 or lower");
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        if(radius > 0){
            this.radius = radius;
        }
        else
            System.out.println("Error... Radius cannot be 0 or lower");
        
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        }
        else
            System.out.println("Error... Radius cannot be 0 or lower");
    }
    
    public double getArea(){
        return pi*(radius*radius);
    }
    
    public double getPerimeter(){
        return 2*pi*radius;    
    }
    
    @Override
    public String toString(){
        return ("A Circle with radius = "+radius+
                ", which is a subclass of "+super.toString());
    }
}
