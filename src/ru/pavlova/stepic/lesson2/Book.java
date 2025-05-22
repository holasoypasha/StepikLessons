package ru.pavlova.stepic.lesson2;

public class Book {
    /**
     * Жанр книги
     */
    private Type bookType;
    /**
     * Название книги
     */
    String name;
    /**
     * Автор книги
     */
    String author;

    Book(String name, String author, Type type){
        this.bookType = type;
        this.name = name;
        this.author = author;
    }

    String getType(){
        //С помощью конструкции switch..case можно проверить принадлежность значения bookType определенной константе перечисления.
        switch (bookType) {
            case HORROR: return "Ужастик";
            case SCIENCE: return "Научный";
            case SCIENCE_FICTION: return "Научная фантакстика";
            case FANTASY: return "Фэнтези";
            default: return "Undefined";
        }
    }
}
