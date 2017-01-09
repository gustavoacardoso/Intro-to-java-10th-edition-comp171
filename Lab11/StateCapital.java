import java.util.Scanner;
public class StateCapital 
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) 
	{
		String[][] state = new String[2][5];
		state[0][0] = "New Jersey";
		state[1][0] = "TRENTON";
		state[0][1] = "New York";
		state[1][1] = "ALBANY";
		state[0][2] = "Pennsylvania";
		state[1][2] = "HARRISBURG";
		state[0][3] = "Connecticut";
		state[1][3] = "HARTFORD";
		state[0][4] = "Delaware";
		state[1][4] = "DOVER";
		
		int count = 0;

		for (int row = 0; row < 1; row++)
			for (int col = 0; col < state[row].length; col++) 
			{
				System.out.print("What is the capital of " + state[row][col] + "? ");
				String st = in.nextLine();

				if (st.equalsIgnoreCase(state[1][col])) 
				{
					System.out.println("Your answer is correct\n");
					count++;
				} else 
				{
					System.out.println("The correct answer should be " + state[1][col] + "\n");
				}

			}
		System.out.println("The correct count is " + count);
	}

}
