package ordenamientostring;

public class metodos {
	public static void quicksort(String[] item, int left, int right) {
		int i, j;
		String temp;
		i = left;
		j = right;
		do {
			while (item[j].compareTo(item[i])>0 && j > i)
				j--;
			if (i < j) {
				temp = item[i];
				item[i] = item[j];
				item[j] = temp;
				i++;
			}
			while (item[i].compareTo(item[j])<0  && i < j)
				i++;
			if (i < j) {
				temp = item[i];
				item[i] = item[j];
				item[j] = temp;
				j--;
			}
		} while (i < j);
		if (left < j)
			quicksort(item, left, j - 1);
		if (i < right)
			quicksort(item, i + 1, right);
	}

	public static void shell(String[] v, int n) {
		int gap, i, j;
		String temp;
		for (gap = n / 2; gap > 0; gap /= 2)
			for (i = gap; i < n; i++)
				for (j = i - gap; j >= 0 && v[j].compareTo(v[j + gap]) >0 ; j -= gap) {
					temp = v[j];
					v[j] = v[j + gap];
					v[j + gap] = temp;
				}
	}

	public static <AnyType extends Comparable<? super AnyType>> void insertionSort(String[] a) {

		for (int p = 1; p < a.length; p++) {
			String tmp = a[p];
			int j = p;

			for (; j > 0 && a[j-1].compareTo(tmp) > 0; j--) {
				a[j] = a[j - 1];
			}		
			a[j] = tmp;

		}
	}

}
