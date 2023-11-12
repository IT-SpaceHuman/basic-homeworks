package oopHW1;

public class Main {
    public static void main(String[] args) {
        User user = new User("Деханов", "Евгений", "Валерьевич", 1990, "happyhamsterchn@gmail.com");
        user.userInfo();
        User[] users = {
                new User("Деханова", "Дина", "Александровна", 1981, "dina@mail.ru"),
                new User("Деханов", "Сергей", "Александрович", 1968, "sergey@mail.ru"),
                new User("Дехановa", "Татьяна", "Владимировна", 1966, "vremyap@mail.ru"),
                new User("Деханов", "Александр", "Сергеевич", 1983, "alex@mail.ru"),
                new User("Деханов", "Дмитрий", "Сергеевич", 1985, "dima@mail.ru"),
                new User("Деханов", "Илья", "Евгеньевич", 2000, "ilya@mail.ru"),
                new User("Деханова", "Юлия", "Евгеньевна", 2015, "littleprincess@mail.ru"),
                new User("Ефремова", "Нина", "Карповна", 1938, "nina@mail.ru"),
                new User("Ефремов", "Андрей", "Владимирович", 1973, "andrey@mail.ru"),
                new User("Марьина", "Татьяна", "Владимировна", 1963, "tanyam@mail.ru"),
        };
        for (int i = 0; i < users.length; i++) {
            if((2023 - users[i].getYearOfBirth())>40) {
                users[i].userInfo();
            }
        }
        Box B = new Box(45,89,32, "Зеленый");
        B.aboutBox();
        B.setColor();
        B.openBox();
        B.closeBox();
        B.put("fe");
        B.takeOut("FE");
    }
}