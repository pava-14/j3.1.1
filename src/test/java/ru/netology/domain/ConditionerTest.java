package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    int calculateClickCount(Conditioner conditioner, int overCount) {
        // Количество нажатий кнопки "Увеличить температуру":
        // т.к. каждое нажатие увеличивает температуру на 1 градуc,
        // считаем количество кликов от минимальной температуры до максимальной и
        // увеличиваем его на overCount? для гарантированного выхода за границы
        // допустимых значений
        return conditioner.getMaxTemperature() - conditioner.getMinTemperature() + overCount;
    }

    @Test
    void shouldSetOverloadMaxTemperature() {

        Conditioner conditioner = new Conditioner();

        int overload = 50;

        // Включаем, если выключен
        if (!conditioner.isOn()) {
            conditioner.setOn(true);
        }

        // Устанавливаем текущую температуру
        conditioner.setCurrentTemperature(22);

        // Запоминаем текущую температуру
        int expected = conditioner.getCurrentTemperature();

        // Устанавливаем температуру, выше максимальной
        conditioner.setCurrentTemperature(conditioner.getMaxTemperature() + overload);

        // Проверим, что текущая температура не изменилась
        assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    void shouldSetOverloadMinTemperature() {

        Conditioner conditioner = new Conditioner();

        int overload = 50;

        // Включаем, если выключен
        if (!conditioner.isOn()) {
            conditioner.setOn(true);
        }

        // Устанавливаем текущую температуру
        conditioner.setCurrentTemperature(22);

        // Запоминаем текущую температуру
        int expected = conditioner.getCurrentTemperature();

        // Устанавливаем температуру, ниже минимальной
        conditioner.setCurrentTemperature(conditioner.getMinTemperature() - overload);

        // Проверим, что текущая температура равна минимально возможной
        assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    void shouldIncreaseCurrentTemperature() {

        Conditioner conditioner = new Conditioner();

        // Включаем, если выключен
        if (!conditioner.isOn()) {
            conditioner.setOn(true);
        }

        // Устанавливаем текущую температуру
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

        Conditioner conditioner = new Conditioner();

        // Включаем, если выключен
        if (!conditioner.isOn()) {
            conditioner.setOn(true);
        }

        // Устанавливаем текущую температуру
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