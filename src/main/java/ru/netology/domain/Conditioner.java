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
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
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

    public void increaseCurrentTemperature() {
        if (currentTemperature + 1 > maxTemperature) {
            return;
        }
        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature - 1 < minTemperature) {
            return;
        }
        currentTemperature--;
    }
}
