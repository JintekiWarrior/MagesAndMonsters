package GameBoard;

//     ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
//    |   |   |   |   |   |   |   |   |   |   |
//    |___|___|___|___|___|___|___|___|___|___|
//    |   |   |   |   |   |   |   |   |   |   |
//    |___|___|___|___|___|___|___|___|___|___|
//    |   |   |   |   |   |   |   |   |   |   |
//    |___|___|___|___|___|___|___|___|___|___|
//    |   |   |   |   |   |   |   |   |   |   |
//    |___|___|___|___|___|___|___|___|___|___|
//    |   |   |   |   |   |   |   |   |   |   |
//    |___|___|___|___|___|___|___|___|___|___|
//    |   |   |   |   |   |   |   |   |   |   |
//    |___|___|___|___|___|___|___|___|___|___|

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameBoard {
    // creates a row of squares in the gameBoard
    private ArrayList<String> gameBoardRowListCreate()
    {
        ArrayList<String> result = new ArrayList<>();

        // first column is different then the rest
        String topStart = " ___ ";
        String middleStart = "|   |";
        String bottomStart = "|___|";

        String topMain = "___ ";
        String middleMain = "   |";
        String bottomMain = "___|";
        for (int i = 0; i < 10; i++)
        {
            if (i == 0)
            {
                result.add(topStart);
                result.add(middleStart);
                result.add(bottomStart);
            }else
            {
                result.add(topMain);
                result.add(middleMain);
                result.add(bottomMain);
            }
        }
        Collections.sort(result);

        return result;
    }

    // method to join the array list back to a string of blocks.
    private String joinArrayList(ArrayList<String> gameBoardRowList, int index)
    {
        // Items that go to the first column
        String startTop = gameBoardRowList.get(9);
        String startMiddle = gameBoardRowList.get(28);
        String startBottom = gameBoardRowList.get(29);

        List<String> gameBoardTopList = gameBoardRowList.subList(10, 18);
        List<String> gameBoardMidList = gameBoardRowList.subList(0, 8);
        List<String> gameBoardBotList = gameBoardRowList.subList(19, 27);

        String gameBoardTop = String.join("", gameBoardTopList);
        String gameBoardMid = String.join("", gameBoardMidList);
        String gameBoardBot = String.join("", gameBoardBotList);

        // only the top row needs to have a top.
        if (index == 0) return startTop + gameBoardTop + "\n" + startMiddle + gameBoardMid + "\n" + startBottom + gameBoardBot + "\n";
        else if (index == 6) return startMiddle + gameBoardMid + "\n" + startBottom + gameBoardBot;
        else return startMiddle + gameBoardMid + "\n" + startBottom + gameBoardBot + "\n";
    }

    // method to create the list of the gameBoard
    public ArrayList gameBoardListCreate()
    {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (int i = 0; i < 7; i++)
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
            result = result + this.joinArrayList(arr.get(i), i);
        }
        return result;
    }

    // this updates the middle item in a block in a row
    // row should be 1 - 7 and column 1 - 9
    public void gameBoardListUpdate(ArrayList<ArrayList <String>> arr, int row, int col, String item)
    {
        if (row < 0 || row > 6) System.out.println("Row out of bounds");
        if (col < 0 || col > 8) System.out.println("Column is out of bounds");
        // first column is different then the rest
        if (col == 0)
        {
            ArrayList<String> updateRow = arr.get(row);
            updateRow.set(28, "| " + item + " |");
        } else
        {
            ArrayList<String> updateRow = arr.get(row);
            updateRow.set(col - 1, " " + item + " |");
        }
    }

    // remove item from the gameBoardList
    public void gameBoardListRemove(ArrayList<ArrayList <String>> arr, int row, int col)
    {
        // first column is different then the rest
        if (col == 0)
        {
            ArrayList<String> updateRow = arr.get(row);
            updateRow.set(28, "|   |");
        } else
        {
            ArrayList<String> updateRow = arr.get(row);
            updateRow.set(col - 1, "   |");
        }
    }

    // Checks whether a block on the gameBoard is empty
    public boolean isGameBoardItem(ArrayList<ArrayList <String>> arr, int row, int col)
    {
        if (col == 0)
        {
            ArrayList<String> checkRow = arr.get(row);
            String[] elementArr = checkRow.get(28).split("");
            String check = (String) Array.get(elementArr, 2);
            return !check.equals(" ");
        }
        ArrayList<String> checkRow = arr.get(row);
        String[] elementArr = checkRow.get(col - 1).split("");
        String check = (String) Array.get(elementArr, 1);
        return !check.equals(" ");
    }
}
