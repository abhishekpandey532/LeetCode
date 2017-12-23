/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<Integer> al=new ArrayList<Integer>();
    
    public boolean findTarget(TreeNode root, int k) {
        
    //    ArrayList<Integer> al=inOrder(root);
        
        inOrder(root);
        
        //System.out.println(al);
        
        for(int i=0;i<al.size();i++){
            int find=k-al.get(i);
            
            boolean found=binarySearch(i+1,al.size()-1,find);
            
            if(found==true)
                return true;
            
        }
        
        return false;
        
        
        
        
        //return true;
        
    }
    public boolean binarySearch(int start,int end,int find){
    
        while(start<=end){
            int mid=(start+end)/2;
            
            if(al.get(mid)==find){
                return true;
            }
            
            else if(al.get(mid)<find)
                start=mid+1;
            else
                end=mid-1;
            
        }
        
        return false;
        
        
        
    }
    
    
    public void inOrder(TreeNode root){
        
        if(root==null)
            return;
        
        inOrder(root.left);
        //System.out.println(root.val);
        al.add(root.val);
        inOrder(root.right);
        
        
        
        
    }
}