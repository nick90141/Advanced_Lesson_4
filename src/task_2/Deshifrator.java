package task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deshifrator {
    public static void main(String[] args) {
        String relativeFilePath = "src/task_2/text_file.txt";

        try {
            Path filePath = Paths.get(relativeFilePath);
            StringBuilder content = new StringBuilder();

            try (BufferedReader reader = Files.newBufferedReader(filePath)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

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
