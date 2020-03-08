package com.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.model.TreeNode;

public class LevelTraversal {
	
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> rtnList = new LinkedList<List<Integer>>();
        fillList(rtnList, root, 0);
        return rtnList;      
        
        
    }
    
    public static void fillList(List<List<Integer>> rtnList, TreeNode root, int level){
        if(root==null)return;
        if(level>=rtnList.size())
            rtnList.add(0, new ArrayList<Integer>());
        fillList(rtnList, root.left, level+1);
        fillList(rtnList, root.right, level+1);
        
        rtnList.get(rtnList.size()-level-1).add(root.val);
        
        
    }
    
    public static void printTreeTraversal(List<List<Integer>> list) {
    	for(int i=0; i<list.size(); i++) {
    		ArrayList<Integer> tmpList = new ArrayList<Integer>();
    		tmpList = (ArrayList<Integer>) list.get(i);
    		System.out.print("[");
    		for(int j = 0; j < tmpList.size(); j++) {
    			System.out.print(tmpList.get(j));
    		}
    		System.out.print("]");
    		System.out.println();

    	}
    }
    
    public static void main(String[] args) {
    	TreeNode head = new TreeNode(3);
    	
    	head.left = new TreeNode(4);
    	head.left.left = new TreeNode(6);
    	head.left.right= new TreeNode(7);
    	head.right = new TreeNode(5);
    	head.right.left = new TreeNode(8);
    	head.right.right = new TreeNode(9);
    	
    	List<List<Integer>> prntList = new LinkedList<List<Integer>>();
    	
    	fillList(prntList,head,0);
    	
    	printTreeTraversal(prntList);
    	
//    	for(int i=0; i<printList.size(); i++) {
//    		ArrayList<Integer> tmpList = new ArrayList<Integer>();
//    		tmpList = (ArrayList<Integer>) printList.get(i);
//    		System.out.print("[");
//    		for(int j = 0; j < tmpList.size(); j++) {
//    			System.out.print(tmpList.get(j));
//    		}
//    		System.out.print("]");
//    		System.out.println();
//    	}
//    	
    	
    }
	
}
