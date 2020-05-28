package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    int calculateClickCount(Conditioner conditioner, int overCount) {
        // Количество нажатий кнопки "Увеличить температуру":
        // т.к. каждое нажатие увеличивает температуру на 1 градуc,
        // считаем количество кликов от минимальной температуры до максимальной и
        // уыеличиваем его на overCount? для гарантированного выхода за границы
        // допустимых значений
        return conditioner.getMaxTemperature() - conditioner.getMinTemperature() + overCount;
    }

    @Test
    void shouldIncreaseCurrentTemperature() {

        // Начальные параметры
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(22);

        // Количество нажатий кнопки "Увеличить температуру"
        int countButtonClick = calculateClickCount(conditioner, 10);

        for (int i = 0; i < countButtonClick; i++) {

            conditioner.increaseCurrentTemperature();

        }

        // Проверим, что текущая температура равна максимально возможной
        assertEquals(conditioner.getCurrentTemperature(), conditioner.getMaxTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        // Начальные параметры
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(22);

        // Количество нажатий кнопки "Уменьшить температуру
        int countButtonClick = calculateClickCount(conditioner, 10);

        for (int i = 0; i < countButtonClick; i++) {

            conditioner.decreaseCurrentTemperature();

        }

        // Проверим, что текущая температура равна минимально возможной
        assertEquals(conditioner.getCurrentTemperature(), conditioner.getMinTemperature());

    }
}