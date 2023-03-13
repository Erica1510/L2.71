// импортируем необходимые классы
// без них компилятор выдаст ошибку
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

// Класс содержит статические методы для чтения файла и сериализации объектов.
class ReadFile
{
    // статический метод для чтения файла
    // Метод читает текстовый файл и выводит его содержимое в консоль. В качестве параметра принимается имя файла.
    public static void  readTxtFile(String fileName) {

        // блок try/catch необходим, так как в результате
        // чтения файла могут возникнуть ошибки
        try (FileReader tfr = new FileReader(fileName);) {

            // создаем экземпляр класса FileReader

            // создаем в памяти буфер для чтения 8Кб символов за раз
            char[] buffer = new char[8096];

            int chars = tfr.read(buffer);

            // до тех пор пока есть символы в файле, читаем данные
            // и выводим в консоль
            while (chars != -1) {
                System.out.println(String.valueOf(buffer, 0, chars));
                chars = tfr.read(buffer);
            }

            // отлавливаем исключение
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //Метод сериализует коллекцию объектов Video_Cards и сохраняет ее в файл.
    // В качестве параметров принимается коллекция объектов и путь к файлу.
    // Если возникает ошибка во время сериализации, метод выводит сообщение об ошибке в консоль.
    public static void serialize(Collection<Video_Cards> videoCards, Path filePath) {
        try {
            Collection<? extends CharSequence> transactionsToSerialize = videoCards
                    .stream()
                    .map(Video_Cards::toString)
                    .collect(Collectors.toCollection(ArrayList::new));
            Files.write(filePath, transactionsToSerialize, Charset.defaultCharset());
        }
        catch (IOException e) {
            System.err.println("Something went wrong when serializing videocards");
        }
    }
}