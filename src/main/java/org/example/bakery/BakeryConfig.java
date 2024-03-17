package org.example.bakery;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Класс конфигурации для Spring Framework.
 * В аннотации ComponentScan указан пакет для сканирования компонентов для контекста.
 */
@Configuration
@ComponentScan(basePackages = "org.example")
public class BakeryConfig {
}