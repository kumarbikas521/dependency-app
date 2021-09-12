public class ArrayManipulation {
	
	public static void main(String[] args) {
		
		String s1="abc";
		String s2="abc";
		
		int arr[][] = new int[5][5];
		System.out.println( Math.random()*10);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] =  (int) (((Math.random())*100)/10);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < (arr.length-2); i++) {
			for (int j = i; j <i+ 3; j++) {
				for (int j2 = i; j2 <i+3; j2++) {

					System.out.print(arr[j][j2]);
				}
				System.out.println();
			}			
		}
	}
}
