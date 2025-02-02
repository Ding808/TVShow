package sheridan.yueyang.assignment1.GameService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import sheridan.yueyang.assignment1.model.Box;

public class GameService {

    private static final String[] PRIZES = {"Empty", "Candy", "iPhone", "$100", "Empty", "Empty"};
    private Random random = new Random();

    public List<Box> initializeGame() {
        List<String> prizesList = new ArrayList<>();
        for (String prize : PRIZES) {
            prizesList.add(prize);
        }
        Collections.shuffle(prizesList, random);

        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < prizesList.size(); i++) {
            boxes.add(new Box(i + 1, prizesList.get(i)));
        }
        return boxes;
    }

    public String getPrizeForBox(List<Box> boxes, int selectedBoxId) {
        for (Box box : boxes) {
            if (box.getId() == selectedBoxId) {
                return box.getPrize();
            }
        }
        return "Unknown";
    }
}
