package bowling;

import java.util.Objects;

public class BowlingPins {
    private static final int BOWLING_PIN = 10;
    private final int fallPins;


    public BowlingPins(int fallPins) {
        this.fallPins = fallPins;
    }

    private static BowlingPins of(int fallPins) {
        return new BowlingPins(fallPins);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BowlingPins that = (BowlingPins) o;
        return fallPins == that.fallPins;
    }

    @Override
    public int hashCode() {

        return Objects.hash(fallPins);
    }

    @Override
    public String toString() {
        return fallPins + "";
    }
}
