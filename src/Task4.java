import java.util.Arrays;

/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше. */
public class Task4 {
    public static void main(String[]args) {
        Task4 t4 = new Task4();
        int[] array1 = new int[] {5, 4, 3};
        int[] array2 = new int[] {1, 1, 3};
        int[] array3 = t4.getDivArray(array1, array2);
        System.out.println(Arrays.toString(array3));
    }
    public int[] getDivArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length){
            throw new RuntimeException("Arrays need to be of the same length");
        }
        int[] divArr = new int[arr1.length];
        int i, j, k;
        i = j = k = 0;
        try {
            while (i < arr1.length) {
                divArr[k] = arr1[i] / arr2[j];
                i++;
                j++;
                k++;
            }
        } catch (RuntimeException e) {
            System.out.println("Different arrays' size or division by zero observed!");
            System.exit(0);
        }
        return divArr;
    }
}