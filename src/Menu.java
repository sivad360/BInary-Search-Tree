import java.util.Scanner;

public class Menu {


    public static void welcome(){
        System.out.printf("s%n","Welcome to the employee database");
    }

    public static void selector(Tree tree){
        char mainInput = mainPrompt();

        if(mainInput =='a'){

            tree.add(addEmployeePrompt());

        } else if(mainInput =='d'){
            
            tree.delete(deleteEmployeePrompt());

        } else if(mainInput =='l'){
            
            tree.lookup(lookupEmployeePrompt());

        } else if(mainInput =='m'){
            
            

        } else if(mainInput =='n'){
            
            

        }



    }

    public static char mainPrompt(){

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n" // prompt for 
            , "To add an employee please enter (a)"
            , "To delete an employee please enter (d)"
            , "To lookup an employee please enter (l)"
            , "To modify an emplyees information please enter (m)"
            , "To modify phone number please enter (n)");

        char inputChar = input.nextLine().charAt(0);

        //input.close();

        return inputChar;

    }

    public static char modifyEmployeeprompt(){

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n" // prompt for which characteristic
            , "To modify first name please enter (f)"
            , "To modify last name please enter (l)"
            , "To modify city please enter (c)"
            , "To modify address please enter (a)"
            , "To modify phone number please enter (n)");

        char inputChar = input.nextLine().charAt(0);

        //input.close();

        return inputChar;

    }   

    public static int[] deleteEmployeePrompt(){

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n"
        , "Please enter the last name of the employee you wish to delete");

        String inputString = input.nextLine();

        int[] id = new int[inputString.length()];

        for(int i=0; i<inputString.length(); i++){
            
            id[i] = inputString.charAt(i)-96;

        }

        //input.close();

        return id;

    }

    public static int[] lookupEmployeePrompt(){

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

    }

    // prompt and store for each person characteristic
    public static Employee addEmployeePrompt(){ 

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
