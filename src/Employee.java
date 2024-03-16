//Name: Davis Tyler
//Class: CS145
//Date: 3/15/2024
//file: Test
//Resources: cs 145 Lectures
//Program: this program generates a binary search tree which represents a database of
// Employees. There are methods, to add, delete, modify, and lookup. 

import java.util.Random;

public class Employee { //

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

    }


    Employee(String[] fields){

        this.firstName = fields[0].toLowerCase();
        this.lastName = fields[1].toLowerCase();
        this.address = fields[2].toLowerCase(); 
        this.city = fields[3].toLowerCase();
        this.state = fields[4].toLowerCase();
        this.zipCode = fields[5].toLowerCase();
        this.email = fields[6].toLowerCase();
        this.phoneNumber = fields[7].toLowerCase();
        this.id = new int[lastName.length()];

        for(int i = 0; i < lastName.length(); i++){
            id[i] = lastName.charAt(i)-96;
        }

    }


    public String[] getFields(){
        String[] fields = new String[8];
        fields[0] = this.firstName;
        fields[1] = this.lastName;
        fields[2] = this.address;
        fields[3] = this.city;
        fields[4] = this.state;
        fields[5] = this.zipCode;
        fields[6] = this.email;
        fields[7] = this.phoneNumber;

        return fields;

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
