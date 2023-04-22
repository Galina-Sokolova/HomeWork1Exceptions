/*Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?*/
public class Task2 {
    public static void main(String[]args) {
        Task2 t2 = new Task2();
        String [][] arr = new String[][] {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                } finally {
                    sum += 0;
                }
            }
        }
        return sum;
    }
}
