package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numb;
		int countOfStars;
		int row;
		boolean increase;

		System.out.println("input the number");
		numb = sc.nextInt();
		sc.close();
		
		increase = true;
		countOfStars = 0;
		row = 1;
		do {
			System.out.print("*");
			countOfStars = countOfStars + 1;
			
			if (countOfStars == row) {
				System.out.println();
				countOfStars = 0;
				if (increase) {
					row = row + 1;
				} else {
					row = row - 1;
				};
				
				if (row == numb) {
					increase = false;
				}
				
			}
			
		} while(row >=1);
		
	}

}
