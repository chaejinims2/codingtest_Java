
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int match = 0;
        int zeroCount = 0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for (int i = 0; i < lottos.length; i++) {
            // �˾ƺ� �� ���� ��ȣ
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    match++;
                    break;
                }
            }
        }
        
        answer[0] = getRank(match + zeroCount);    // �˾ƺ� �� ���� ��ȣ�� ��� ��÷ ��ȣ�� ��ġ�� ���
        answer[1] = getRank(match);    // �˾ƺ� �� ���� ��ȣ�� ��� ��÷ ��ȣ�� ����ġ�� ���
        
        return answer;
    }
    
    public static int getRank(int n) {
        /**
         * ��ġ ������ ���� ���� ��ȯ
         * @param n ��ġ�� �ζ� ��ȣ ����
         * @return    �ش� ����
         */
        switch (n) {
        case 6:
            return 1;
        case 5:
            return 2;
        case 4:
            return 3;
        case 3:
            return 4;
        case 2:
            return 5;
        default:
            return 6;
        }
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] lotto = new int[6];
		for (int i = 0 ; i < 6 ; i++)
			lotto[i] = scanner.nextInt();		

		int[] win_num = new int[6];
		for (int i = 0 ; i < 6 ; i++)
			win_num[i] = scanner.nextInt();		
		
		System.out.println(Arrays.toString(solution(lotto, win_num)));
	    scanner.close();
	}
}





