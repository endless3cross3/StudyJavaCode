import java.util.ArrayList;

class test01 {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("book");
		float y = 212.9212F;
		int x = (int) y;
		System.out.println(x);
		System.out.println(aList.contains("book"));

		StringBuilder builder = new StringBuilder();
		builder.append("測試");
		builder.append("字串");
		builder.insert(1, "ABC");
		// builder.delete(4, 5);
		// builder.reverse();
		System.out.println(builder.toString());
		System.out.println(builder);
	}
}