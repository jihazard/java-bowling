package view;

import bowling.BowlingScore;
import bowling.Player;

import java.util.List;

public class PrintView {
    public static BowlingScore printScoreBoard(Player player, BowlingScore score) {
            System.out.println("| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |");
            System.out.println("| "+player+"  |      |      |      |      |      |      |      |      |      |      |");
            System.out.println();

        return score;
    }
}
