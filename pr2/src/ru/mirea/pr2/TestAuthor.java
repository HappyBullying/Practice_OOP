package ru.mirea.pr2;

public class TestAuthor {
    public static void main(String[] args){

        Author once = new Author("Peter", "aventhor2319@gmail.com", 'm');
        once.setEmail("aventhor@yandex.ru");
        System.out.println(once.getName());
        System.out.println(once.getEmail());
        System.out.println(once.getGender());
        System.out.println(once.toString());

    }
}
