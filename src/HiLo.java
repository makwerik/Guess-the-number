// Для обработки данных с клавиатуры
import java.util.Scanner;

public class HiLo {
    public static void main (String[] args){
        //Генерируем случайное число, которое должен угадать пользователь

        //Создаем экземпляр класса Skanner для того,чтобы система понимала, что клавиатура являяется источником ввода
        Scanner scan = new Scanner(System.in);

        String playAgain = "";

        do{
            //Создаем переменную, в которую помещаем данное число
            int theNumber = (int) (Math.random() * 100 + 1);

            System.out.println(theNumber);

            //Переменная в которой мы храним наши ответы
            int result = 0;
            int attempt = 0;
            while (result != theNumber) {
                System.out.println("Введите число от 1 до 100: ");
                attempt++;
                //Теперь помещаем наш ответ  в нашу переменную
                result = scan.nextInt();

                if (result < theNumber)
                    System.out.println("Число меньше загаданного");

                else if (result > theNumber)
                    System.out.println("Число больше загаданного");

                else

                    System.out.println("Вы отгадали число! За "+ attempt +" попыт(ок/ки/ку)");

            }
            System.out.println("Хотите сыграть еще? (y/n)");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        scan.close();
    }
}
