
public class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
        // lottos���� 0�� ���� ī��Ʈ 
        int cnt = 0;
        for (int i ; lottos) 
            if (i == 0)
                cnt++;
        
        // win_nums���� lottos�� ���� ��ȣ�� ��� �迭
        int prd_nums[];
        // win_nums�� lottos ��ȣ ��
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
        
        int[] answer = {}; // �ְ� ���� ��ȣ, ���� ���� ��ȣ
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
