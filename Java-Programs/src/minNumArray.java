
public class minNumArray {

	public static void main(String[] args) {
	

		int abc[][] = {{1,2,3},{4,5,6},{0,2,7}};
		int min = abc[0][0];
		int minColumn = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (abc[i][j]<min) {
					min = abc[i][j];
					minColumn=j;
				}
			}
		}
		System.out.println(min);
		
		
		int k=0;
		int max=abc[k][minColumn];
		
		while(k<3) {
			if(abc[k][minColumn]>max) {
				max=abc[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
		
//		int max = abc[0][0];
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				if (abc[i][j]>max) {
//					max = abc[i][j];
//				}
//			}
//		}
//		System.out.println(max);
//		
	}

}
