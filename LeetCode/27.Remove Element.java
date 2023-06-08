 
 //does work in ide but leetcode doesnt accept it.
 
 public static int [] removeElement(int[] nums, int val) {

    return Arrays.stream(nums).filter(x->x!=val).toArray().length;
    }
    //leetcode accepts it
  public int removeElement(int[] nums, int val) {
          int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
