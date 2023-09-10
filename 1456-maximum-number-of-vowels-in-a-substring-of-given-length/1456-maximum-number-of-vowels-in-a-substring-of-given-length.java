/*
통과 : 13ms, 74.88%
빅O : 시간복잡도는 O(N)이다.
설명 : isVowel은 상수 시간 내에 실행되므로 무시할 수 있고, 
for문에서 슬라이딩 윈도우를 이용하여 모음 개수를 계산하므로 시간 복잡도가 O(N)이다.

*/
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
