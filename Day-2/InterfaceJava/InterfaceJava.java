interface Father{
	abstract void call();
	abstract void talk();
}

interface Mother{
	abstract void call();
	abstract void talk();
}

class InterfaceJava implements Father, Mother {
	public void call(){
	System.out.println("Calling");
	}
	public void talk(){
	System.out.println("talking");
	}
	
	public static void main(String[] args) {
	InterfaceJava obj = new InterfaceJava();
	obj.call();
	obj.talk();
	}

} 
