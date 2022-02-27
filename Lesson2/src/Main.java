public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 3, 2, 5, 6};
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        if (arr.length < 2)
            return;

        int mid = arr.length / 2;
        int[] left = new int[mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        int[] right = new int[arr.length - mid];

        for (int i = mid; i < arr.length; i++) {
            right[i-mid] = arr[i];
        }

        sort(left);
        sort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }
}
