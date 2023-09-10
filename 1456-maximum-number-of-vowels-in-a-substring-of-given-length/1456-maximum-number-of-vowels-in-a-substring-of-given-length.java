class Solution {
   int isVowel(char c) {
		return (c == 'a' | c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
	}
	
	//슬라이딩 윈도우 문제
	public int maxVowels(String s, int k) {
		//char[] sr = s.toCharArray(); 
	
		int count =0;
		int max = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(i>=k) count -= isVowel(s.charAt(i-k));
			
			count += isVowel(s.charAt(i));//누적합 사용
			if(count > max) {
				max = count;
			}
		}
		return max;
	}
}