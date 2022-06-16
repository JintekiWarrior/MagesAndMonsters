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

import java.util.ArrayList;

public class GameBoard {
    public String gameBoard;
    public ArrayList<String> gameBoardRowList;

    public GameBoard()
    {
        gameBoardRowList = gameBoardRowListCreate();
    }

    // creates a row of squares in the gameBoard
    public ArrayList<String> gameBoardRowListCreate()
    {
        ArrayList<String> gameBoardRowList = new ArrayList<>();
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

        return gameBoardRowList;
    }

    public ArrayList getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(ArrayList gameBoard) {
        this.gameBoard = gameBoard;
    }


}
