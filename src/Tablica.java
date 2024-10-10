import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Tablica {
    private int n;
    private ArrayList<Integer> tablica = new ArrayList<>(n);

    public Tablica(int n) {
        this.n = n;
    }

    public void wypelnij(int a,int b){
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int losowanie = rand.nextInt(a,(b+1));
            System.out.println(losowanie);
            tablica.add(losowanie);
        }
    }


    public void maksimum(){
        int max = tablica.get(0);
        for (int i = 0; i < n; i++) {
            if (max < tablica.get(i)){
                max = tablica.get(i);
            }
        }
        System.out.println(max);
    }

    public void minimum(){
        int min = tablica.get(0);
        for (int i = 0; i < n; i++) {
            if (min > tablica.get(i)){
                min = tablica.get(i);
            }
        }
        System.out.println(min);
    }


    public void maksimum2(){
        int max = tablica.get(0);
        int max2 = tablica.get(0);
        for (int i = 0; i < n; i++) {
            if (max < tablica.get(i)){
                max = tablica.get(i);
            }
        }
        System.out.println(max);
    }




}
