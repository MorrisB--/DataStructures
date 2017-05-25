/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {

    Stack<Node> stack = new Stack<Node>();
    if (root == null)
        return;
    
    stack.push(root);
    
    while(!stack.isEmpty()) {
        Node currentNode = stack.pop();
        
        if (currentNode.right != null)
            stack.push(currentNode.right);
        if (currentNode.left != null)
            stack.push(currentNode.left);
            
        System.out.print(currentNode.data + " ");
    }
}
