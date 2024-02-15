class Animal {
    public void makeSound() {
        System.out.println("sounds");
    }
}

class Dog extends Animal {
   
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
   
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class runtime {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound(); 
        myCat.makeSound(); 
            }
}

