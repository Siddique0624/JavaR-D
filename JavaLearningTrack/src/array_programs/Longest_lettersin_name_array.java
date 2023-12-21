package array_programs;

public class Longest_lettersin_name_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String friends[]= {"Siddique","Umar","Irfan","Taj"};//defining frnds name array
    int maxlength=0;
    String longname=null;
    for(String s:friends) {                                        //assigning frnd array to string array s using Enhanced loop
    	if(s.length()>maxlength) {                                //comparing the length of each name with maxlength ie 0
    		maxlength=s.length();                                 //if value is greater thean 0 we assign that to s.length
    		longname=s;                                           //and the array name is assigned to longname
    	}
    	
    }
    System.out.println(longname);
		
	}

}
