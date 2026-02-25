public class Book {

    // Поля являются приватными
    private final String title;
    private final String author;
    private boolean isRented;

    //Конструктор для класса книги
    public Book(String title, String author) { // Параметры для создания книги
        this.title = title;
        this.author = author; // Взять переменную author которая конкретно принадлежит этому объекту (книги), и кладем в него значение которое получили из конструктора
        this.isRented = false; // Задаем жесткое правило, при создании книги она по умолчанию не арендована
    }

    public String getTitle() { // Позволяет узнать название книги
        return title;
    }

    public String getAuthor() { // Позволяет узнать автора книги
        return author;
    }

    public boolean isRented() { // Позволяет проверить, арендована ли сейчас книга
        return isRented;
    }

    public void rentBook() { // Переводим книгу в состояние арендована
        isRented = true;
    }

    @Override // Переопределение метода
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', isRented=" + isRented + "}";
    }
}
