public class DecimalComparator {
    public static void main(String [] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {

        return (int)(value1 * 1000) == (int)(value2 * 1000);
    }
}
