package com.playtika.courses.homework2;

//Задача 3.*
//        Сначала единственным программистом в компании был ее основатель,
//        а каждый следующий программист, которого нанимали на работу,
//        проходил по одному собеседованию с каждым из программистов,
//        которые уже работали в компании на тот момент.
//        Зная текущее количество программистов (вводится пользователем), определите,
//        сколько всего собеседований было проведено в стенах компании.
//        Задачу решить с помощью рекурсии.

public class Task3 {
    public static void main(String[] args) {
        int totalInterviews = countInterviews(8);
        System.out.println(totalInterviews);
    }

    private static int countInterviews(int personIndex) {
        int interviews = personIndex - 1;

        int previousPersonIndex = personIndex - 1;
        if (previousPersonIndex > 0) {
            int previousPersonInterviews = countInterviews(previousPersonIndex);
            interviews += previousPersonInterviews;
        }
        return interviews;
    }
}
