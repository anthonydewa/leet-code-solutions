public class Main {
    public static void main(String[] args) {
        // longest substring
        MedianTwoSortedArrays mm = new MedianTwoSortedArrays();

        double res = mm.findMedianSortedArrays(new int[] {0, 0} , new int[] {0, 0});
        System.out.println(res);
    }
}
