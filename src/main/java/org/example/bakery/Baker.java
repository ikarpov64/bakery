package org.example.bakery;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Класс представляет Пекаря, который выпекает пироги в Пекарне.
 * Этот класс является компонентом Spring и может быть автоматически обнаружен и управляем
 * контейнером Spring.
 */
@Component
@RequiredArgsConstructor
public class Baker {
    // Зависимость типа Bakery.
    private final Bakery bakery;

    public void bakePie() {
        System.out.println("Пекарь приступил к выпечке пирога.");
        bakery.bakePie();
    }
}
