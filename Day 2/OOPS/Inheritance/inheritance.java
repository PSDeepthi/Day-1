class Animal{
    String name;
    public void eat(){
        System.out.println("Helooo " + name);
    }
    
}

class Dog extends Animal{
    public void display(){
        System.out.println("hi");
    }
    
}

class inheritance{
    public static void main(String[] args){
        Dog lab=new Dog();
        lab.name ="kittu";
        lab.display();
        lab.eat();
        
    }
}
