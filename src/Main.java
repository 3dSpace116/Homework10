public class Main {
    public static void main(String[] args) {

        //Задача 1

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задача 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //можно завести отдельную переменную, чтобы выполнить сначала преобразование, а потом вывод для наглядности кода
        String capitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + capitalLetters);

        //Задача 3
        fullName = "Иванов Семён Семёнович";
        String fullNameWithout = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameWithout);


    }
}