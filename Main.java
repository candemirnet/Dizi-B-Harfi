public class Main {
    public static void main(String[] args) {
        String[][] bHarf = new String[7][4];
        for (int i = 0 ; i < bHarf.length ; i++){
            for (int j = 0 ; j < bHarf[i].length ; j++){
                if (i == 3 && j == 3){
                    bHarf[i][j] = " ";
                }
                else if (i == 0 || i == 6 || i == 3){
                    bHarf[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    bHarf[i][j] = " * ";
                }
                else {
                    bHarf[i][j] = "   ";
                }
            }
        }
        for(String[] row: bHarf){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

}