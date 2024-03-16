//Name: Davis Tyler
//Class: CS145
//Date: 3/15/2024
//file: Tree
//Resources: cs 145 Lectures
//Program: this program generates a binary search tree which represents a database of
// Employees. There are methods, to add, delete, modify, and lookup. 

public class Tree {

    Node globalRoot;

    Tree(Employee employeeGiven){ // constructor must have at least one person

        this.globalRoot= new Node(employeeGiven); //declare head node with reference
        // node null

    }

    public void add( Employee employeeGiven){ // public add method calls private add

        globalRoot = add(globalRoot, employeeGiven);

    }

    private Node add(Node root, Employee employeeGiven){ // private add method
        // recursion until finds null node

        if(root == null){
            root = new Node(employeeGiven);
        } else if(root.getEmployee().getId(0) > employeeGiven.getId(0)){
            root.leftNode = add(root.leftNode, employeeGiven);
        } else if(root.getEmployee().getId(0) <= employeeGiven.getId(0)){
            root.rightNode = add(root.rightNode, employeeGiven);
        }
        
        return root;

    }

    public void delete(int[] id){ // public delete method calls private delete method
        globalRoot = delete(globalRoot, id);
    }

    private Node delete(Node root, int[] id){ // private delete method recursive
        // until finds node with key that matches given key 

        if (root==null){
            return null;
        }else if(root.getEmployee().getId() == id){
            if(root.rightNode == null){
                return root.leftNode;
            } else if (root.leftNode == null){
                return root.rightNode;
            } 
            else {
                root.setEmployee(getMin(root.rightNode).getEmployee()); 
                root.rightNode = delete(root.rightNode, root.getEmployee().getId());
            }
        } else if(root.getEmployee().getId(0) >id[0]){
            root.leftNode = delete(root.leftNode, id);
        } else if(root.getEmployee().getId(0) <= id[0]){
            root.rightNode = delete(root.rightNode, id);
        }
        return root;

    }

    public void modify(int[] id, char type, String value){ // modify method takes
        // id for node to find, type for field to modify, and value to set field too.

        Node modifyNode = lookup( id); // create node whick represents node to modify
        int changeIndex = 0; // index to represent field to modify
        System.out.println("modifying:"); 
        modifyNode.getEmployee().print();
        String[] fields = modifyNode.getEmployee().getFields(); // get unmodified 
        // field values
        String[] newFields = new String[8]; // array to store modified field values

        if(type == 'f' ){ // if type first name

            changeIndex = 0;

        } else if(type == 'l'){ // if type last name

            changeIndex = 1;

        } else if(type == 'a'){ // if type add

            changeIndex = 2;
            
        } else if(type == 'c'){ // if type city

            changeIndex = 3;
            
        } else if(type == 's'){ // if type state

            changeIndex = 4;
            
        } else if(type == 'z'){ // if type zip code

            changeIndex = 5;
            
        } else if(type == 'e'){ // if type email

            changeIndex = 6;
            
        } else if(type == 'p'){ // if type phone number

            changeIndex = 7;

        }

        for(int j = 0; j < changeIndex; j++){ // replace all fields before 
            // field to modify
            newFields[j] = fields[j];
        }

        newFields[changeIndex] = value; // replace field to modify with value

        for(int i =changeIndex +1 ; i < 8; i++){ // replace all fields after
            // field to modify
            newFields[i] = fields[i];
        }
        

        Employee modifiedEmployee = new Employee(newFields);

        modifiedEmployee.print();

        modifyNode.setEmployee(modifiedEmployee);

    }



    public Node lookup(int[] id){ // public lookup method 
        // calls private lookup method
        
        Node lookup = lookup(globalRoot, id);

        return lookup;

    }

    private Node lookup(Node root, int[] id){ // private lookup method
        // calls itself until it finds node with key that matches given key. 

        if(root.getEmployee().getId(0)== id[0]){ 

            return root;

        } else if (root.getEmployee().getId(0) > id[0]){

             return lookup(root.leftNode, id);

        } else if ( root.getEmployee().getId(0)< id[0]){

             return lookup(root.rightNode, id);

        } else {

            System.out.print("else");

        }

        return globalRoot;

        
    }



    private Node getMin(Node root){ // method to get lowest value from given root

        if(root.leftNode==null){
            return root;
        } else{
            root = getMin(root.leftNode);
        }

        return root;
        
    }

}
