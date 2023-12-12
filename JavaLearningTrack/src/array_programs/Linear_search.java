package array_programs;

public class Linear_search {

	static int search(int hub[],int s) {
	for(int i=0;i<hub.length;i++) {
		if(hub[i]==s) {
			System.out.println( "key is found at index "+i);
		}
		 
	}
	return s;
	
 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int bjs[]= {345,76,67,66,98,4};
     int key=76;
     System.out.println(search(bjs,key));
	}

}
