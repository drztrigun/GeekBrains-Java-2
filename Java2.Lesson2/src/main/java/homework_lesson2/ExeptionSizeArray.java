package homework_lesson2;

public class ExeptionSizeArray extends IndexOutOfBoundsException {
    public ExeptionSizeArray(int n){
        super("Массив не форамата NxN N = " + n);
    }
}