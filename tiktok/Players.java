
import java.util.Arrays;
import java.util.Scanner;

class Players{

    public boolean turn(Players player, String name, char grid[][], char symbol, Scanner sc, int count){
        System.out.println(name+" turn");
        for(char g[] : grid){
            System.out.println(Arrays.toString(g));
        }

        System.out.println("Enter x Coordinates ");
        int x = sc.nextInt();
        System.out.println("Enter y Coordinates ");
        int y = sc.nextInt();

        if(x >= grid.length || y >= grid.length){
            System.out.println("Wrong coordinates, Try again");
            return turn(player, name, grid, symbol, sc, count);
        }

        if (grid[x][y] != '\u0000') {
            System.out.println("That cell is already filled, try again.");
            return turn(player, name, grid, symbol, sc, count);
        }

        return Game.playing(grid, symbol, x, y, count);
    }
}