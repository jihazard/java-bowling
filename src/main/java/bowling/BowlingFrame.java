package bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingFrame {
    private static final int BOWLING_GAME_TOTAL_FRAME_COUNT = 10;
    private static final int BOWLING_GAME_NORAML_FRAME_SIZE = 2;
    private static final int BOWLING_GAME_LAST_FRAME_SIZE = 3;
    private static  List<BowlingPins> frame = new ArrayList<>();
    private static String frameNumber;

    public BowlingFrame( List<BowlingPins> frame) {
        this.frame = frame;
    }

    public static BowlingFrame normalFrame(BowlingPins bowlingPins){
        for (int frameCount = 1; frameCount <= BOWLING_GAME_NORAML_FRAME_SIZE; frameCount++) {
            frame.add(bowlingPins);

        }

        return new BowlingFrame(frame);
    }

    public static BowlingFrame lastFrame(){
        return null;
    }

    public static List<BowlingPins> getFrame() {
        return frame;
    }
}
