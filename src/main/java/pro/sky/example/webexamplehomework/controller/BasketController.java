package pro.sky.example.webexamplehomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.example.webexamplehomework.service.BasketService;
import java.util.List;


@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;


    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> addElements(@RequestParam List<Integer> id) {
        return basketService.addElements(id);
    }

    @GetMapping("/get")
    public List<Integer> getElements() {
        return basketService.getElements();
    }
}
