public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    /**
     * УСЛОВИЯ ЗАДАЧ ВНИЗУ ПОД КОДОМ (/ + ** + enter)
     */
    public static void task1() {
        System.out.println("Задание 1 и 2 мой вариант");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String FIO = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + FIO);

        String fullName = FIO.toUpperCase();
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2() {
        System.out.println("");
        System.out.println("Задание 1 и 2 с разбора ДЗ var + string.format");
        var firstName = "Ivan";
        var middleName = "Ivanovich";
        var lastName = "Ivanov";

        var fullName = String.format("%s %s %s", lastName, firstName, middleName);
        //функция, заменяющая %s % %s на строки, идущие после запятой
        System.out.printf("ФИО сотрудника - %s", fullName); //printF
        //ВЫРОВНЯТЬ СТРОКИ - Ctrl + Alt + L
        var result = fullName.toUpperCase();
        System.out.println("");
        System.out.println("Через доп переменную result:");
        System.out.printf("ФИО сотрудника - %s", result); //printF
        System.out.println("");
        System.out.println("Переменную + toUppercase сразу в sout:");
        System.out.printf("ФИО сотрудника - %s", fullName.toUpperCase()); //printF
        System.out.println("");
        System.out.println("Через %S - верхний регистр:");
        System.out.printf("ФИО сотрудника - %S %S %S", lastName, firstName, middleName);
    }
    public static void task3() {
        System.out.println("\n");
        System.out.println("Задание 3 БЕЗ split и contains");
        var fullName = "Иванов Семён Семёнович";

        var result = fullName.replace("ё", "е");
        System.out.printf("Данные ФИО сотрудника - %s", result);
    }
    public static void task4() {
        System.out.println("\n");
        System.out.println("Задание 3 с разбора ДЗ + split + contains");

        var fullName = "Иванов Семён Семёнович";
        var split = fullName.split (""); // разделяем строку (массив) на отдельные подстроки "Имя" + "Отчество" + "Фамилия"
        String result = "";

        for (String current: split){ // каждое значение из массива проверить на
            if (current.contains("ё")) { //содержание символа 'ё'
                var replacement  = current.replace("ё", "е"); //то заменить 'ё' на 'е'
                result += replacement; // результат равен замененный текст (добавить в строку замен-й текст / +- конкатенация)
            }else {
                result += current; // иначе результат это текст без изменений (добавить в строку текущий текст без изменений / +- конкатенация)
            }
            //result +=" "; // Не понятно(!!!), работает и без него. А это добавляет промежутки между буквами (в разборе - не добавляет)
        }
        System.out.printf("Данные ФИО сотрудника - %s", result);
    }
    public static void task5 (){
        System.out.println("\n");
        System.out.println("Задание 5 с разбора ДЗ");

        var fullName = "ivanov ivan ivanovich";
        var builder  = new StringBuilder(fullName.length());
        var strings = fullName.split (" ");

        for (var current: strings) {
            var firstLetter = current.substring(0, 1).toUpperCase();
            var restName = current.substring(1);
            var resultName = firstLetter + restName;
            builder.append(resultName);
            builder.append(" ");
        }
        System.out.printf("Верное написание ФИО сотрудника c заглавных букв  - %s", builder);
    }

}
/**
 * ### **Задание 1**
 * Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате, и бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
 * * Напишите четыре строки:
 * * первая с именем firstName — для хранения имени;
 * * вторая с именем middleName — для хранения отчества;
 * * третья с именем lastName — для хранения фамилии;
 * * четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
 * * Выведите в консоль фразу: “ФИО сотрудника — ….”
 * * В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
 *
 * * * ### **Задание 2**
 *
 * Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны    Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
 * * Напишите программу, которая изменит написание Ф. И. О. сотрудника с  “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
 * * В качестве строки с исходными данными используйте строку fullName.
 * * Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
 *  *
 * ### **Задание 3**
 * * Система, в которой мы работаем, не принимает символ “ё”.
 * * Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
 * * В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
 * * Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
 *
 * ### **Задание 5**
 * Периодически данные в наших регистрах заполняются неверно и ФИО сотрудников записываются строчных букв.
 * Такую оплошность нужно исправить написав программу, которая преобразует написанное со строчных букв ФИО
 * в правильный формат. В качестве исходных данных используйте строку fullName с данными "ivanov ivan ivanovich",
 * которую нужно преобразовать в "Ivanov Ivan Ivanovich". Выведите результат программы в консоль в формате:
 * "Верное написание ФИО сотрудника заглавных букв  - ..."
 * Подсказка: toCharArray()
 * Characer.to UpperCase(c) (c - символ) - преобразование символа в верхний регистр
 */