package gameaku;
import java.util.Random;
import java.util.Scanner;

public class GameDrop {
    private int numOfPieces;
    private int sizeOfColumn;
    private char[][] gameBoard;
    private Random random;

    public GameDrop() {
        random = new Random();
    }

    public void setUpGame() {
        System.out.print("Enter the number of pieces: ");
        Scanner scanner = new Scanner(System.in);
        numOfPieces = scanner.nextInt();

        System.out.print("Enter the size of column: ");
        sizeOfColumn = scanner.nextInt();

        gameBoard = new char[sizeOfColumn][numOfPieces];
        for (int i = 0; i < sizeOfColumn; i++) {
            for (int j = 0; j < numOfPieces; j++) {
                gameBoard[i][j] = '-';
            }
        }
    }

    public void startGame() {
        for (int i = 0; i < numOfPieces; i++) {
            dropPiece(getRandomColor());
            displayBoard();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void dropPiece(char color) {
        int column = random.nextInt(sizeOfColumn);
        for (int i = sizeOfColumn - 1; i >= 0; i--) {
            if (gameBoard[i][column] == '-') {
                gameBoard[i][column] = color;
                break;
            }
        }
    }

    public char getRandomColor() {
        int index = random.nextInt(3);
        switch (index) {
            case 0:
                return 'R';
            case 1:
                return 'G';
            case 2:
                return 'B';
            default:
                return 'R';
        }
    }

    public void displayBoard() {
        for (int i = 0; i < sizeOfColumn; i++) {
            for (int j = 0; j < numOfPieces; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GameDrop gameDrop = new GameDrop();
        gameDrop.setUpGame();
        gameDrop.startGame();
    }
}