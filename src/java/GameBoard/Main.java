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
        String boardStr;
        board.gameBoardListUpdate(boardArr, 6, 1, "A");


        // Check if true if item is in array
        boolean expected;
        boolean actual;
        ArrayList<ArrayList <String>> boardList = board.gameBoardListCreate();
        board.gameBoardListUpdate(boardList, 1, 4, "A");
        System.out.println(boardList);
        expected = true;
        actual = board.isGameBoardItem(boardList, 1, 4);
        System.out.println(expected);
        System.out.println(actual);

        // Check for false if item is not in array
//        board.gameBoardListRemove(boardList, 1, 4);
//        System.out.println(boardList);
//        expected = false;
//        actual = board.isGameBoardItem(boardList, 1, 4);
//        System.out.println(expected);
//        System.out.println(actual);


//        System.out.println(boardArr);
//        boardStr = board.gameBoardStringCreate(boardArr);
//        System.out.println(boardStr);

//        board.gameBoardListRemove(boardArr, 1, 1);
//        System.out.println(boardArr);
//        boardStr = board.gameBoardStringCreate(boardArr);
//        System.out.println(boardStr);
    }
}
