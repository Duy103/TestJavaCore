package cau6;

import java.io.*;

public class ReadAndWrite {
    public static String readFile(String file1) {
        StringBuilder bd = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String line;
            while ((line = reader.readLine()) != null) {
                bd.append(line);
                bd.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println();
        }

        return bd.toString();
    }

    public static void writeFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào tệp: " + e.getMessage());
        }
    }

    /*public static boolean searchChar(String file1, String character) {

    }*/
}
