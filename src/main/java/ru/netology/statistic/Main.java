package ru.netology.statistic;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 26;
        post.birthday.month = 11;
        post.birthday.year = 1929;
    }
}