class People{  
     int id;  
     String name;  
     String city;  
      
People(int id, String name, String city){  
     this.id=id;  
     this.name=name;  
     this.city=city;  
     }  
      
public static void main(String args[]){  
       People p1=new People(1,"Raj","lucknow");  
       People p2=new People(2,"Vijay","Chennai");  
         
       System.out.println(p1);
       System.out.println(p2);  
     }  
 }  
