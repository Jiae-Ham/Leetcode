/*
통과, 2ms, 68.29%
빅O : O(N log N)
이유 : Arrays.sort는 배열을 정렬하는 알고리즘으로 시간 복잡도가 O(N log N)이다. 코드의 나머지 부분은 상수 시간 또는 무시할 만큼 작은 시간을 소요하므로 전체 시간 복잡도는 O(N log N)이다.
*/
class Solution {
    public char findTheDifference(String s, String t) {
			char[] sr = s.toCharArray();
			char[] tr = t.toCharArray();
			Arrays.sort(sr);
			Arrays.sort(tr);
					
			int minLength = Math.min(sr.length, tr.length); // 두 배열 중 짧은 길이 선택
					
			for(int i=0; i<minLength; i++) {
				if(sr[i] != tr[i]) return tr[i];
			}

				
			return tr[tr.length-1];
		}
}