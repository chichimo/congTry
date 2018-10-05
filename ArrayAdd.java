
public class ArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a[][]= {{1,2,4},{5,4,6}};
		int b[][]= {{2,5,3},{3,6,8}};
		
		int c[][]=new int [2][3];
		
		for (int i=0; i<2; i++) {
			for (int j=0; i<3; j++) {
				c[i][j]= a[i][j]+b[i][j];
				System.out.println(c[i][j]+ " ");
			}
			
			System.out.println();
			
		}

	}

}
