public class LegendaryCoach extends Coach {
    private int championships_won;

    public LegendaryCoach(int championships_won) {
        super();
        this.championships_won = championships_won;
    }

    public String toString() {
        return super.toString() + ". He has also won " + championships_won + " national championships!";
    }
}
