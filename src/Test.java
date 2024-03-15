public class Test {

    public static void main(String[] args){
        Employee John = new Employee("John","a", "1234", "Lakeway Dr", "WA"
        , "98229", "JohnJohnson@gmail.com","123-456-7890");
        Employee Jane = new Employee("jane","b", "1234", "Alabama St", "WA"
        , "98223", "JaneJaneson@gmail.com","123-456-7890");
        Employee Jake = new Employee("jake","c", "1234", "Alabama St", "WA"
        , "98223", "JaneJaneson@gmail.com","123-456-7890");
        Employee Janice = new Employee("janice","z", "1234", "Alabama St", "WA"
        , "98223", "JaneJaneson@gmail.com","123-456-7890");


        Tree employeeDirectory = new Tree(John);
        
       employeeDirectory.add(Jane);
       employeeDirectory.add(Jake);
       employeeDirectory.add(Janice);

       employeeDirectory.globalRoot.getEmployee().print();
       employeeDirectory.globalRoot.rightNode.getEmployee().print();
       employeeDirectory.globalRoot.rightNode.rightNode.getEmployee().print();

       System.out.printf("%s%n%n%n", "post deletion jane:");

       //employeeDirectory.delete(Jane.getId());
       employeeDirectory.globalRoot.getEmployee().print();
       employeeDirectory.globalRoot.rightNode.getEmployee().print();
       employeeDirectory.globalRoot.rightNode.rightNode.getEmployee().print();
       //employeeDirectory.globalRoot.rightNode.leftNode.getEmployee().print();
       
        employeeDirectory.lookup(new int[] {26});
        System.out.print(Janice.getId(0));
        
        Menu.welcome();
        while(true){

            Menu.selector(employeeDirectory);
            
        }
    }
    
}
