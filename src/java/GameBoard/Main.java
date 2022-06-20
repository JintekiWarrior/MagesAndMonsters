package GameBoard;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        GameBoard board = new GameBoard();
        ArrayList<ArrayList <String>> boardArr = board.gameBoardListCreate();
        String boardStr;
        board.gameBoardListUpdate(boardArr, 1, 1, "A");
        System.out.println(boardArr);
        boardStr = board.gameBoardStringCreate(boardArr);
        System.out.println(boardStr);

//        board.gameBoardListRemove(boardArr, 1, 1);
//        System.out.println(boardArr);
//        boardStr = board.gameBoardStringCreate(boardArr);
//        System.out.println(boardStr);
    }
}
