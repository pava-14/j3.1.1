package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void shouldSetOverloadMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        // Устанавливаем текущую температуру
        conditioner.setCurrentTemperature(22);
        // Запоминаем текущую температуру
        int expected = conditioner.getCurrentTemperature();
        // Устанавливаем температуру, выше максимальной
        conditioner.setCurrentTemperature(conditioner.getMaxTemperature() + 1);
        // Проверим, что текущая температура не изменилась
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldSetOverloadMinTemperature() {
        Conditioner conditioner = new Conditioner();
        // Устанавливаем текущую температуру
        conditioner.setCurrentTemperature(22);
        // Запоминаем текущую температуру
        int expected = conditioner.getCurrentTemperature();
        // Устанавливаем температуру, ниже минимальной
        conditioner.setCurrentTemperature(conditioner.getMinTemperature() - 1);
        // Проверим, что текущая температура не изменилась
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        // Устанавливаем текущую температуру
        conditioner.setCurrentTemperature(conditioner.getMaxTemperature() - 1);
        // Увеличиваем температуру два раза для полного покрытия метода
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        // Проверим, что текущая температура равна максимально возможной
        assertEquals(conditioner.getCurrentTemperature(), conditioner.getMaxTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        // Устанавливаем текущую температуру
        conditioner.setCurrentTemperature(conditioner.getMinTemperature() + 1);
        // Уменьшаем температуру два раза для полного покрытия метода
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        // Проверим, что текущая температура равна минимально возможной
        assertEquals(conditioner.getCurrentTemperature(), conditioner.getMinTemperature());
    }
}