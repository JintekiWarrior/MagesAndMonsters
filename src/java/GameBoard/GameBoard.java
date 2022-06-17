package GameBoard;

//        System.out.println(" ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ");
//        System.out.println("|   |   |   |   |   |   |   |   |   |   |");
//        System.out.println("|___|___|___|___|___|___|___|___|___|___|");
//        System.out.println("|   |   |   |   |   |   |   |   |   |   |");
//        System.out.println("|___|___|___|___|___|___|___|___|___|___|");
//        System.out.println("|   |   |   |   |   |   |   |   |   |   |");
//        System.out.println("|___|___|___|___|___|___|___|___|___|___|");
//        System.out.println("|   |   |   |   |   |   |   |   |   |   |");
//        System.out.println("|___|___|___|___|___|___|___|___|___|___|");
//        System.out.println("|   |   |   |   |   |   |   |   |   |   |");
//        System.out.println("|___|___|___|___|___|___|___|___|___|___|");
//        System.out.println("|   |   |   |   |   |   |   |   |   |   |");
//        System.out.println("|___|___|___|___|___|___|___|___|___|___|");

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class GameBoard {
    public ArrayList<String> gameBoard;

    public ArrayList<String> gameBoardRowList;

    public GameBoard()
    {
        gameBoardRowList = gameBoardRowListCreate();
    }

    // creates a row of squares in the gameBoard
    public ArrayList<String> gameBoardRowListCreate()
    {
        gameBoardRowList = new ArrayList<>();
        // for loop to generate the start
        // for loop to generate the middle
        // for loop to generate the bottom
        String top = " ___ ";
        String middle = "|   |";
        String bottom = "|___|";
        for (int i = 0; i < 10; i++)
        {
            gameBoardRowList.add(top);
            gameBoardRowList.add(middle);
            gameBoardRowList.add(bottom);
        }
        Collections.sort(gameBoardRowList);

        return gameBoardRowList;
    }

    // this updates the middle item in a block in a row
    // column should be a number 1 - 10 for the blocks in a row
    public void updateRow(int column, char item)
    {
        column += 10;
        char[] blockArray = gameBoardRowList.get(column).toCharArray();
        Array.setChar(blockArray, 2, item);
        String updatedBlock = String.valueOf(blockArray);
        gameBoardRowList.set(column, updatedBlock);
    }

    public ArrayList getGameBoard() {
        return gameBoard;
    }

    public ArrayList<String> getGameBoardRowList() {
        return gameBoardRowList;
    }

    public void setGameBoard(ArrayList gameBoard) {
        this.gameBoard = gameBoard;
    }


}
