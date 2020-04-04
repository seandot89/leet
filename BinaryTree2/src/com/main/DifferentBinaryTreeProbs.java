package com.main;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.soap.Node;

import com.model.TreeNode;

public class DifferentBinaryTreeProbs {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return Math.max(left_height, right_height) + 1;
        }
        
    }
    
    public int maxDepthBFS(Node root) {
        if(root == null) return 0;
        
        int depth = 0;
        
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                Node currentNode = queue.poll();
                for(Node child : currentNode.children){
                    queue.offer(child);
                }
            }
            
            depth++;            
        }
    
        return depth;
    }
    
    private int max_depth;
    public int maxDepthDFS(Node root) {
        if(root == null) return 0;
        getMaxDepth(root, 1);
        return max_depth;
    }
    
    public void getMaxDepthDFS(Node node, int depth){
        if(node == null) return;
        max_depth = Math.max(depth, max_depth);
        for(Node child : node.children) getMaxDepth(child, depth+1);
    }
}
