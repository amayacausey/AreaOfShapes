import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What shape would you like to calculate the area for? ");
        System.out.println("Your options are : \nCircle \nTriangle \nRectangle \nSquare");
        String userShape=sc.nextLine();

        if (userShape.equalsIgnoreCase("Circle"))
        {
            System.out.println(countAreaOfCircle(sc));

        }


        if (userShape.equalsIgnoreCase("Triangle"))
        {
            System.out.println(countAreaOfTriangle(sc));

        }
        if (userShape.equalsIgnoreCase("Rectangle"))
        {
            System.out.println(countAreaOfRectangle(sc));

        }
        if (userShape.equalsIgnoreCase("Square"))
        {
            System.out.println(countAreaOfSquare(sc));

        }



    }

    public static String countAreaOfTriangle(Scanner scanner){

        System.out.println("Please enter the base of the triangle");
        double baseTriangle=scanner.nextDouble();
        System.out.println("Please enter the height of the triangle");
        double heightTriangle=scanner.nextDouble();
        double baseHeight=baseTriangle * heightTriangle;
        double triangleArea=1.0/2.0*baseHeight; //     1/2=0
        String result="The area of this Triangle is: "+triangleArea;
        return  result;
    }
    public static String countAreaOfCircle(Scanner scanner){
        System.out.println("Please enter the radius (r)");
        double userRadius=scanner.nextDouble();
        double pi = 3.14;
        double radiusSquared=userRadius*userRadius;
        double circleArea= pi * radiusSquared;
        String result=("The area of this circle is: " +circleArea);
        return result;
    }
    public static String countAreaOfRectangle(Scanner scanner){
        System.out.print("Please enter the length (l) : ");
        double userLength=scanner.nextDouble();
        System.out.print("Please enter the width (w) : ");
        double userWidth=scanner.nextDouble();
        double areaOfRectangle=userLength*userWidth;
        String result =("The area of this rectangle is  "+areaOfRectangle);
        return result;
    }
    public static String countAreaOfSquare(Scanner scanner){
        System.out.println("Please enter the length of one side of the square(a)");
        double userSquareSide= scanner.nextDouble();
        double areaOfSquare= userSquareSide*userSquareSide;
        String result=("The area of this square is  "+areaOfSquare);
        return result;
    }


}
