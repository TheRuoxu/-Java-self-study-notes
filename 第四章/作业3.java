package 第四章;

public class 作业3 {
		public static void main(String[] args) {
				double x = 0;
				double y = 0;
				double z = 1;
				double k = 1;
				while (k <= 20) {
						z = z * k;
						y = 1 / z;
						x = x + y;
						k++;
				}
				System.out.println(x);
		}

}
