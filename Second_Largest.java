package Array;

class GetSecondLargest {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            return -1;
        } else {
            return second;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        GetSecondLargest obj = new GetSecondLargest();
        int result = obj.getSecondLargest(arr);

        System.out.println("Second Largest: " + result);
    }
}