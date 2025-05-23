package ru.pavlova.stepic.lesson2;

/**
 * Перечисление цветов
 */
public enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");

    /**
     * Код цвета
     */
    private String code;

    Color(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

}
