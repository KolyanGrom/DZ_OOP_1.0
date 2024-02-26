import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(99);

        int expected = 99;
        int actual = sound.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(120);

        int expected = 0;
        int actual = sound.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(101);

        int expected = 0;
        int actual = sound.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(-50);

        int expected = 0;
        int actual = sound.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(100);
        sound.increaseVolume();

        int expected = 100;
        int actual = sound.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseHigherMaxVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(200);
        sound.increaseVolume();

        int expected = 1;
        int actual = sound.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(55);
        sound.decreaseVolume();

        int expected = 54;
        int actual = sound.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseBelowMinVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(-1);
        sound.decreaseVolume();

        int expected = 0;
        int actual = sound.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio station = new Radio();

        station.setCurrentStation(3);

        int expected = 3;
        int actual = station.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentMaxStation() {
        Radio station = new Radio();

        station.setCurrentStation(66);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentMinStation() {
        Radio station = new Radio();

        station.setCurrentStation(-5);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.increaseStation();

        int expected = 9;
        int actual = station.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseHigherMaxStation() {
        Radio station = new Radio();

        station.setCurrentStation(66);
        station.increaseStation();

        int expected = 1;
        int actual = station.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.decreaseStation();

        int expected = 8;
        int actual = station.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseBelowMinStation() {
        Radio station = new Radio();

        station.setCurrentStation(-5);
        station.decreaseStation();

        int expected = 0;
        int actual = station.currentStation;

        Assertions.assertEquals(expected, actual);
    }
}