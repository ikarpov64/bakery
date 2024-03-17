package org.example.bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Класс представляет пекарню, которая отвечает за выпечку пирогов.
 * Этот класс является компонентом Spring и может быть автоматически обнаружен и управляем
 * контейнером Spring.
 */
@Component
//@AllArgsConstructor // Тестирование аннотации с аннотацией @Lazy у класса Pie
public class Bakery {
    // Зависимость типа Pie для выпечки пирогов.
    private Pie pie;

    @Autowired
    public Bakery(@Lazy Pie pie) {
        this.pie = pie;
    }

    /**
     * Метод выпекает пирог.
     * Внутри метода выполняется подготовка и выпечка пирога.
     */
    public void bakePie() {
        pie.prepare();
        pie.bake();
        System.out.println("Пирог готов!");
    }
}
