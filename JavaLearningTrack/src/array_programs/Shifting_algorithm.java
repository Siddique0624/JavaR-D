package array_programs;

public class Shifting_algorithm {
	
	static void shift(int bjs[],int size) {
		int count=0;
		for(int i=0;i<size;i++) {
			if(bjs[i]!=0)
				bjs[count++]=bjs[i];
		}
		while(count<size) {
			bjs[count++]=0;
		}
		for(int i=0;i<size;i++) {
			System.out.print(bjs[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mobno[]= {3,6,0,5,9,0,6};
		int n=mobno.length;
		shift(mobno,n);
		/**for(int i=0;i<n;i++) {
			System.out.print(mobno[i]+" ");   //we can use this in above or here
		}*/
		
	}

}
