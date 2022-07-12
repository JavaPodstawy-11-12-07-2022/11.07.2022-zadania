public class Main2 {
    public static void main(String[] args) {
        int[] tab = {3, 34, 23, 44, 25, 15, 45, 22};

        for(int i = 0; i < tab.length; i++) {
            if(tab[i] % 3 == 0 && tab[i] % 5 == 0) {
                System.out.println(tab[i]);
            }
        }
    }
}
