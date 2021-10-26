
public class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
        // lottos에서 0의 개수 카운트 
        int cnt = 0;
        for (int i ; lottos) 
            if (i == 0)
                cnt++;
        
        // win_nums에서 lottos에 없는 번호를 담는 배열
        int prd_nums[];
        // win_nums과 lottos 번호 비교
        for(int lotto_num ; lottos){
            if(lotto_num != 0) {
                for(int win_num ; win_nums){
                    if(win_num == lotto_num) {
                        
                        break;
                    }
                }
                
            }
            else
                continue;
        }
        
        int[] answer = {}; // 최고 순위 번호, 최저 순위 번호
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
