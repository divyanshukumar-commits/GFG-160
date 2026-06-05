package Array;
class MoveZeroesToEnd {
    public void pushZeroesToEnd(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        MoveZeroesToEnd obj = new MoveZeroesToEnd();
        obj.pushZeroesToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}