public class Test {
	public static void main(String[] args) {
		getDuration(8274);
	}

	public static double convertToCentimeters(int i) {
		return i * 2.54;
	}

	public static double convertToCentimeters(int f, int i) {
		return convertToCentimeters(f * 12 + i);
	}

	public static void getDuration(int second) {
		int h = second / 3600;
		second -= h * 3600;
		int m = second / 60;
		second -= 60 * m;
		System.out.println(h + "h " + m + "m " + second + "s");
	}
}
