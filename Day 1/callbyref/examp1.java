// call by reference using wrapper classes and changes are made in the output

class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }
}

class DogWrapper {
    Dog D;

    DogWrapper(Dog D) {
        this.D = D;
    }
}

public class examp1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("TOM");
        DogWrapper wrapper = new DogWrapper(myDog);

        System.out.println("Before : " + wrapper.D.name);
        modifyObject(wrapper);
        System.out.println("After : " + wrapper.D.name);
    }

    public static void modifyObject(DogWrapper wrapper) {
        wrapper.D.name = "NICK";
        System.out.println("Inside method: " + wrapper.D.name);
    }
}

