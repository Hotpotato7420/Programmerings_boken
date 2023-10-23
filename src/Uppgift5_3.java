public class Uppgift5_3 {
    public static void main(String[] args) {
        int dagar = 0;
        for (double salary=0.01; salary<=10000000;salary *=2){
            dagar++;
        }
        System.out.println(dagar);
    }
}
