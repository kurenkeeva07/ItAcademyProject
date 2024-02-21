package practice;

public class NestedLoopTask2 {
    public static void main(String[] args) {
        int boxKgCount1 = 15, boxKgCount2 = 17, boxKgCount3 = 21;
        int sum;
        int count = 0;
        int appleAmount = 185;
        for (int boxCount1 = 0;boxKgCount1 * boxCount1 <= appleAmount; boxCount1++){
            for (int boxCount2 = 0; boxKgCount2 * boxCount2 <= appleAmount;  boxCount2++) {
                for (int boxCount3 = 0; boxKgCount3 * boxCount3 <= appleAmount; boxCount3++) {
                    sum = boxKgCount1 * boxCount1 + boxKgCount2 * boxCount2 + boxKgCount3 * boxCount3;
                    if (sum == appleAmount) {
                        count++;
                        System.out.println(count + " way: " +
                                " amount of " + boxKgCount1 + " kg: " + boxCount1 +
                                " amount of " + boxKgCount2 + " kg: " + boxCount2 +
                                " amount of " + boxKgCount3 + " kg: " + boxCount3 );
                    }
                }
            }
        }
    }
}
