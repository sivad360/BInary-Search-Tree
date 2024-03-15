import java.util.Random;
public class Employee {

    private int[] id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String phoneNumber;

    Employee( String firstNameGiven, String lastNameGiven
        , String addressGiven, String cityGiven, String stateGiven
        , String zipCodeGiven, String emailGiven, String phoneNumberGiven){
        
        
        this.firstName = firstNameGiven.toLowerCase();
        this.lastName = lastNameGiven.toLowerCase();
        this.address = addressGiven.toLowerCase(); 
        this.city = cityGiven.toLowerCase();
        this.state = stateGiven.toLowerCase();
        this.zipCode = zipCodeGiven.toLowerCase();
        this.email = emailGiven.toLowerCase();
        this.phoneNumber = phoneNumberGiven.toLowerCase();
        this.id = new int[lastName.length()];
        
        for(int i = 0; i < lastName.length(); i++){
         id[i] = lastName.charAt(i)-96;
        }
        

        //create id number first four digits int representation of lastName a=1
        // b=2 etc... unless last name is shorter then first 2 digits represent lastName
        //last 4 (or 6) are randomly assigned. this is used for ordering and searching
        // the binary tree.
        
        


    }

    // set methods for each parameter
    public void setFirstName(String firstNameGiven){ 
        this.firstName = firstNameGiven;
    }
    public void setLastName(String lastNameGiven){
        this.lastName = lastNameGiven;
    }
    public void setAddress(String addressGiven){
        this.address = addressGiven;
    }
    public void setCity(String cityGiven){
        this.city = cityGiven;
    }
    public void setState(String stateGiven){
        this.state = stateGiven;
    }
    public void setZipCode(String zipCodeGiven){
        this.zipCode = zipCodeGiven;
    }
    public void setEmail(String emailGiven){
        this.email = emailGiven;
    }
    public void setPhoneNumber(String phoneNumberGiven){
        this.phoneNumber = phoneNumberGiven;
    }

    //get methods for each parameter

    public int getId(int index){
        return id[index];
    }

    public int[] getId(){
        return id;
    }

    public String getFirstName(){ 
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZipCode(){
        return zipCode;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    
    public void print(){

        System.out.printf("%s%s%n %s%s%n %s%s%n %s%s%n %s%s%n %s%s%n %s%s%n %s%s%n %s%s%n%n"
        ," First Name: ", firstName, "Last Name: ", lastName, "Address:"
        , address, "City: ", city, "State: ", state, "Zip Code: ", zipCode
        , "Email: ", email, "Phone Number: ", phoneNumber, "id: ", id[0]);
    
    }
}
