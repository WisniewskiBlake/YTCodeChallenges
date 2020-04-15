package NQueens;

/**
 * NQueens
 */
public class NQueens {
    private int[][] chessTable;
	private int numOfQueens;
	
	public NQueens(int numOfQueens) {
		this.chessTable = new int[numOfQueens][numOfQueens];
		this.numOfQueens = numOfQueens;
    }
    
    public void solve() {
		
		if( setQueens(0) ) {
			printQueens();
		} else {
			System.out.println("There is no solution...");
		}
	}
    
}