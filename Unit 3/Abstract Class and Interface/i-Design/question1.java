/*
List of Shapes:
1.Circle
2.Rectangle
3.Square
Enter your choice:
1
Enter the radius of the Circle:
2.34
The perimeter is 14.70

Sample Input and Output 2:

List of Shapes:
1.Circle
2.Rectangle
3.Square
Enter your choice:
2
Enter the length of the Rectangle:
12
Enter the breadth of the Rectangle:
3
The perimeter is 30.00

Sample Input and Output 3:

List of Shapes:
1.Circle
2.Rectangle
3.Square
Enter your choice:
3
Enter the side of the Square:
13
The perimeter is 52.00
*/
import java.util.Scanner;

abstract class Shape
{
    public abstract double calculatePerimeter();
}

class Circle extends Shape
{
    private float radius;

    Circle(float radius)
    {
        this.radius = radius;
    }

    public float getRadious()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() 
    {
        return 2 * 3.14 * radius;  
    }

    
}

class Rectangle extends Shape
{
    private float length;
    private float breadth;

    Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength()
    {
        return length;
    }

    public void setLength(float length)
    {
        this.length = length;
    }

    public float getBreadth()
    {
        return breadth;
    }

    public void setBreadth(float breadth)
    {
        this.breadth = breadth;
    }

    @Override
    public double calculatePerimeter() 
    {
        return 2* (length + breadth);  
    }
}

class Square extends Shape
{
    private float side;

    Square(float side)
    {
        this.side = side;
    }

    public float getSide()
    {
        return side;
    }

    public void setSide(float side)
    {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() 
    {
        return 4 * side;  
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("List of Shapes:\n1.Circle\n2.Rectangle\n3.Square\nEnter your choice:");
        int n = Integer.parseInt(scn.nextLine());

        if(n == 1)
        {
            System.out.println("Enter the radius of the Circle:");
            float r  = Float.parseFloat(scn.nextLine());

            Shape obj = new Circle(r);
            System.out.println("The perimeter is " + String.format("%.2f", obj.calculatePerimeter()));
        }

        else if(n == 2)
        {
            System.out.println("Enter the length of the Rectangle:");
            float l = Float.parseFloat(scn.nextLine());
            
            System.out.println("Enter the breadth of the Rectangle:");
            float b = Float.parseFloat(scn.nextLine());

            Shape obj = new Rectangle(l, b);
            System.out.println("The perimeter is " + String.format("%.2f", obj.calculatePerimeter()));

        }
        else if( n ==3)
        {
            System.out.println("Enter the side of the Square:");
            float l = Float.parseFloat(scn.nextLine());

            Shape obj = new Square(l);
            System.out.println("The perimeter is " + String.format("%.2f", obj.calculatePerimeter()));

        }
    }    
}
