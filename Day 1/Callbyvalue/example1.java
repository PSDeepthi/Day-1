// Call by value for primitive datatype


public class example1{
public static void main(String [] args){
	int a = 10;
	System.out.println("Before :" + a);
	modifyvalue(a);
	System.out.println("After :" + a);
	}
public static void modifyvalue(int value){
	value = 20;
	System.out.println("Inside method :" + value);
	}
}



