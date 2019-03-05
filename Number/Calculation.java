package Number;

public class Calculation {
		public static void main(String[] args) {
				int a = 2;
				int b = 5;
				boolean result = ((a > b) && (a != b));
				boolean result2 = ((a > b) || (a != b));
				System.out.println(result);
				System.out.println(result2);
				//  &&是逻辑与，两个为true才为true，否则为false
				//  ||是逻辑或，其中一个为true就为true，如果都是false就是false
				//  !是逻辑非，用于表达式前面，表达式为true则为false，表达式为false则为false
		}

}
