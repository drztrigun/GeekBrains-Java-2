package homework_lesson2;

/*    1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
           10 3 1 2
            2 3 2 2
            5 6 7 1
          300 3 1 0
         Написать метод, на вход которого подаётся такая строка, метод должен
         преобразовать строку в двумерный массив типа String[][];
      2. Преобразовать все элементы массива в числа типа int, просуммировать,
         поделить полученную сумму на 2, и вернуть результат;
      3. Ваши методы должны бросить исключения в случаях:
         Если размер матрицы, полученной из строки, не равен 4x4;
         Если в одной из ячеек полученной матрицы не число; (например символ или слово)
      4. В методе main необходимо вызвать полученные методы,
         обработать возможные исключения и вывести результат расчета.
      5. * Написать собственные классы исключений для каждого из случаев*/

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";          //задаем строку
        int n = 4;                                                   //задаем размерность массива
        int del = 2;                                                 //задаем делитель
        String[][] arrayNxN = new String[n][n];
        try {
            conversion(arrayNxN, s, n);
            int res = conversionInt(arrayNxN, n, del);
            System.out.println("Ответ: " + res);
        }catch (MyArithmeticException | NotConvertToIntValue | ExeptionSizeArray e){
            System.out.println(e.getMessage());
        }
    }

    //преобразуем строку в дмереный массив и проверяем на исключения
    public static String[][] conversion(String[][] arrayNxN, String s, int n) {
        String[] arrays = s.split("\n");
        System.out.println(Arrays.toString(arrays));
        try {
            int k = 0;
            for (String array : arrays) {
                arrayNxN[k++] = array.split(" ");
            }
        } catch (RuntimeException e){ throw new ExeptionSizeArray(n);
        }
        return arrayNxN;
    }

    // преобразуем значения в Int, складываем элементы и проверяем на исключения
    public static int conversionInt(String[][] arrayNxN, int n, int del) throws MyArithmeticException , NotConvertToIntValue {
        int sum = 0;
        int [][] conversionInt = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arrayNxN[i].length; j++) {
                try {
                conversionInt[i][j] = Integer.parseInt(arrayNxN[i][j]);
                } catch (NumberFormatException e){ throw new NotConvertToIntValue(arrayNxN[i][j]);
                }
                sum = sum + conversionInt[i][j];
            }
        }
        if (del == 0 || (sum % del) != 0 ) {
            throw new MyArithmeticException(del);
        } else {
            sum = sum / del;
            return sum;
        }
    }
}