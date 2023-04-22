import java.util.Arrays;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый
 массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
  Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/
public class Task3 {
    public static void main(String[]args) {
        Task3 t3 = new Task3();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr = t3.sumArrays(arr1,arr2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sumArrays(int[]arr1, int[]arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Arrays need to be of the same length");
        }
        int[] arr = new int[arr1.length];
        try {
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = arr1[i] + arr2[i];
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        return arr;
    }
}
