//Function overloading occurs when there are multiple methods in the same class with the same name but different parameter lists (different number or types of parameters).




class Calculator{
public int add(int a, int b){
return a+b;
}
public int add(int a, int b, int c){
return a+b+c;
}
public int add(int a, int b ,int c, int d){
return a+b+c+d;
}
public double add(double a, double b) {
return a+b;
}
}

public class FunctionOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum (int): " + calculator.add(5, 10));
        System.out.println("Sum (int, int, int): " + calculator.add(5, 10, 15));
        System.out.println("Sum (int, int, int, int): " + calculator.add(5, 10, 15, 20));
        System.out.println("Sum (double): " + calculator.add(5.5, 10.5));

        System.out.println();
        }
        }
