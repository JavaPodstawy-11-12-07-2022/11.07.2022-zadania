public class Main4 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i*j;
            }
        }

        for(int[] secondDimensionTab : tab) {
            for(int element : secondDimensionTab) {
                System.out.print(element + " ");
            }

            System.out.println();
        }


        double[] avrs = new double[tab.length];
        int indexNo = 0;
        for(int[] row : tab) {
            int sum = 0;
            for(int element : row) {
                sum += element;
            }
            avrs[indexNo++] = ((double) sum)/((double) row.length);
        }

        for(double avr : avrs) {
            System.out.print(avr + " ");
        }
    }
}
