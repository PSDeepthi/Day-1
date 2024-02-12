//Function overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.




class Shape {          // superclass/parentclass
    public void draw() {
        System.out.println("Drawing a shape");
    }
   }
   
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class FunctionOverriding{
	public static void main(String[] args){
	Shape shape = new Shape();
        shape.draw();  
        Circle circle = new Circle();
        circle.draw();
        Square square = new Square();
        square.draw();
	}
}
