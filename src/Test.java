//Name: Davis Tyler
//Class: CS145
//Date: 3/15/2024
//file: Test
//Resources: cs 145 Lectures
//Program: this program generates a binary search tree which represents a database of
// Employees. There are methods, to add, delete, modify, and lookup. 
public class Test {


    public static void main(String[] args){

        // Initialize some example employees 
        Employee John = new Employee("John","a", "1234", "Lakeway Dr", "WA" 
        , "98229", "JohnJohnson@gmail.com","123-456-7890");
        Employee Jane = new Employee("jane","b", "1234", "Alabama St", "WA"
        , "98223", "JaneJaneson@gmail.com","123-456-7890");
        Employee Jake = new Employee("jake","c", "1234", "Alabama St", "WA"
        , "98223", "JaneJaneson@gmail.com","123-456-7890");
        Employee Janice = new Employee("janice","z", "1234", "Alabama St", "WA"
        , "98223", "JaneJaneson@gmail.com","123-456-7890");


        Tree employeeDirectory = new Tree(John); // initialize tree
        
       employeeDirectory.add(Jane);
       employeeDirectory.add(Jake);
       employeeDirectory.add(Janice);

       employeeDirectory.globalRoot.getEmployee().print(); 
       employeeDirectory.globalRoot.rightNode.getEmployee().print();
       employeeDirectory.globalRoot.rightNode.rightNode.getEmployee().print();
       
        employeeDirectory.lookup(new int[] {26});
        
        Menu.welcome();
        while(true){

            Menu.selector(employeeDirectory);
            
        }
    }
    
}
