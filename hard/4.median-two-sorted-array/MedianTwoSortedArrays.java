class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int nums1_max_index = nums1.length - 1;
        int nums2_max_index = nums2.length - 1;
        int nums1_index = 0;
        int nums2_index = 0;
        boolean duo_numbers = ((size % 2) == 0);
        int median_index = size / 2;

        double res = 0;
        Integer previous_index_combined_value = 0;

        for (int i = 0; i < size; i++) {
            int current_valid_number = -1;
            
            Integer val1 = null;
            if (nums1_index <= nums1_max_index) {
                val1 = nums1[nums1_index];
            }
            Integer val2 = null;
            if (nums2_index <= nums2_max_index) {
                val2 = nums2[nums2_index];
            }

            if (val1 != null && ((val1 != null && val2 == null) || val1.compareTo(val2) <= 0)) {
                current_valid_number = val1;
                nums1_index += 1;
            } else if (val2 != null && ((val1 == null && val2 != null) || val2.compareTo(val1) < 0)) {
                current_valid_number = val2;
                nums2_index += 1;
            }

            if (i == median_index) {
                res = current_valid_number;
                if (duo_numbers) {
                    res += previous_index_combined_value;
                    res = res / 2.0;
                }
                break;
            }

            previous_index_combined_value = current_valid_number;
        }

        return res;
    }
}