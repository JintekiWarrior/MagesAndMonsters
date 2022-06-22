package GameBoard;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;

// Character: Class all characters human or ai inherit
// User
// AI
// Mages
// Monsters
// GameInit
    // Story
    // Movement
    // Fighting

// GameBoard

public class Main
{
    public static void main(String[] args)
    {
        Scanner gameScanner = new Scanner(System.in);

        GameBoard board = new GameBoard();
        ArrayList<ArrayList <String>> boardArr = board.gameBoardListCreate();
        board.gameBoardListUpdate(boardArr, 6, 1, "A");
        board.gameBoardListUpdate(boardArr, 2, 2, "B");
        String boardStr = board.gameBoardStringCreate(boardArr);
        System.out.println(boardStr);

        int row = 6;
        int col = 1;
        while (true)
        {
            System.out.println("Where would you like to go?");
            char move;
            move = gameScanner.next().charAt(0);
            if (move == 't') break;
            int positionArr[] = board.moveCharacter(boardArr, move, "A", row, col);
            boardStr = board.gameBoardStringCreate(boardArr);
            row = positionArr[0];
            col = positionArr[1];
            System.out.println(boardStr);
        }

    }
}
