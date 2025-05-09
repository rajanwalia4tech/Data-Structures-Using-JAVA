package backtracking;
import java.util.Scanner;
public class KnightTour {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the board Size : ");
        int n = sc.nextInt();
        System.out.println("Enter the knight's position of Row and Column No. : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]chess = new int[n][n];
        int move = 1; // Starting move = 1
        printKnightMoves(chess,row,col,move);
	}
	
	static boolean isKnightSafe(int [][]chess,int row,int col) {
		if(row<0 || col<0 || row>=chess.length ||
				col>=chess.length || chess[row][col]!=0)
			return false;
		return true;
	}

	private static void printKnightMoves(int[][] chess, int row, int col, int move) {
		if(move == chess.length*chess.length && isKnightSafe(chess,row,col)) {
			chess[row][col] = move;	// set move
			displayBoard(chess);
	        chess[row][col] = 0;	// reset move
	        return ;
		}
		if(isKnightSafe(chess,row,col)) {
			chess[row][col] = move;
			// following are the 8 positions in which knight can move
			printKnightMoves(chess,row-2,col+1,move+1);
			printKnightMoves(chess,row-1,col+2,move+1);
			printKnightMoves(chess,row+1,col+2,move+1);
			printKnightMoves(chess,row+2,col+1,move+1);
			printKnightMoves(chess,row+2,col-1,move+1);
			printKnightMoves(chess,row+1,col-2,move+1);
			printKnightMoves(chess,row-1,col-2,move+1);
			printKnightMoves(chess,row-2,col-1,move+1);
			chess[row][col] = 0;  //Backtracking -- reset the move 
		}
	}
	
	public static void displayBoard(int [][]chess) {
		 for(int i=0;i<chess.length;i++) {
				for(int j=0;j<chess.length;j++) {
					System.out.print(chess[i][j]+" ");
				}
				System.out.println();
			}
         System.out.println();
	}

}
