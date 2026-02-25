public class User {
    //Поля видны только внутри класса User
    private final String userName;
    private final int userId;

    // Конструктор
    public User(String userName, int userId) { // Он вызывается когда мы пишем new User(), и параметры чтобы создать пользователя и его ид
        this.userName = userName;
        this.userId = userId;
    }

    // Получение данных
    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }


    //Переопределение метода
    @Override
    public String toString() {
        return "User{" + "userName='" + userName + '\'' + ", userId=" + userId + '}';
    }
}
