import java.util.*;

public class PropEnum {
	public static void main(String[] args)
	{
		Properties properties = new Properties();
		properties.put("Pen", 10);
		properties.put("Book", 20);
		properties.put("Pencil", 40);

		System.out.println("Current Properties: " + properties.toString());

		Enumeration enumprop = properties.elements();
		System.out.println("The enumeration of values are:");

		while (enumprop.hasMoreElements()) {
			System.out.println(enumprop.nextElement());
		}
	}
}
