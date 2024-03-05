\* Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments.*/


 class RectangleCalculator {
    public static void main(String[] args) {
       
        if (args.length != 2) {
            System.out.println("Usage: java RectangleCalculator <length> <breadth>");
            return;
        }

        
        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);

        
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

   