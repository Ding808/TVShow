package sheridan.yueyang.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import sheridan.yueyang.assignment1.model.Box;
import sheridan.yueyang.assignment1.GameService.GameService;

public class TvShowApplicationTests {

    private GameService gameService = new GameService();

    @Test
    public void testInitializeGameCreatesCorrectNumberOfBoxes() {
        List<Box> boxes = gameService.initializeGame();
        // PRIZES 数组的长度为 6
        assertEquals(6, boxes.size(), "盒子数量应与奖品数组长度一致");
    }

    @Test
    public void testGetPrizeForBox() {
        List<Box> boxes = gameService.initializeGame();
        int selectedBoxId = boxes.get(0).getId();
        String prize = gameService.getPrizeForBox(boxes, selectedBoxId);
        // 验证返回的奖品与该盒子中的奖品一致
        assertEquals(boxes.get(0).getPrize(), prize, "所选盒子的奖品应正确返回");
    }
}
