package homework_lesson2;

public class MyArithmeticException extends ArithmeticException {
    public MyArithmeticException(int del){
        super("Делитель: " + del + " равен 0 или же деление будет с остатком");
    }
}