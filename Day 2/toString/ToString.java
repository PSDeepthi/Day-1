class Student{  
     int rollno;  
     String name;  
     String city;  
      
Student(int rollno, String name, String city){  
     this.rollno=rollno;  
     this.name=name;  
     this.city=city;  
     }  
       
public String toString(){ 
      return rollno+" "+name+" "+city;  
     }  
     public static void main(String args[]){  
       Student s1=new Student(1,"Raj","Lucknow");  
       Student s2=new Student(2,"Vijay","Chennai");  
         
       System.out.println(s1);
       System.out.println(s2);
            }  
    }  
