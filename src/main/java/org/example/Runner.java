package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Runner {
    public static void main(String[] args) {
        // Создаем объект контекст типа AnnotationConfigApplicationContext
        // Параметром выступает класс конфиг. (Можно использовать String с именем пакета для сканирования)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BakeryConfig.class);
        // Получаем Бин типа Пекарь
        Baker baker = context.getBean(Baker.class);
//        Pie pie = context.getBean(Pie.class);
//        System.out.println(pie);
        // Вызываем у Пекарни метод выпекания пирога.
        baker.bakePie();
        // Закрываем контекст. (Очищаем ресурсы, завершаем жизненный цикл бинов)
        context.close();
    }
}
