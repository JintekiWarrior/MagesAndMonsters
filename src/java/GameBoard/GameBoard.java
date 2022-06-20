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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameBoard {
    // creates a row of squares in the gameBoard
    private ArrayList<String> gameBoardRowListCreate()
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
    private String joinArrayList(ArrayList<String> gameBoardRowList, int index)
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

    // method to take a list of the gameboard and join it to a string
    public String gameBoardStringCreate(ArrayList<ArrayList <String>> arr)
    {
        String result = "";
        for (int i = 0; i < 7; i++)
        {
            result = result + this.joinArrayList(arr.get(i), i) + "\n";
        }
        return result;
    }

    // this updates the middle item in a block in a row
    // row should be 1 - 7 and column 1 - 9
    public void gameBoardListUpdate(ArrayList<ArrayList <String>> arr, int row, int col, String item)
    {
        ArrayList<String> updateRow = arr.get(row);
        updateRow.set(col + 9, "| " + item + " |");
    }

    // remove item from the gameBoardList
    public void gameBoardListRemove(ArrayList<ArrayList <String>> arr, int row, int col)
    {
        ArrayList<String> updateRow = arr.get(row);
        updateRow.set(col + 9, "|   |");
    }
}
