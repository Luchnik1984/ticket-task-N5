import java.io.FileNotFoundException;

public class exampleHandlingExceptions {
    public static void main(String[] args) {

        try {
            processUnchecked();

            processChecked();

        } catch (FileNotFoundException e) {
            System.out.println("Поймали в main (checked): " + e.getMessage());

        } finally {
            System.out.println("Блок finally в main выполнен");
        }

        System.out.println("Программа завершена корректно");
    }

    static void processChecked() throws FileNotFoundException {
        throw new FileNotFoundException("файл не найден");
    }

    static void processUnchecked() {
        try {
            int x = 10 / 0;
            System.out.println("Результат: " + x);

        } catch (ArithmeticException e) {

            System.out.println("Обработали unchecked: " + e.getMessage());
        }


    }
}
