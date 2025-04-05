import java.util.*;
public class ShapeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rectangles: ");
        int number = input.nextInt();

        Rectangle [] rectangles = new Rectangle[number];

        for(int i = 0 ; i < number ; i++){
            System.out.print("Enter the length of rectangle " + (i + 1) + ": ");
            int length = input.nextInt();
            System.out.print("Enter the width of rectangle " + (i + 1) + ": ");
            int width = input.nextInt();
            rectangles[i] = new Rectangle(length,width);
        }

        System.out.println("Display information of rectangles");

        for(int i = 0 ; i < number ; i++){
            System.out.println("The rectangle " + (i + 1) + 
            ":[Length : " + rectangles[i].getLength() + 
            ", Width : " + rectangles[i].getWidth() +
            ", Perimeter : " + rectangles[i].calculatePerimeter() + 
            ", Area: " + rectangles[i].calculateArea() + "]");
        }

        Rectangle maxAreaRectangle = rectangles[0];

        for(int i = 0 ; i < number; i++){
            if(maxAreaRectangle.calculateArea() < rectangles[i].calculateArea())
                maxAreaRectangle = rectangles[i];
        }

        System.out.println("Display the rectangle with max area");
        System.out.println("[Length : " + maxAreaRectangle.getLength() + 
        ", Width : " + maxAreaRectangle.getWidth() +
        ", Perimeter : " + maxAreaRectangle.calculatePerimeter() + 
        ", Area: " + maxAreaRectangle.calculateArea() + "]");

    }
}
