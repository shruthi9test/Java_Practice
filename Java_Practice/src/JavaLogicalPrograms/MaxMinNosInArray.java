package JavaLogicalPrograms;

public class MaxMinNosInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 50, 40, 30, 20, 10, 70 };

		int max = a[0]; // assuming max value is a(0) =50

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
				
				System.out.println("maximum value: " + a[i]);
			}
			
			
		}	
			int min = a[0]; //a[0] =50

			for (int j = 1; j < a.length; j++) {
				if ( a[j]<min) {
					min = a[j];
					System.out.println("minimum value is: " +a[j]);
				}
				
				}
			
			}
		}

	


