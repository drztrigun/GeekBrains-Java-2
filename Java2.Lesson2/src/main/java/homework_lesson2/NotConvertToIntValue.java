package homework_lesson2;

public class NotConvertToIntValue extends NumberFormatException {
    public NotConvertToIntValue(String arrayNxN) {
        super("Не перевелся в значение Int ");
    }
}