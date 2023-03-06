package lab1;

public class Exercise2 {
    public static void Sum(int[][] firstArray,int[][] secondArray){
        int[][] newArray = new int[3][3];

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                newArray[i][j] = firstArray[i][j] + secondArray[i][j];
            }
        }

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.println(newArray[i][j]);

            }
            System.out.println();
        }
    }

    public static void Product(int[][] firstArray,int[][] secondArray){
        int[][] newArray = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    newArray[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.println(newArray[i][j]);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int firstArray[][] = { {2, 3, 1}, {7, 1, 6}, {9, 2, 4} };
        int secondArray[][] = { {8, 5, 3}, {3, 9, 2},{2,7,3}};
        Sum(firstArray,secondArray);
        Product(firstArray,secondArray);
    }
}
