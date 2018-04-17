package bowling;

import org.junit.Before;
import org.junit.Test;
import view.PrintView;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void 플레이어생성() {
        Player player = bowlingGame.createPlayer("yjh");
        Player.printName(player);
        assertThat(player).isEqualTo(new Player("yjh"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 플레이어생성_단어3개이상일경우() {
        Player player = bowlingGame.createPlayer("yjhj");
    }

    @Test
    public void 스코어보드프린트() {
        BowlingScore score = null;
        BowlingScore score1 = PrintView.printScoreBoard(new Player("yjh"),  score);
    }

    @Test
    public void 프레임1투구() {
        List<BowlingFrame> result = new ArrayList<>();
        BowlingScore score = bowlingGame.drowBall(new Player("yjh"), 1);
        assertThat(score).isEqualTo(1);
    }
}
