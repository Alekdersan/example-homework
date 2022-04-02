package pro.sky.example.webexamplehomework.service;


import java.util.List;

public interface BasketService {

    List<Integer> addElements(List<Integer> idList);

    List<Integer> getElements();
}
