
public class L2023140022_19_Test extends Solution19 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[][] board={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        Solution19.gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            System.out.print("[");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}