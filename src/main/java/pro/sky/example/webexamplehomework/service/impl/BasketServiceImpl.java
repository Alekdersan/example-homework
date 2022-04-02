package pro.sky.example.webexamplehomework.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.example.webexamplehomework.data.Basket;
import pro.sky.example.webexamplehomework.service.BasketService;

import java.util.List;



@Service
public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addElements(List<Integer> idList) {
        return basket.addElements(idList);
    }

    @Override
    public List<Integer> getElements() {
        return basket.getElements();
    }
}
