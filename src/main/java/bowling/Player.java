package bowling;

import java.util.Objects;

public class Player {
    private BowlingScore score;
    private String name;

    public Player(String name) {
        if(name == null || name.isEmpty()) {
            throw  new NullPointerException();
        }
        if(name.length() > 3){
            throw new IllegalArgumentException();
        }
        this.name= name;
    }

    public static void printName(Player player) {
        System.out.println(player);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name ;
    }
}
