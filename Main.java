public class Main {
    public static void main(String[] args) {
        // longest substring
        MedianTwoSortedArrays mm = new MedianTwoSortedArrays();

        double res = mm.findMedianSortedArrays(new int[] {1, 2} , new int[] {3, 4});
        System.out.println(res);
    }
}
