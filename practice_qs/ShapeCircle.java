class Circle{

void Area(double radius){

System.out.println(3.14 * radius * radius);
}

void Perimeter(double radius){
 
System.out.println(2 * 3.14 *radius);
}
}

class ShapeCircle{
public static void main(String[] args){

Circle a = new Circle();


a.Area(3);
a.Perimeter(3);
}
}

