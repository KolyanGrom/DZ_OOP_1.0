public class Radio {

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            return;
        }
        int target = currentVolume + 1;
        currentVolume = target;
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            return;
        }
        int target = currentVolume - 1;
        currentVolume = target;
    }

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseStation() {
        if (currentStation >= 9) {
            return;
        }
        int target = currentStation + 1;
        currentStation = target;
    }

    public void decreaseStation() {
        if (currentStation <= 0) {
            return;
        }
        int target = currentStation - 1;
        currentStation = target;
    }
}