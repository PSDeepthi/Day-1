class Animal{
    String name;
    public void eat(){
        System.out.println("Helooo " + name);
    }
    
}

class Dog extends Animal{
     public void eat(){
        System.out.println("Helooo this is sample");// method overriding
    }
    public void display(){
        System.out.println("hi");
    }
    
}

class MethodOverridingInheritance{
    public static void main(String[] args){
        Dog lab=new Dog();
        lab.display();
        lab.eat();
        
    }
}
