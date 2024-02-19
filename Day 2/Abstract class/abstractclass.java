abstract class Computer{ // Base class
	abstract void turnoff();   //abstract method (must be overridden where ever it is needed t be used 
	void turnon(){
	System.out.println("Turning On");
	}

}

class Dell extends Computer{
	void turnoff(){          // overriden abstract method
	System.out.println("Turning off");
	}
	
}

class HP extends Computer{
	void turnon(){
	System.out.println("Turning on hp");
	}
	void turnoff(){          // overriden abstract method
	System.out.println("Turning off");
	}
}

class abstractclass {
	public static void main(String[] args){
	
	Dell obj = new Dell();
	obj.turnon();
	obj.turnoff();
	
	HP obj1 = new HP();
	obj1.turnon();
	obj.turnoff();
	}
}
