package qsp1;

public class Pyramid {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  " +count++);
			}
			System.out.println();
		}
		
	

	}
}
