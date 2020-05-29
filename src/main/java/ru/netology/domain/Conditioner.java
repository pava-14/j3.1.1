package ru.netology.domain;

public class Conditioner {
    private final String name = "Dyson";
    private final int maxTemperature = 40;
    private final int minTemperature = 5;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature() {

        int changedTemperature = currentTemperature + 1;

        if (changedTemperature > maxTemperature) {
            return;
        }

        currentTemperature = changedTemperature;

    }

    public void decreaseCurrentTemperature() {
        int changedTemperature = currentTemperature - 1;

        if (changedTemperature < minTemperature) {
            return;
        }

        currentTemperature = changedTemperature;
    }
}


