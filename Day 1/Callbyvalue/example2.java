// call by value with obj reference
// changes are made to the object's state within the method (name), those changes are visible outside the method.


class Dog {
	String name;
	
	Dog(String name) {
	this.name = name;
	}
}

public class example2{
public static void main(String[] args){
	Dog D = new Dog("JACK");
	
	System.out.println("Before :" + D.name);
	modifyobject(D);
	System.out.println("After :" + D.name);
	
	}
	
    public static void modifyobject(Dog dog) {
        dog.name = "Max";
        System.out.println("Inside method: " + dog.name);
    }
}




