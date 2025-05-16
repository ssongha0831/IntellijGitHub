package JavaBasic.Ch07;

import java.io.*;

public class StreamExample {

    public static void main(String[] args) {

        /*
        // 1. FileInputStream으로 byte 읽고, try-with-resource 구문 사용
        try(FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            // 한 바이트씩 읽기
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. FileOutputStream 으로 byte 쓰기
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String text = "Hello, java!";
            byte[] bytes = text.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /

        // 3. FileReader로 한 문자씩 읽기
        try (FileReader fr = new FileReader("test.txt")) {
            int data;
            // 한 문자씩 읽기
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /

        // 4. FileWriter로 문자 쓰기
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("안녕하세요!\n");
            fw.write("자바 스트림 수업시간입니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        // 5. BufferedReader로 한 줄씩 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            // 한 줄씩 읽기
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 6. BufferedWriter로 쓰기
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("첫 번째 줄");
            bw.newLine();
            bw.write("두 번째 줄");
            bw.newLine();
            bw.write("세 번째 줄");;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
