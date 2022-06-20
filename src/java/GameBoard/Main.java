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
        System.out.println(board.gameBoardCreate());
    }
}
