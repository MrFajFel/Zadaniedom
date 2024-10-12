import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Tablica {
    private int n;
    private ArrayList<Integer> tablica = new ArrayList<>(n);

    public Tablica(int n) {
        this.n = n;
    }

    public void wypelnij(int a, int b){
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int losowanie = rand.nextInt(a, (b + 1));
            tablica.add(losowanie);
            System.out.println(losowanie);

        }
    }


    public int maksimum(){
        int max = tablica.get(0);
        for (int i = 0; i < n; i++) {
            if (max < tablica.get(i)){
                max = tablica.get(i);
            }
        }
        return max;
    }

    public int minimum(){
        int min = tablica.get(0);
        for (int i = 0; i < n; i++) {
            if (min > tablica.get(i)){
                min = tablica.get(i);
            }
        }
        return min;
    }


    public int maksimum2(){
        int max = tablica.get(0);
        int max2 = tablica.get(0);
        for (int i = 0; i < n; i++) {
            if (max < tablica.get(i)){
                max = tablica.get(i);
            }
            if (max2 >= max && max2 < tablica.get(i)) {
                max2 = tablica.get(i);
            }
        }
        return max2;
    }

    public int znajdz(int a){
        for (int i = 0; i < n; i++) {
            if (tablica.get(i) == a){
                a = tablica.get(i);
                return a;
            }
        }
        return -1;
    }


}
