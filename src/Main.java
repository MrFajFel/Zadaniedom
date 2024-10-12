//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tablica tab = new Tablica(5);
        tab.wypelnij(1,10);
        System.out.println("-----------------");
        System.out.println(tab.maksimum());
        System.out.println(tab.minimum());
        System.out.println(tab.maksimum2());
        System.out.println(tab.znajdz(2));




    }
}