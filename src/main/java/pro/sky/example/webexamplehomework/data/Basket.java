package pro.sky.example.webexamplehomework.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



@Component
@SessionScope
public class Basket {

    private final List<Integer> elements;

    public Basket() {
        this.elements = new ArrayList<>();
    }

    public List<Integer> addElements(List<Integer> idList) {
        elements.addAll(idList);
        return idList;
    }

    public List<Integer> getElements() {
        return Collections.unmodifiableList(elements);
    }
}
