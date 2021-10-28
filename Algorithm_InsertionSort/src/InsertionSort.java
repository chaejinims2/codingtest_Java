public class InsertionSort {
	public static void insertionSort(int[] a) {
		insertionSort(a, a.length);
	}
	
	private static void insertionSort(int[] a, int size) {
		for (int i=1 ; i<size ; i++) {
			
			// Ÿ�� �ѹ�
			int target = a[i];
			int j = i =1;
			
			// Ÿ���� ���� ���Һ��� ũ�� �� ���� �ݺ�
			while (j>=0 && target<a[j]) {
				a[j+1] = a[j]; // ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
				j--;
				
			}
			
			// �� �ݺ������� Ż���ϴ� ��� ���� ���Ұ� Ÿ�ٺ��� �۴ٴ� ��
			// �׷��Ƿ� Ÿ���� j+1��° ���ҿ� ��ġ (j��° ���� ��)
			a[j+1] = target;
			
		}
	}
}
