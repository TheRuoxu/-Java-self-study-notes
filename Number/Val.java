package Number;

public class Val {
		static int times = 3; // 成员变量在整个类体中都有效
		public static void main(String[] args) {
				int times = 4;// 局部变量只在方法体中有用
				System.out.println("times的值为：" + times);
		}

}
