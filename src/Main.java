import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coach nick_saban = new Coach();
        System.out.println(nick_saban);
        System.out.println(nick_saban.getAge());

        Coach kalen_deboer = new Coach("Kalen Deboer", 40, "Alabama Crimson Tide");
        System.out.println(kalen_deboer);

        Player jalen_hurts = new Player("Jalen Hurts", 25, "Alabama Crimson Tide", "QB");
        System.out.println(jalen_hurts);
        System.out.println(jalen_hurts.name());

        LegendaryCoach saban = new LegendaryCoach(7);
        System.out.println(saban);

        int[] player_numbers = { 2, 4, 54 };
        System.out.println(player_numbers[2]);
    }
}
