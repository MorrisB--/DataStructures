	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
        
        int leftHeight = -1;
        int rightHeight = -1;
        
        if (root != null) {
            if (root.left != null)
                leftHeight = height(root.left);
            if (root.right != null)
                rightHeight = height(root.right);
        }

        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
        
    }
