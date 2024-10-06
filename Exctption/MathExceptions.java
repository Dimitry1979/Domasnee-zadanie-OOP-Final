package Exctption;

public class MathExceptions extends Exception{
    /**
     * Исключение
     * @param msg - текстовое сообщение для пользователя
     */
    public MathExceptions(String msg) {
        super(msg);
    }
}