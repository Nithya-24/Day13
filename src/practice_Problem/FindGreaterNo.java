package practice_Problem;

public class FindGreaterNo{
	public static <T extends Comparable<T>> T maximum (T x, T y , T z) {
		T max = x;
		
		if(y.compareTo(max) > 0) {
			max = y;
		}
		
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args)  {
		System.out.println("Maximum of 3 Nos: " + maximum (8, 4, 5));
		System.out.println("Maximum of 3 Floating Nos: " + maximum (8.5, 4.5, 5.5));
		System.out.println("Maximum of 3 Strings: " + maximum ("Apple", "Peach", "Banana"));
		
	}
}
