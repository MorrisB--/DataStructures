/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root) {
    
    Stack<Integer> stack = new Stack<Integer>();

    // right nodes
    Stack<Integer> tempStack = new Stack<Integer>();
    Node currentNode = root.right;
    while (currentNode != null) {
        tempStack.push(currentNode.data);
        currentNode = currentNode.right;
    }
    // pushing tempStack into stack
    while (!tempStack.isEmpty()) 
        stack.push(tempStack.pop());    
    
    // root
    stack.push(root.data);
    
    // left nodes
    currentNode = root.left;
    while (currentNode != null){
        stack.push(currentNode.data);
        currentNode = currentNode.left;
    }
    
    while(!stack.isEmpty())
        System.out.print(stack.pop() + " ");
    
}
