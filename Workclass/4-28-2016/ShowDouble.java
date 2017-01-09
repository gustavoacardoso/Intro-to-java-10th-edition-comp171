import java.util.Scanner;
public class ShowDouble 
{
	static Scanner in = new Scanner(System.in); // if you want to make this variable available to everybody, defines it static and outside to main
	public static void main(String[] args) 
	{
		int numbers [][] = new int[3][3];
		Load_Array(numbers);
		Show_Array(numbers);
		Find2(numbers);
	}
	public static void Load_Array(int num[][])
	{
		int row=0,col=0;
		for(row=0;row<=2;++row) // if we change to col=0;col<=2;++col we'll change the direction of array when it will be printed  
		{
			for(col=0;col<=2;++col)
			{
				System.out.print("ENTER A NUMBER HERE: ");
				num[row][col]=in.nextInt();
			}
		}
	}
	public  static void Show_Array(int num[][])
	{
		int row=0,col=0;
		for(row=0;row<=2;++row)
		{
			for(col=0;col<=2;++col)
			{
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static void Find2(int num[][])
	{
		int row=0,col=0;
		for(row=0;row<=2;++row)
			for(col=0;col<=2;++col)
			{
				if(num[row][col]==3)
					System.out.println(num[row][col]+" IS IN LOCATION "+(row+1)+" "+(col+1));
			}
	}

}
