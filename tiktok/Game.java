class Game{
    public static boolean playing(char grid[][], char c, int x, int y, int count){
        grid[x][y] = c;

        if (count < (2 * grid.length - 2)) return false;

        return checkWin(grid, c);
    }

    public static boolean checkWin(char grid[][], char c){
        System.out.println("Checking who is winning");

        boolean found = true;
        
        for(int i=0; i<grid.length; i++){
            if(grid[i][i] != c){
                found = false;
                break;
            } 
        }   

        if(found) return true;

        found = true;
        int j = grid.length-1;
        for (char[] grid1 : grid) {
            if (grid1[j--] != c) {
                found = false;
                break;
            }
        }

        if(found) return true;
    
        for(char g[] : grid){
            found = true;
            for(int i=0; i<g.length; i++){
                if(g[i] != c){
                    found = false;
                    break;
                } 
            }
            if(found) return true;
        }

        for(int i=0; i<grid.length; i++){
            found = true;
            for(j=0; j<grid.length; j++){
                if(grid[j][i] != c){
                    found = false;
                    break;
                }
            }
            if(found) return true;
        }

        return false;
    }
}