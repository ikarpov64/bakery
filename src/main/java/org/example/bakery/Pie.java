package org.example.bakery;

import lombok.RequiredArgsConstructor;
import org.example.bakery.ingredients.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Класс представляет пирог, который может быть приготовлен из различных ингредиентов.
 * Этот класс является компонентом Spring и может быть автоматически обнаружен и управляем
 * контейнером Spring.
 */
@Component
@RequiredArgsConstructor
@Lazy
public class Pie {
    // Зависимости типов Flour, Egg, Butter, Sugar, Berry, используемые для выпечки пирога.
    private final Flour flour;
    private final Egg egg;
    private final Butter butter;
    private final Sugar sugar;
    private final Berry berry;

    public void prepare() {
        System.out.printf("Подготовка к выпечке из ингредиентов: %s, %s, %s, %s, %s.\n",
                flour.getName(),
                egg.getName(),
                butter.getName(),
                sugar.getName(),
                berry.getName());
    }

    public void bake() {
        System.out.println("Пирог выпекается...");
    }
}
