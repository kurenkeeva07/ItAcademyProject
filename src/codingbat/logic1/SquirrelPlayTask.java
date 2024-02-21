package codingbat.logic1;

public class SquirrelPlayTask {
    public static void main(String[] args) {
        boolean isSquirrelsPlay = squirrelPlay(60, true);

    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) return (temp >= 60 && temp <= 100);
        return (temp >= 60 && temp <= 90);
    }
    public boolean squirrelPlay2(int temp, boolean isSummer) {
        if (isSummer) {
            return (temp >= 60 && temp <= 100);
        } else {
            return (temp >= 60 && temp <= 90);
        }
    }

}

