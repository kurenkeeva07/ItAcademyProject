package codingbat.logic1;

public class CaughtSpeeding {
    public static void main(String[] args) {

    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
            if (speed <= 60)
                return 0;
            else if (speed >= 61 && speed <= 80)
                return 1;
            else
                return 2;
    }
}
