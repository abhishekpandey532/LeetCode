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
    
    List<Double> l=new ArrayList<Double>();

    ArrayList<TreeNode> al=new ArrayList<>();
    
    ArrayList<ArrayList<TreeNode>> dep=new ArrayList<ArrayList<TreeNode>>();
    
    public List<Double> averageOfLevels(TreeNode root) {
        
        //al.add(root);
        //int i=0;
        int depth=0;
        ArrayList<TreeNode> curr=new ArrayList<TreeNode>();
        //al.add()
        ArrayList<TreeNode> now;
        
        
        curr.add(root);
        //dep.add(curr);
            
        dep.add(0,curr);
        
        for(int i=0;i<dep.size();i++){
            
            //TreeNode nnode=al.remove(0);
            
            now=new ArrayList<TreeNode>();
            
            for(TreeNode t:dep.get(depth)){
                 if(t.left!=null)
                     now.add(t.left);
                 if(t.right!=null)
                     now.add(t.right);
            }
            if(now.size()==0)
                break;
            
            
            
            depth++;
            
            dep.add(depth,now);
            
           // System.out.println("Depth Array is: "+dep);
        }
        
        //System.out.println("Depth Array List is: "+dep);
        
        Double sum=0.0;
        
        for(int i=0;i<dep.size();i++){
            sum=0.0;
            for(TreeNode t:dep.get(i)){
              sum+=t.val;  
            }
            Double avg=sum/(dep.get(i).size());
            
            l.add(avg);
        }
        
        //System.out.println();
       // System.out.println("List is: "+l);
        
        
        return l;
        
        
        
        
        
       
        
    }
}