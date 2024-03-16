//Name: Davis Tyler
//Class: CS145
//Date: 3/15/2024
//file: Node
//Resources: cs 145 Lectures
//Program: this program generates a binary search tree which represents a database of
// Employees. There are methods, to add, delete, modify, and lookup. 

public class Node {
    
     Employee employee; // class stores information about employees
     Node leftNode; // reference to right node
     Node rightNode; // reference to left node

    Node(Employee employeeGiven){ // constructor for leaf

        this.employee = employeeGiven;
        this.leftNode = null;
        this.rightNode = null;
    }

    Node( Employee employeeGiven, Node leftNodeGiven, Node rightNodeGiven) { 
        // constructor for branch

        this.employee = employeeGiven;
        this.leftNode = leftNodeGiven;
        this.rightNode = rightNodeGiven;

    }

    public void setEmployee(Employee employeeGiven){ // set employee

        this.employee = employeeGiven;

    }

    public void setLeftNode(Node leftNodeGiven){ // set left branch

        this.leftNode = leftNodeGiven;

    }

    public void setRightNode(Node rightNodeGiven){ // set right branch

        this.rightNode = rightNodeGiven;
        
    }
    
    public Employee getEmployee(){ 

        return this.employee;

    }

    public Node getLeftNode(){

        return this.leftNode;

    }

    public Node getRightNode(){

        return this.rightNode;

    }
}
