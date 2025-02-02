package sheridan.yueyang.assignment1.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sheridan.yueyang.assignment1.model.Box;
import sheridan.yueyang.assignment1.GameService.GameService;

@Controller
public class GameController {

    private GameService gameService = new GameService();

    @GetMapping("/")
    public String showPlayPage(Model model) {
        List<Box> boxes = gameService.initializeGame();
        model.addAttribute("boxes", boxes);
        return "play";
    }

    @PostMapping("/play")
    public String processPlay(@RequestParam("selectedBox") int selectedBoxId, Model model) {
        List<Box> boxes = gameService.initializeGame();
        String selectedPrize = gameService.getPrizeForBox(boxes, selectedBoxId);

        model.addAttribute("selectedBoxId", selectedBoxId);
        model.addAttribute("selectedPrize", selectedPrize);
        model.addAttribute("boxes", boxes);
        return "result";
    }
}
