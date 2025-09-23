public class Task4Array8 {
    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < newArr.length; i++) {
            newArr[i] = arr2[i-arr1.length];
        }
        return newArr;
    }
}
