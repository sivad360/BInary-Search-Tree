public class Tree {

     Node globalRoot;


    Tree(Employee employeeGiven){ // constructor must have at least one person

        this.globalRoot= new Node(employeeGiven); //declare head node with reference node null

    }

    public void add( Employee employeeGiven){

        globalRoot = add(globalRoot, employeeGiven);

    }

    private Node add(Node root, Employee employeeGiven){

        if(root == null){
            root = new Node(employeeGiven);
        } else if(root.getEmployee().getId(0) > employeeGiven.getId(0)){
            root.leftNode = add(root.leftNode, employeeGiven);
        } else if(root.getEmployee().getId(0) <= employeeGiven.getId(0)){
            root.rightNode = add(root.rightNode, employeeGiven);
        }
        
        return root;



    }

    public void delete(int[] id){
        globalRoot = delete(globalRoot, id);
    }

    private Node delete(Node root, int[] id){

        if (root==null){
            return null;
        }else if(root.getEmployee().getId() == id){
            if(root.rightNode == null){
                return root.leftNode;
            } else if (root.leftNode == null){
                return root.rightNode;
            } 
            else {
                //System.out.print("has left and right");
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

    public void modify(int[] id, char type, String Value){

    }



    public void lookup(int[] id){
        
        lookup(globalRoot, id);
    }
    private void lookup(Node root, int[] id){

        if(root.getEmployee().getId(0)== id[0]){
            root.getEmployee().print();
        } else if (root.getEmployee().getId(0) > id[0]){
            lookup(root.leftNode, id);

        } else if ( root.getEmployee().getId(0)< id[0]){
            lookup(root.rightNode, id);
        } else {
            System.out.print("else");
        }



        
    }



    private Node getMin(Node root){

        if(root.leftNode==null){
            return root;
        } else{
            root = getMin(root.leftNode);
        }

        return root;
        
    }

}
