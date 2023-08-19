package task_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deshifrator {
    public static void main(String[] args) {

        File file = new File("D:\\КУРС ПО JAVA\\Java Advanced\\№4. Regular expressions and Date API\\Homework_4\\src\\task_2\\text_file.txt");

        try {
            StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            String wordToReplace = "вокруг|под|ласково|среди|на|за|с|в";
            String replacementWord = "Java";

            Pattern pattern = Pattern.compile("\\b(" + wordToReplace + ")\\b");

            Matcher matcher = pattern.matcher(content.toString());

            String result = matcher.replaceAll(replacementWord);

            System.out.println("Исходный текст: \n" + content);
            System.out.println("Измененный текст: \n" + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}