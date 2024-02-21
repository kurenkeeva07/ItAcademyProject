package codingbat.logic1;

public class DateFashionTask {
    public static void main(String[] args) {
        int range = dateFashion(8, 5);
    }
    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2)
            return 0;
        else if (you >= 8 || date >= 8)
            return 2;
        else
            return 1;

    }
}
