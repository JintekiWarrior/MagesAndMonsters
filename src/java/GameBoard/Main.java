package GameBoard;

public class Main
{
    public static void main(String[] args)
    {
        GameBoard board = new GameBoard();
        System.out.println(board.getGameBoardRowList());
        board.updateRow(3, 'O');
        System.out.println(board.getGameBoardRowList());
    }
}
