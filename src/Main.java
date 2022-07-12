public class Main {
    public static void main(String[] args) {

        int[] tab = new int[10];
        for(int i = 0; i < 10; i++) {
            tab[i] = i+1;
        }
        /*
        foreach nie działa przy uzupełnianiu tablicy
        int value = 1;
        for(int element : tab) {
            element = value++;
        }*/

        for(int element : tab) {
            System.out.print(element + " ");
        }
    }
}
