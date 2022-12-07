import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static LinkedList<Node> queue = new LinkedList<>();

    static void levelOrder(Node root){
      
      //we print the root
      System.out.printf("%d ",root.data);
      
      //push non-null children in the queue
      if(root.left!=null) 
            queue.add(root.left);
      if(root.right!=null) 
            queue.add(root.right);
      if(!queue.isEmpty())
      { 
            //check for base case
            levelOrder(queue.remove());
      }
    }


public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}