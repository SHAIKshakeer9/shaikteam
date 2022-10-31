package practice;

public class nestedloop {

	public static void main(String[] args) {

		//creating nested loop
		//i=row
		//j=column 
		//exercise
		//1 2 3 4     1row 4column
		//5 6 7       2row 3column
		//8 9         3row 2column
		//10          4row 1column
		
		
		int k=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
			System.out.print(k);
			k++;
			System.out.print("\t");
			}
			System.out.println("");
		}
	}

}
