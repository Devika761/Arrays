class Array {
    public static void main(String[] args) {

        int arr[] = {3, 5, 4, 1, 9, 2};

        int min, max;
        int i;

        // Initialize min and max
        if (arr.length % 2 == 0) {
            // Even number of elements
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }

            i = 2;

        } else {
            // Odd number of elements
            min = arr[0];
            max = arr[0];

            i = 1;
        }

        // Process elements in pairs
        while (i < arr.length - 1) {

            int small;
            int large;

            // Compare the pair
            if (arr[i] < arr[i + 1]) {
                small = arr[i];
                large = arr[i + 1];
            } else {
                small = arr[i + 1];
                large = arr[i];
            }

            // Compare small with current minimum
            if (small < min) {
                min = small;
            }

            // Compare large with current maximum
            if (large > max) {
                max = large;
            }

            i += 2;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}