
public class SameTree {
    
    int val;
    SameTree left;
    SameTree right;
    SameTree() {}
    SameTree(int val) { this.val = val; }
    SameTree(int val, SameTree left, SameTree right) {
        this.val = val;
        this.left = left;
       this.right = right;
   }
}

 
class Solution {
    public boolean isSameTree(SameTree p, SameTree q) {
        if(q==null&&p==null){
            return true;
        
        }
        if (q==null||p==null){
            return false;
        }
        if(q.val!=p.val){
            return false;
        }
        return isSameTree(p.left, q.right)&&isSameTree(p.right, q.left);
    }
    public static void main(String args[]){
        int nodes_p[]={1,2,4};  
        int nodes_q[]={1,2,4}; 
        Solution sol=  new Solution() ;  
          sol.isSameTree(nodes_p,nodes_q);
}
}

// @lc code=end

