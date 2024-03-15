public class Node {
    
     Employee employee;
     Node leftNode;
     Node rightNode;

    Node(Employee employeeGiven){

        this.employee = employeeGiven;
        this.leftNode = null;
        this.rightNode = null;
    }

    Node( Employee employeeGiven, Node leftNodeGiven, Node rightNodeGiven) {

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
