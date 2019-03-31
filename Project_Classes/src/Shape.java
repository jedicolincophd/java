//Jedi Colinco
public class Shape {
    private String color = "red";
    private boolean filled = true;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        String f;
        if(filled)
            f = "filled";
        else
            f = "not filled";
        return ("A Shape with color of "+color+" and "+f);
    }
}
