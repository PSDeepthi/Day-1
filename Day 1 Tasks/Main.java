class Sample {
public int ballcount;
public void display(){
	System.out.println("BOX 1:");
	System.out.println("Box has" + ballcount + "balls");
}
}
public class Main{
	public static void main(String[] args) {
	Sample sp = new Sample();
	sp.ballcount = 5;
	sp.display();
	}
	}
	
