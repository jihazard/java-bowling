package bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingScore {
    private static final int BOWLING_GAME_TOTAL_FRAME = 10;
    private static List<BowlingFrame> score = new ArrayList<>();
    public BowlingScore(){
    }
    public BowlingScore(List<BowlingFrame> score) {
        this.score= score;
    }

    public static List<BowlingFrame> getScore() {
        return score;
    }
}
