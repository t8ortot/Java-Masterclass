public class TeenNumberChecker {
    public static boolean hasTeen(int val1, int val2, int val3){

        return isTeen(val1) || isTeen(val2) || isTeen(val3);
    }

    public static boolean isTeen(int val){

        return (val <= 19 && val >= 13);
    }
}
