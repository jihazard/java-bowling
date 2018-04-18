package bowling;

import java.util.Objects;

public class BowlingPins {
    private static final int BOWLING_PIN_MAX = 10;
    private static final int BOWLING_PIN_MIN = 1;
    private final int fallPins;


    public BowlingPins(int fallPins) {
        if(fallPins > BOWLING_PIN_MAX || fallPins < BOWLING_PIN_MIN) {
            throw new IllegalArgumentException("볼링핀은 최고 0~10개 사이만 쓰러질 수 있습니다.");
        }
        this.fallPins = fallPins;
    }

    private static BowlingPins of(int fallPins) {
        return new BowlingPins(fallPins);
    }

    public int getFallPins() {
        return fallPins;
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
