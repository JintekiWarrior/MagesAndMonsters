package GameBoard;

//        System.out.println(" ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ ");
//        System.out.println("|   | 😀 |   |   |   |   |   |   |   |   |");
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
import java.util.List;
import java.util.stream.Collectors;

public class GameBoard {
    public String gameBoard;

    public ArrayList<String> gameBoardRowList;

    public ArrayList<ArrayList <String>> gameBoardList;

    public GameBoard()
    {
        gameBoardList = this.gameBoardListCreate();

    }

    // creates a row of squares in the gameBoard
    public ArrayList<String> gameBoardRowListCreate()
    {
        ArrayList<String> result = new ArrayList<>();
        // for loop to generate the start
        // for loop to generate the middle
        // for loop to generate the bottom
        String top = " ___ ";
        String middle = "|   |";
        String bottom = "|___|";
        for (int i = 0; i < 10; i++)
        {
            result.add(top);
            result.add(middle);
            result.add(bottom);
        }
        Collections.sort(result);

        return result;
    }

    // method to join the array list back to a string of blocks.
    public String joinArrayList(ArrayList<String> gameBoardRowList, int index)
    {
        List<String> gameBoardTopList = gameBoardRowList.subList(0, 9);
        List<String> gameBoardMidList = gameBoardRowList.subList(10, 19);
        List<String> gameBoardBotList = gameBoardRowList.subList(20, 29);

        String gameBoardTop = String.join("", gameBoardTopList);
        String gameBoardMid = String.join("", gameBoardMidList);
        String gameBoardBot = String.join("", gameBoardBotList);

        // only the top row needs to have a top.
        if (index == 0) return gameBoardTop + "\n" + gameBoardMid + "\n" + gameBoardBot;
        else return gameBoardMid + "\n" + gameBoardBot;
    }

    // method to create the list of the gameBoard
    public ArrayList gameBoardListCreate()
    {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (int i = 0; i < 8; i++)
        {
            result.add(gameBoardRowListCreate());
        }
        return result;
    }

    public String gameBoardCreate()
    {
        String result = "";
        for (int i = 0; i < 7; i++)
        {
            result = result + this.joinArrayList(gameBoardList.get(i), i) + "\n";
        }
        return result;
    }

    // this updates the middle item in a block in a row
    // column should be a number 1 - 10 for the blocks in a row
    public void gameBoardRowListUpdate(int column, String item)
    {
        column += 10;
        String[] blockArray = gameBoardRowList.get(column).split("");
        blockArray[2] = item;
        String updatedBlock = String.join("", blockArray);
        gameBoardRowList.set(column, updatedBlock);
    }

    public String getGameBoard() {
        return gameBoard;
    }

    public ArrayList<String> getGameBoardRowList() {
        return gameBoardRowList;
    }

//    public ArrayList<String> getGameBoardList() {
//        return gameBoardList;
//    }

    public void setGameBoard(String gameBoard) {
        this.gameBoard = gameBoard;
    }


}
