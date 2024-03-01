public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int minStation = 0;
    private int maxStstion = 9;
    private int quantityStation = 10;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }


    public Radio() {

    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        int target = currentVolume + 1;
        currentVolume = target;
    }

    public void increaseStation() {
        if (currentStation >= maxStstion) {
            currentStation = minStation;
            return;
        }
        int target = currentStation + 1;
        currentStation = target;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        int target = currentVolume - 1;
        currentVolume = target;
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            currentStation = maxStstion;
            return;
        }
        int target = currentStation - 1;
        currentStation = target;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStstion) {
            return;
        }
        currentStation = newCurrentStation;
    }
}