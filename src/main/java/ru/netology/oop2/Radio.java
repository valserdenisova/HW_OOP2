package ru.netology.oop2;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            newCurrentStation = 0;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        }
        else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        else {
            currentStation = currentStation - 1;
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
            return;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            currentVolume = 100;
        }
        else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        else {
            currentVolume = currentVolume - 1;
        }
    }

}