package Number;

public class Calculation {
		public static void main(String[] args) {
				int a = 2;
				int b = 5;
				boolean result = ((a > b) && (a != b));
				boolean result2 = ((a > b) || (a != b));
				System.out.println(result);
				System.out.println(result2);
				//  &&���߼��룬����Ϊtrue��Ϊtrue������Ϊfalse
				//  ||���߼�������һ��Ϊtrue��Ϊtrue���������false����false
				//  !���߼��ǣ����ڱ��ʽǰ�棬���ʽΪtrue��Ϊfalse�����ʽΪfalse��Ϊfalse
		}

}
