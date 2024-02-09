//MODIFIERS:

//To use Private outside the class ..getter and setter methods can be used. 

class Person//default class
{
private int age=20; //field
public int getAge() // getter
{
return age;
}
public int setAge(int value)// setter
{
if(value>0)
{
age=value;
}
}
}
class Main{
 public static void main(String[] args){
 Person p1 = new Person();
 p1.getAge();
 p1.setAge(30);
 }
 }
