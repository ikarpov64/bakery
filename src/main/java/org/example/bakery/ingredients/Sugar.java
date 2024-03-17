package org.example.bakery.ingredients;

import org.springframework.stereotype.Component;

/**
 * Класс представляет сахар, который используется в приготовлении пирога.
 * Этот класс является зависимостью для класса Pie.
 */
@Component
public class Sugar {
    public String getName() {
        return "Сахар";
    }
}
