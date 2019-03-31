//Jedi Colinco & Erivn Sarno
import java.util.Scanner;
public class GeometricShape{
    public static void main(String[] args) {
        String choice;
        int retry, correct;
        
        do{
            retry =0;
        

        System.out.println("SHAPE APPLICATION");
        System.out.println("1] Shape");
        System.out.println("2] Circle");
        System.out.println("3] Rectangle");
        System.out.println("4] Square");
        System.out.println("5] Exit");
        System.out.print("Input choice: ");
        Scanner i = new Scanner(System.in);
        choice = i.next();
        
        switch(choice){
            
            case "1": System.out.println("Shape");
                    System.out.println("1] Use default values");
                    System.out.println("2] Input Color");                    
                    System.out.println("3] Exit");
                    System.out.print("Choose constructor mode: ");
                    String csh = i.next();
                    switch(csh){
                        case "1": Shape sh1 = new Shape();
                                System.out.println("Color = "+sh1.getColor());
                                System.out.println("Filled = "+sh1.isFilled());
                                System.out.println("Input value for color: ");
                                    String colsh = i.next();
                                    sh1.setColor((colsh));                                
                                System.out.println(sh1.toString());
                                break;
                        case "2":
                                Boolean shcolor;
                                String colorsh;
                                correct = 0;
                                
                                do{
                                    System.out.print("Fill with color (y/n)?: ");
                                    char colshquare = i.next().charAt(0);
                                    if(colshquare=='y'||colshquare=='Y'){
                                        shcolor = true;
                                        
                                        int colortrap;
                                        do{
                                            colortrap = 0;
                                            System.out.print("Input color: ");
                                            colorsh = i.next();
                                        
                                            for(int x=0;x<colorsh.length();x++){
                                                char checking = colorsh.charAt(x);
                                                if (!Character.isLetter(checking)){
                                                    colortrap = 1;                                                    
                                                }
                                            }
                                            if(colortrap == 1)
                                            System.out.println("Invalid color input. Try again");
                                    }while(colortrap == 1);
                                        Shape sh2 = new Shape(colorsh, shcolor);
                                        
                                        System.out.println("Color = "+sh2.getColor());
                                        System.out.println("Filled = "+sh2.isFilled());
                                        System.out.println("Input value for color: ");
                                        String colsh2 = i.next();
                                        sh2.setColor((colsh2));                                        
                                        System.out.println(sh2.toString());                               
                                    }
                                    
                                    else{
                                        if(colshquare== 'n' || colshquare == 'N')
                                        {
                                            Shape sh2 = new Shape("none", false);
                                            System.out.println("Color = "+sh2.getColor());
                                            System.out.println("Filled = "+sh2.isFilled());                                
                                            System.out.println(sh2.toString());
                                        }                                        
                                    }
                                        
                                
                                    if(colshquare == 'y' || colshquare == 'Y' || colshquare == 'n' || colshquare == 'N')
                                    {
                                        correct =1;
                                    }
                                
                                    if(correct==0)
                                    {
                                        System.out.print("Invalid input.. ");
                                    }
                                
                                }while(correct ==0);                          
                       
                                break;
                        
                        case "3": System.exit(0);
                            break;
                        default:System.out.println("Error: invalid choice. Try again.");
                                break;
                    }
                    break;
            
            case "2": System.out.println("CIRCLE");
                    System.out.println("1] Use default values");
                    System.out.println("2] Input radius");
                    System.out.println("3] Input radius and color");
                    System.out.println("4] Exit");
                    System.out.print("Choose constructor mode: ");
                    String cc = i.next();
                    switch(cc){
                        case "1": Circle c1 = new Circle();
                                System.out.println("Radius = "+c1.getRadius());
                                System.out.println("Input value for setRadius method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setRadius method: ");
                                            i.next();
                                            
                                        }
                                double rad1 = i.nextDouble();
                                c1.setRadius(rad1);
                                System.out.println("Radius = "+c1.getRadius());
                                System.out.println("Area = "+c1.getArea());
                                System.out.println("Perimeter = "+c1.getPerimeter());
                                System.out.println(c1.toString());
                                break;
                        case "2": System.out.println("Input value for radius: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for radius: ");
                                            i.next();
                                            
                                        }
                                double rad = i.nextDouble();
                                Circle c2 = new Circle(rad);
                                System.out.println("Radius = "+c2.getRadius());
                                System.out.println("Input value for setRadius method: ");
                                double rad2 = i.nextDouble();
                                c2.setRadius(rad2);
                                System.out.println("Radius = "+c2.getRadius());
                                System.out.println("Area = "+c2.getArea());
                                System.out.println("Perimeter = "+c2.getPerimeter());
                                System.out.println(c2.toString());
                                break;
                        case "3": boolean ccolor = false;
                                String color3 = "none";
                                System.out.println("Input value for radius: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for radius: ");
                                            i.next();
                                            
                                        }
                                double r = i.nextDouble();
                                correct = 0;
                                do{
                                    System.out.print("Fill with color (y/n)?: ");
                                    char col = i.next().charAt(0);
                                    if(col=='y'||col=='Y'){
                                        ccolor = true;
                                        System.out.print("Input color: ");
                                        color3 = i.next();
                                    }
                                
                                    if(col == 'y' || col == 'Y' || col == 'n' || col == 'N')
                                    {
                                        correct =1;
                                    }
                                
                                    if(correct==0)
                                    {
                                        System.out.print("Invalid input.. ");
                                    }
                                
                                }while(correct ==0);
                                Circle c3 = new Circle(r,color3,ccolor);
                                System.out.println("Radius = "+c3.getRadius());
                                System.out.println("Input value for setRadius method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setRadius method: ");
                                            i.next();
                                            
                                        }
                                double rad3 = i.nextDouble();
                                c3.setRadius(rad3);
                                System.out.println("Radius = "+c3.getRadius());
                                System.out.println("Area = "+c3.getArea());
                                System.out.println("Perimeter = "+c3.getPerimeter());
                                System.out.println(c3.toString());
                                break;
                        case "4": System.exit(0);
                            break;
                        default:System.out.println("Error: invalid choice. Try again.");
                                break;
                    }
                    break;
            case "3": System.out.println("RECTANGLE");
                    System.out.println("1] Use default values");
                    System.out.println("2] Input length and width");
                    System.out.println("3] Input length, width, and color");
                    System.out.println("4] Exit");
                    System.out.print("Choose constructor mode: ");
                    String cr = i.next();
                    switch(cr){
                        case "1": Rectangle r1 = new Rectangle();
                                System.out.println("Width = "+r1.getWidth());                                
                                System.out.println("Input value for setWidth method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setWidth method: ");
                                            i.next();
                                            
                                        }
                                double w1 = i.nextDouble();
                                r1.setWidth(w1);
                                System.out.println("Length = "+r1.getLength());
                                System.out.println("Input value for setLength method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setLength method: ");
                                            i.next();
                                            
                                        }
                                double l1 = i.nextDouble();
                                r1.setLength(l1);
                                System.out.println("Area = "+r1.getArea());
                                System.out.println("Perimeter = "+r1.getPerimeter());
                                System.out.println(r1.toString());
                                break;
                        case "2": System.out.println("Input value for length: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for length: ");
                                            i.next();
                                            
                                        }
                                double l2 = i.nextDouble();
                                System.out.println("Input value for width: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for width: ");
                                            i.next();
                                            
                                        }
                                double w2 = i.nextDouble();
                                Rectangle r2 = new Rectangle(l2,w2);
                                System.out.println("Width = "+r2.getWidth());
                                System.out.println("Input value for setWidth method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setWidth method: ");
                                            i.next();
                                            
                                        }
                                double width2 = i.nextDouble();
                                r2.setWidth(width2);
                                System.out.println("Length = "+r2.getLength());
                                System.out.println("Input value for setLength method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                             System.out.println("Input value for setLength method: ");
                                            i.next();                                            
                                        }
                                double length2 = i.nextDouble();
                                r2.setLength(length2);
                                System.out.println("Area = "+r2.getArea());
                                System.out.println("Perimeter = "+r2.getPerimeter());
                                System.out.println(r2.toString());
                                break;
                        case "3": boolean rcolor = false;
                                String color4 = "none";
                                System.out.println("Input value for length: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for length: ");
                                            i.next();                                            
                                        }
                                double l3 = i.nextDouble();
                                System.out.println("Input value for width: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for width: ");
                                            i.next();                                            
                                        }
                                double w3 = i.nextDouble();
                                correct = 0;
                                do{
                                    System.out.print("Fill with color (y/n)?: ");
                                    char col = i.next().charAt(0);
                                    if(col=='y'||col=='Y'){
                                        rcolor = true;
                                        System.out.print("Input color: ");
                                        color4 = i.next();
                                    }
                                
                                    if(col == 'y' || col == 'Y' || col == 'n' || col == 'N')
                                    {
                                        correct =1;
                                    }
                                
                                    if(correct==0)
                                    {
                                        System.out.print("Invalid input.. ");
                                    }
                                
                                }while(correct ==0);
                                Rectangle r3 = new Rectangle(l3,w3,color4,rcolor);
                                System.out.println("Width = "+r3.getWidth());
                                System.out.println("Input value for setWidth method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setWidth method: ");
                                            i.next();                                            
                                        }
                                double width3 = i.nextDouble();
                                r3.setWidth(width3);
                                System.out.println("Length = "+r3.getLength());
                                System.out.println("Input value for setLength method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setLength method: ");
                                            i.next();                                            
                                        }
                                double length3 = i.nextDouble();
                                r3.setLength(length3);
                                System.out.println("Area = "+r3.getArea());
                                System.out.println("Perimeter = "+r3.getPerimeter());
                                System.out.println(r3.toString());
                                break;
                                
                        case "4": System.exit(0);
                        break;
                        default:System.out.println("Error: invalid choice. Try again.");
                                break;
                    }
                    break;
            case "4": System.out.println("SQUARE");
                    System.out.println("1] Use default values");
                    System.out.println("2] Input side value");
                    System.out.println("3] Input side and color");
                    System.out.println("4] Exit");
                    System.out.print("Choose constructor mode: ");
                    String cs = i.next();
                    switch(cs){
                        case "1": Square s1 = new Square();
                                System.out.println("Side = "+s1.getSide());
                                System.out.print("Input value for setSide method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.print("Input value for setSide method: ");
                                            i.next();                                            
                                        }
                                double side1 = i.nextDouble();
                                s1.setSide(side1);
                                System.out.println("Width = "+s1.getWidth());
                                System.out.print("Input value for setWidth method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.print("Input value for setWidth method: ");
                                            i.next();                                            
                                        }
                                double w1 = i.nextDouble();
                                s1.setWidth(w1);
                                System.out.println("Length = "+s1.getLength());
                                System.out.println("Input value for setLength method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setLength method: ");
                                            i.next();                                            
                                        }
                                double l1 = i.nextDouble();
                                s1.setLength(l1);
                                System.out.println("Area = "+s1.getArea());
                                System.out.println("Perimeter = "+s1.getPerimeter());
                                System.out.println(s1.toString());
                                break;
                        case "2": System.out.println("Input value for side: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for side: ");
                                            i.next();                                            
                                        }
                                double side2 = i.nextDouble();
                                Square s2 = new Square(side2);
                                System.out.println("Width = "+s2.getWidth());
                                System.out.println("Input value for setWidth method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setWidth method: ");
                                            i.next();                                            
                                        }
                                double width2 = i.nextDouble();
                                s2.setWidth(width2);
                                System.out.println("Length = "+s2.getLength());
                                System.out.println("Input value for setLength method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setLength method: ");
                                            i.next();                                            
                                        }
                                double length2 = i.nextDouble();
                                s2.setLength(length2);
                                System.out.println("Area = "+s2.getArea());
                                System.out.println("Perimeter = "+s2.getPerimeter());
                                System.out.println(s2.toString());
                                break;
                        case "3": boolean scolor = false;
                                String color5 = "none";
                                System.out.println("Input value for side: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for side: ");
                                            i.next();                                            
                                        }
                                double side3 = i.nextDouble();
                                correct = 0;
                                do{
                                    System.out.print("Fill with color (y/n)?: ");
                                    char col = i.next().charAt(0);
                                    if(col=='y'||col=='Y'){
                                        scolor = true;
                                        System.out.print("Input color: ");
                                        color5 = i.next();
                                    }
                                
                                    if(col == 'y' || col == 'Y' || col == 'n' || col == 'N')
                                    {
                                        correct =1;
                                    }
                                
                                    if(correct==0)
                                    {
                                        System.out.print("Invalid input.. ");
                                    }
                                
                                }while(correct ==0);
                                Rectangle s3 = new Square(side3,color5,scolor);
                                System.out.println("Width = "+s3.getWidth());
                                System.out.println("Input value for setWidth method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setWidth method: ");
                                            i.next();                                            
                                        }
                                double width3 = i.nextDouble();
                                s3.setWidth(width3);
                                System.out.println("Length = "+s3.getLength());
                                System.out.println("Input value for setLength method: ");
                                while (!i.hasNextDouble())
                                        {
                                            System.out.println("Invalid Input. Try Again..");
                                            System.out.println("Input value for setLength method: ");
                                            i.next();                                            
                                        }
                                double length3 = i.nextDouble();
                                s3.setLength(length3);
                                System.out.println("Area = "+s3.getArea());
                                System.out.println("Perimeter = "+s3.getPerimeter());
                                System.out.println(s3.toString());
                                break;
                                
                        case "4": System.exit(0);
                            break;        
                        default:System.out.println("Error: invalid choice. Try again.");
                                break;
                    }
                    break;
                    
            case "5": System.exit(0);
            break;
                 
            default:System.out.println("Error: invalid choice. Try again.");
                    break;
        }
        
        }while(retry==0);        
    }
}
