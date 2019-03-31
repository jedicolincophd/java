//Erivn Sarno
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;    
    
    public Rectangle(){
        width = 1.0;
	length = 1.0;
    }
    
    public Rectangle(double width, double length){
        if(width > 0 && length >0){            
            this.width = width;
            this.length = length;
        }
        else{
            System.out.println("Error... Width or Length cannot be 0 or lower");
            System.exit(0);
        }
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        if(width > 0 && length >0){  
            this.width = width;
            this.length = length;
        }
        else{
            System.out.println("Error... Width or Length cannot be 0 or lower");
            System.exit(0);
        }
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        if(width > 0){
            this.width = width;
        }
        else{
            System.out.println("Error... Width cannot be 0 or lower");
        }
            
    }
	
    public double getLength(){
        return length;
    }
	
    public void setLength(double length){
        if(length > 0){
            this.length = length;
        }        
        else{
            System.out.println("Error... Width cannot be 0 or lower");
        }
    }
    
    public double getArea(){
        return length * width;
    }
    
    public double getPerimeter(){
        return 2 * (length + width);    
    }
    
    @Override
    public String toString(){
        return ("A Rectangle with width = "+width+ " and length = " +length+ ", "
                + "which is a subclass of "+super.toString());
    }
	
}
