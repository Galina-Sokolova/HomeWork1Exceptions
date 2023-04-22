import java.io.*;
import java.util.*;
/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
*/

public class Task1 {
    public static void main(String[]args) throws FileNotFoundException {
        Task1 t1 = new Task1();
        //первый метод
        division();
        //второй метод
        System.out.println(t1.writeOutOfFile(new File("src\\t.txt")));
        //третий метод
        List<Integer> arr = new ArrayList<>();
        System.out.println(arr);
    }
    private static float division(){
        System.out.print("Введите делимое: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.print("Введите делитель: ");
        int number2 = scanner.nextInt();
        if ( number2 == 0){
            throw new RuntimeException("делитель не может быть равен нулю");
        }
        float res = number1/number2;
        return res;
    }
    private static ArrayList<String> writeOutOfFile(File file) throws FileNotFoundException{
        ArrayList<String> arr = new ArrayList<String>();
        FileReader reader = new FileReader(file);
        try(BufferedReader br = new BufferedReader(reader)){
            String c;
            while ((c = br.readLine()) != null) {
                arr.add(c);
            }
        }catch (IOException e){
            e.getMessage();
        }
        return arr;
    }
    public Integer getAverage(List<Integer> list){
        int count = 0;
        int sum = 0;
        if (list == null){
            throw new RuntimeException("Спсок пуст, нельзя найти среднее значение");
        }
        for (Integer item: list){
            sum += item;
            count++;
        }
        int avr = sum/count;
        return avr;
    }
}
