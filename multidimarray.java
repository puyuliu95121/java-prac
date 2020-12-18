

public class multidimarray {

    public static void main(String[] args) {
		int [][] mdimarray = {
			{1,2},
			{3,4},
			{5,6},
			{7,8},
			{9,10},
		};			

		int num_of_col=mdimarray[0].length, num_of_row=mdimarray.length;
		
		for(int j=0; j<num_of_row ;j++){
			for(int k=0; k<num_of_col ;k++){
				System.out.print(mdimarray[j][k] + (k<num_of_col-1?", ":"\r\n"));
			}	
//			System.out.println();
		}
	}
}