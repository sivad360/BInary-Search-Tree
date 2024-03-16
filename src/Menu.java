//Name: Davis Tyler
//Class: CS145
//Date: 3/15/2024
//file: Menu
//Resources: cs 145 Lectures
//Program: this program generates a binary search tree which represents a database of
// Employees. There are methods, to add, delete, modify, and lookup. 

import java.util.Scanner;

public class Menu {

    public static void welcome(){ 
        System.out.printf("s%n","Welcome to the employee database");
    }

    public static void selector(Tree tree){ // calls individual prompts 
        // and corresponding tree methods
        char mainInput = mainPrompt(); 

        if(mainInput =='a'){ // if add employee

            tree.add(addEmployeePrompt());

        } else if(mainInput =='d'){ // if delete employee
            
            tree.delete(deleteEmployeePrompt());

        } else if(mainInput =='l'){ // if lookup employee
            
            Node lookupNode = tree.lookup(lookupEmployeePrompt());

            lookupNode.getEmployee().print();

        } else if(mainInput =='m'){ // if modify

            int[] id = modifyEmployeePromptId();

            System.out.print(id[0]);

            char field = modifyEmployeePromptField();

            String value = modifyEmployeePromptValue();

            tree.modify(id,field,value);

        } else if(mainInput =='n'){ 

        }



    }


    public static char mainPrompt(){ // main menu prompt

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n" 
            , "To add an employee please enter (a)"
            , "To delete an employee please enter (d)"
            , "To lookup an employee please enter (l)"
            , "To modify an employees information please enter (m)"
            , "To modify phone number please enter (n)");

        char inputChar = input.nextLine().charAt(0);

        return inputChar;

    } // end mainPrompt()


    public static int[] modifyEmployeePromptId(){ // modify employee id prompt

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n"
        , "Please enter the last name  of the employee you wish to modify");

        String lastNameString = input.nextLine();

        int[] id = new int[lastNameString.length()];

        // convert last name to first 4 of id # 
        for(int i =0; i<lastNameString.length(); i++){ 

            id[i] = lastNameString.charAt(i)-96;

        }

        return id
        ;
    }

    public static char modifyEmployeePromptField(){ // modify employee field prompt

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n" // prompt for which characteristic
            , "To modify first name please enter (f)"
            , "To modify last name please enter (l)"
            , "To modify city please enter (c)"
            , "To modify address please enter (a)"
            , "To modify zip code please enter (z)"
            , "To modify email please enter (e)"
            , "To modify phone number please enter (n)");

        char inputChar = input.nextLine().charAt(0);

        return inputChar;

    }   

    public static String modifyEmployeePromptValue(){ // modify employee value prompt

        Scanner input = new Scanner(System.in);

        System.out.printf("%s", "Please enter a new value:"); // prompt for value

        String value = input.nextLine();

        return value;

    }

    public static int[] deleteEmployeePrompt(){ // prompt for employee to delete

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n"
        , "Please enter the last name of the employee you wish to delete");

        String inputString = input.nextLine();

        int[] id = new int[inputString.length()];

        for(int i=0; i<inputString.length(); i++){
            
            id[i] = inputString.charAt(i)-96;

        }

        return id;

    }// end deleteEmployeePrompt


    public static int[] lookupEmployeePrompt(){ // prompt for employee to lookup

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n"
        , "Please enter the last name  of the employee you wish to lookup");

        String lastNameString = input.nextLine();

        int[] id = new int[lastNameString.length()];

        // convert last name to first 4 of id # 
        for(int i =0; i<lastNameString.length(); i++){ 

            id[i] = lastNameString.charAt(i)-96;

        }

        //input.close();

        return id
        ;

    } // end lookupEmployeePrompt

    
    public static Employee addEmployeePrompt(){ // prompt and store for each
        // person characteristic

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s", "You have chosen to add an employee"
        , "Please enter the employee's first name: ");

        String firstName = input.nextLine();

        System.out.printf("%s","Please enter the employee's last name: ");

        String lastName = input.nextLine();

        System.out.printf("%s","Please enter the employee's address: ");

        String address = input.nextLine();

        System.out.printf("%s","Please enter the employee's city: ");

        String city = input.nextLine();

        System.out.printf("%s","Please enter the employee's state: ");

        String state = input.nextLine();

        System.out.printf("%s","Please enter the employee's zip code: ");

        String zipCode = input.nextLine();

        System.out.printf("%s","Please enter the employee's email: ");

        String email = input.nextLine();

        System.out.printf("%s","Please enter the employee's phone number: ");

        String phoneNumber = input.nextLine();

        //input.close();

        Employee employee = new Employee(firstName, lastName, address, city , state
        , zipCode, email, phoneNumber);

        return employee;

    }
    
}
