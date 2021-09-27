
package Classes;


public class Test {
    
    
    
    
    
    public static void main(String[] args) {
        
        //Variable declaration
        Person person1;        
        
        //Creating object, memory reserve, constructor execution
        person1 = new Person ();
        
        //modifying data and showing data
        person1.name = "Carlos";
        person1.surname = "Galvez";
        person1.showInfo();
        
        
        //Creating another Person object, null attributes        
        Person person2 = new Person();
        person2.showInfo();
    }
    
}
