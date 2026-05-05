class ShapeArea {
    int circleArea(int radius) {
        return (int) (Math.PI * radius * radius);
    }

    int rectangleArea(int length, int width) {
        return length * width;
    }

    int squareArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();

        int radius = 30;
        int length = 10;
        int width = 20;
        int side = 40;

        System.out.println("Area of Circle: " + shape.circleArea(radius));
        System.out.println("Area of Rectangle: " + shape.rectangleArea(length, width));
        System.out.println("Area of Square: " + shape.squareArea(side));
    }
}
