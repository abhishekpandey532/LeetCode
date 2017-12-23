class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int answer[]=new int[2];
        
        for(int i=0;i<numbers.length;i++){
            
            int index2=binarySearch(numbers,i+1,numbers.length-1,target-numbers[i]);
            
            if(index2!=-1){
                answer[0]=i+1;
                answer[1]=index2+1;
                break;
            }
        }
        
        return answer;
    }
    
    
    public int binarySearch(int nums[],int start,int end,int find){
        //System.out.println(find);
        while(start<=end){
            int mid=(start+end)/2;
            
            if(nums[mid]==find){
                return mid;
            }
            else if(nums[mid]<find)
                start=mid+1;
            else
                end=mid-1;
        }
        
        return -1;
        
        
        
        
    }
}