import java.util.Scanner;
class TicTacToe
{
	int matrix[][]=new int[3][3];
	public static void main(String[] args) {
		System.out.println("Enter inputs");
		Scanner sc=new Scanner(System.in);
		int input[]=new int[9];
		for(int i=0;i<9;i++){
			input[i]=sc.nextInt();
		}

		int k=3;
		
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++ ) {
				matrix[i][j]=k++;
			}
		}
	}

	public static void check(){

        int sumX, sum0;
        //Row loop
        //Toast.makeText(getBaseContext(),"Check",Toast.LENGTH_SHORT).show();
        for (int i = 0; i < 3; i++)
        {
            sumX = 0;
            sum0 = 0;
            for(int j=0;j<3;j++)
            {
                if(matrix[i][j]==1)
                {
                   // Toast.makeText(getBaseContext(),""+matrix[i][j],Toast.LENGTH_SHORT).show();
                    sumX++;
                   // Log.d("********",""+sumX);
                }
                else if(matrix[i][j]==2)
                {
                    sum0++;
                }
                if (sumX == 3)
                {
                    String Text = "Player 1 won the game";
                    //Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
                    //this.Enabled = false;
                    //disable();
                    break;
                }
                else if (sum0 == 3)
                {
                    String Text = "Player 2 won the game";
                    //Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
                    //disable();
                    //this.Enabled = false;
                    break;
                }
            }
        }
        //Column Loop
       for (int i = 0; i < 3; i++)
        {
            sumX = 0;
            sum0 = 0;
            for (int j = 0; j < 3; j++)
            {
                if (matrix[j][i] == 1)
                {
                    sumX++;
                }
                else if (matrix[j][i] == 2)
                {
                    sum0++;
                }
                if (sumX == 3)
                {
                    String Text = "Player 1 won the game";
                    //Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
                    //this.Enabled = false;
                    //disable();
                    break;
                }
                else if (sum0 == 3)
                {
                    String Text = "Player 2 won the game";
                    //Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
                    //this.Enabled = false;
                    //disable();
                    break;
                }
            }
        }
        //Diagnol1 Loop
        sumX = 0;
        sum0 = 0;
        for (int i = 0; i < 3; i++)
        {

            if (matrix[i][ i] == 1)
            {
                sumX++;
            }
            else if (matrix[i][ i] == 2)
            {
                sum0++;
            }
            if (sumX == 3)
            {
                String Text = "Player 1 won the game";
                //Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
                //this.Enabled = false;
                //disable();
                break;
            }
            else if (sum0 == 3)
            {
                String Text = "Player 2 wont the game";
                //Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
                //this.Enabled = false;
                //disable();
                break;
            }

        }
        //Diagnol2 Loop
        sumX = 0;
        sum0 = 0;
        for (int i = 0; i < 3; i++)
        {

            for (int j = 0; j < 3; j++)
            {
                if (i + j == 2)
                {
                    if (matrix[i][ j] == 1)
                    {
                        sumX++;
                    }
                    else if (matrix[i][ j] == 2)
                    {
                        sum0++;
                    }
                    if (sumX == 3)
                    {
                        String Text = "Player 1 won the game";
                        //this.Enabled = false;
                       // Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
                        //disable();
                        break;
                    }
                    else if (sum0 == 3)
                    {
                        String  Text = "Player 2 won the game";
                        //Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
                        //disable();
                        break;
                    }
                }
            }
        }
        if(z==9) {
            String Text = "It's a draw";
            //Toast.makeText(getBaseContext(),Text,Toast.LENGTH_LONG).show();
        }

    }
}