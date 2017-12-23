class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int tar=(target+1)%123;
        char c='\0';
        
        while(true){
            
            boolean found=binarySearch(letters,tar);
           
            // System.out.println((char)tar);
            //System.out.println(found);
            
            if(found==true){
                c=(char)tar;
                break;
            }
            tar=(tar+1)%123;
            
        }
        
        
        
        return c;
    }
    
    public boolean binarySearch(char letters[],int target){
        
        int first=0;
        int last=letters.length-1;
        
        while(first<=last){
            int mid=(first+last)/2;
            
           //System.out.println("First is: "+first);
           //System.out.println("Last is: "+last);
            //System.out.println("Mid is: "+mid);
            
            
           //System.out.println("In Search mid: "+ letters[mid]);
           //System.out.println("Target is: "+(char)target);
            
            if((int)(letters[mid])==target)
                return true;
            
            else if(target<(int)letters[mid])
                last=mid-1;
            else
                first=mid+1;
            
        }
        
        return false;
        
        
    }
}