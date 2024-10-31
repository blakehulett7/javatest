public class Coach {
    private String name = "Nick Saban";
    private int age = 70;
    private String team = "Alabama Crimson Tide";

    public Coach() {

    }

    public Coach(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String toString() {
        return String.format("%s is %d years old and coaches the %s", name, age, team);
    }

    public int getAge() {
        return age;
    }
}
