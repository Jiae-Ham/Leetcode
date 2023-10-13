class Solution {
    public void moveZeroes(int[] nums) {
		int len = nums.length;
		int n = 0;
		for(int i = 0; i < len ; ++i) {
			if(nums[i] != 0) 
				nums[n++] = nums[i];
		}
		for(int i = n; i<len; ++i) {
			nums[i] = 0;
		}
		for(int v : nums)
		System.out.printf("%d, ", v);

	}
}