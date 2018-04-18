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
    public void 볼링핀테스트_1to10() {
        assertThat( new BowlingPins(1).getFallPins()).isEqualTo(1);
        assertThat( new BowlingPins(2).getFallPins()).isEqualTo(2);
        assertThat( new BowlingPins(3).getFallPins()).isEqualTo(3);
        assertThat( new BowlingPins(4).getFallPins()).isEqualTo(4);
        assertThat( new BowlingPins(5).getFallPins()).isEqualTo(5);
        assertThat( new BowlingPins(6).getFallPins()).isEqualTo(6);
        assertThat( new BowlingPins(7).getFallPins()).isEqualTo(7);
        assertThat( new BowlingPins(8).getFallPins()).isEqualTo(8);
        assertThat( new BowlingPins(9).getFallPins()).isEqualTo(9);
        assertThat( new BowlingPins(10).getFallPins()).isEqualTo(10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 볼링핀_범위테스트_0이하() {
        new BowlingPins(-1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void 볼링핀_범위테스트_10이상() {
        new BowlingPins(11);
    }

    @Test
    public void 볼링프레임테스트_1프레임() {
        BowlingFrame aa = BowlingFrame.normalFrame(new BowlingPins(4));
        System.out.println(aa.getFrame());
    }
    @Test
    public void 볼링프레임테스트_1프레임_스트라이크() {
        BowlingFrame aa = BowlingFrame.normalFrame(new BowlingPins(10));
        System.out.println(aa.getFrame());
    }
}
