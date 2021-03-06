package EulerProject.EulerProject24;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int swap = 7;
        for (int amount = 1; amount < 1000000; amount++) {
            if (amount % 2 != 0) {
                int temp = array[9];
                array[9] = array[8];
                array[8] = temp;
            } else {
            swap = findLargestNum(array) - 1;
            swapNum(array, swap);
            reverseNumber(array, swap);
            }
        }
        for (int pos = 0; pos < array.length; pos++) {
            System.out.print(array[pos]);
        }
    }
    private static int findLargestNum(int[] array) {
        int findlargest = 9;
        while (array[findlargest - 1] > array[findlargest]) {
            findlargest--;
        }
        return findlargest;
    }
    private static void reverseNumber(int[] array, int swap) {
        int numberChangeadd = swap + 1;
        int numberChangesubtract = 9;
        while (numberChangeadd < numberChangesubtract) {
            int temp = array[numberChangeadd];
            array[numberChangeadd] = array[numberChangesubtract];
            array[numberChangesubtract] = temp;

            numberChangeadd++;
            numberChangesubtract--;
        }
    }
    private static void swapNum(int[] array, int swap) {
        int pos = 9;
        while(array[pos]<array[swap])
            pos--;
        int temp = array[swap];
        array[swap] = array[pos];
        array[pos] = temp;
    }
}