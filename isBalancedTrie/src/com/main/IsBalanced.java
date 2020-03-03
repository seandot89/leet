package com.main;

import com.model.TreeNode;

public class IsBalanced {

    public int height(TreeNode root){
        if(root == null)
            return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
            
    }
    
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
            return true;
        
        return Math.abs(height(root.left) - height(root.right)) < 2
            && isBalanced(root.left)
            && isBalanced(root.right);
        
     
        
        
        
    }
}
