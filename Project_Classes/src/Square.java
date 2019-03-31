//Emannuel Pacarro
public class Square extends Rectangle{
    
    public Square()
    {
        super();
    }
    
    public Square(double side)
    {
        
        super(side,side);
        
        if(side <= 0){
            System.out.println("Error... Side cannot be 0 or lower");
            System.exit(0);
        }
    }
    
    public Square(double side, String color, boolean filled)
    {
        super(side,side,color,filled);
        if(side <= 0){
            System.out.println("Error... Side cannot be 0 or lower");
            System.exit(0);
        }
    }
    
    public double getSide(){
        return super.getLength();
    }
    
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
        if(side <= 0){
            System.out.println("Error... Side cannot be 0 or lower");
            System.exit(0);
        }
    }
    
    @Override 
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
        if(side <= 0){
            System.out.println("Error... Width cannot be 0 or lower");
            System.exit(0);
        }
    }

    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
        
        if(side <= 0){
            System.out.println("Error... Width cannot be 0 or lower");
            System.exit(0);
        }
    }
    
    @Override
    public double getArea(){
        return (super.getLength()*super.getLength());
    }
    
    @Override
    public double getPerimeter()
    {
        return 4*super.getLength();
    }
         
    @Override
    public String toString(){
        return ("A Square with sides = " +getSide()+",which is a subclass of " 
                +super.toString());
    }
	
}
