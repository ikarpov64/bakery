package org.example.bakery.ingredients;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Объект типа Berry.
 */
@Getter
//@Component // Выключена для конфигурирования бинов через класс конфигуратор.
@RequiredArgsConstructor
public class Berry {
    private final String name;
}
