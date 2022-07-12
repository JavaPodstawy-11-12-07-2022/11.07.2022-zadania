public class Main3 {
    public static void main(String[] args) {
        int[] tab = {3, 34, 23, 44, 25, 2, 15, 45, 1, 22};

        int min = tab[0];
        int index = 0;
        for(int i = 1; i < tab.length; i++) {
            if(min > tab[i]) {
                min = tab[i];
                index = i;
            }
        }

        System.out.println(min);
        System.out.println(index);
    }
}
