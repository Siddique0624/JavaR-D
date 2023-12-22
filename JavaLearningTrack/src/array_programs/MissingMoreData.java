package array_programs;

public class MissingMoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int bjs[]= {8,15,29};
    int n=bjs.length;
    System.out.println("Length of teh array is "+n);
    int hub=0;
    for (int i=bjs[0];i<bjs[(n-1)];i++) {
    	
    	if (i==bjs[hub]) {
    		hub++;
    		continue;
    	}
                           System.out.println("The missing numbers are"+i);    
       }
	}

}
