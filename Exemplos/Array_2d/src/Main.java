public class Main {
    public static void main(String[] args) {
        //Tambem conhecido como Array multidimensional

        /*String cars[][] = {
                {"RX-7","Skyline","Silvia"},
                {"Daihatsu","Supra","Isuzu"},
                {"Chaser","Soarer","Laurel"}
        };*/

        String[][] cars = new String[3][3];

        cars[0][0] = "RX-7";
        cars[0][1] = "Skyline";
        cars[0][2] = "Silvia";

        cars[1][0] = "Daihatsu";
        cars[1][1] = "Supra";
        cars[1][2] = "Isuzu";

        cars[2][0] = "Chaser";
        cars[2][1] = "Soarer";
        cars[2][2] = "Laurel";

        for(int x=0;x<cars.length; x++){
            System.out.println();
            for (int y=0;y<cars[x].length;y++){ //cars[i].length:Esta instrução contara o numero de colunas que ha em uma linha
                System.out.print(cars[x][y]+"|");
            }
        }



    }
}