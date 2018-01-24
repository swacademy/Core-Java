public class  Sorter{
	public static void main(String[] args) {
		String [] array = {"jkl", "ghi", "pqr", "abc", "def", "mno"};
		Sorter.sort(array);
		for(int i = 0 ; i < array.length ; i++){
			System.out.println(array[i]);
		}
	}
	static <T extends Comparable<T>> void sort(T [] a){
		for(int i = 0 ; i < a.length ; i++){
			for(int j = 0 ; j < i ; j++){
				if(a[j].compareTo(a[i]) > 0) {
					swap(a, i, j);
				}
			}
		}
	}
	static <T> void swap(T [] a, int i, int j){
		T t = a[i];   a[i] = a[j];   a[j] = t;
	}
}
