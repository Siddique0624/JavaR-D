package array_programs;

public class Minmax_assignment1 {
  int x,y,z;
	 static void min(int data[]) {
			int min=data[0];
			
			for(int i =1;i<data.length;i++) {
				if(min>data[i]) {
					min=data[i];
				}
			}
			System.out.println(min);
		
		}
	 
	 static void max(int data[]) {
			int max=data[0];
			
			for(int i =1;i<data.length;i++) {
				if(max<data[i]) {
					max=data[i];
				}
			}
			System.out.println(max);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int mydata[]= {100,90,25,6,400,2,95};
    min(mydata);
    max(mydata);
    
    
 
	}

}
