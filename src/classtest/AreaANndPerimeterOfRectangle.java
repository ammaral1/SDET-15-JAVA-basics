package classtest;

public class AreaANndPerimeterOfRectangle {
    public static void main(String[] args) {
        double width=5;
        double height=8;
        System.out.println("The area of rectangle is "+ (width*height));
        System.out.println("The area of rectangle is "+ width*height);
        System.out.println("The perimeter of rectangle is "+ (width*2+height*2));
        System.out.println("The perimeter of rectangle is "+ (width*2+height*2)+ "and the area of rectangle is "+ (width*height));

        double areaOfRectangle= width*height;
        double perimeterOfRectangle= width*2+height*2;
        System.out.println("The area of rectangle is "+areaOfRectangle+" and the perimeter of rectangle is "+perimeterOfRectangle);
    }
}
