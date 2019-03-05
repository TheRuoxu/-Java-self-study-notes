package 第四章;

public class 作业2 {
		public static void main(String[] args) {
				for (int j = 1; j <= 5; j++) {
						for (int i = 1; i <= (7 - j); i++) {
								System.out.print(" ");
						}
						for (int k = 1; k <= (2 * j - 1); k++) {
								System.out.print("*");
										}
								System.out.print("\n");
						}
				for (int j = 6; j <= 9; j++) {
						for (int i = 1; i <= (j - 3); i++) {
								System.out.print(" ");
						}
						for (int k = (2 * (9 - j) + 1); k >= 1; k--) {
								System.out.print("*");
						}
						System.out.print("\n");
				}
			}
		}
