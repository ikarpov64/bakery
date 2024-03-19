package org.example.bakery;

import lombok.RequiredArgsConstructor;
import org.example.bakery.ingredients.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Класс представляет пирог, который может быть приготовлен из различных ингредиентов.
 * Этот класс является компонентом Spring и может быть автоматически обнаружен и управляем
 * контейнером Spring.
 */
@Component
//@RequiredArgsConstructor
@Lazy
public class Pie {
    // Зависимости типов Flour, Egg, Butter, Sugar, Berry, используемые для выпечки пирога.
    private final Flour flour;
    private final Egg egg;
    private final Butter butter;
    private final Sugar sugar;
    private Berry cherry;
    private Berry blueberry;

    @Autowired
    public Pie(Flour flour, Egg egg, Butter butter, Sugar sugar,
               Berry cherry, @Qualifier("blueberry") Berry blueberry) {
        this.flour = flour;
        this.egg = egg;
        this.butter = butter;
        this.sugar = sugar;
        this.cherry = cherry;
        this.blueberry = blueberry;
    }

    public void prepare() {
        System.out.printf("Подготовка к выпечке из ингредиентов: %s, %s, %s, %s, %s, %s.\n",
                flour.getName(),
                egg.getName(),
                butter.getName(),
                sugar.getName(),
                cherry.getName(),
                blueberry.getName());
    }

    /**
     * Сеттер перебивает конструктор при создании Бина.
     *
     * @param cherry Объект вишня.
     */
    @Autowired
    @Qualifier("blueberry")
    public void setCherry(Berry cherry) {
        this.cherry = cherry;
    }

    @Autowired
    @Qualifier("cherry")
    public void setBlueberry(Berry blueberry) {
        this.blueberry = blueberry;
    }

    public void bake() {
        System.out.println("Пирог выпекается...");
    }
}
