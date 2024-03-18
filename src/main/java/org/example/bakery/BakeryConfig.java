package org.example.bakery;

import org.example.bakery.ingredients.Berry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Класс конфигурации для Spring Framework.
 * В аннотации ComponentScan указан пакет для сканирования компонентов для контекста.
 */
@Configuration
@ComponentScan(basePackages = "org.example")
public class BakeryConfig {

    @Bean
    public Berry cherry() {
        return new Berry("Вишня");
    }

    @Bean
    public Berry blueberry() {
        return new Berry("Черника");
    }
}