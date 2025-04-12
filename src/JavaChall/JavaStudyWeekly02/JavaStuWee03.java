package JavaChall.JavaStudyWeekly02;

import JavaBasic.Ch07.BufferedFileCopy;

import java.io.*;

public class JavaStuWee03 {
    private static final int BUFFER_SIZE = 8192;

    public static void main(String[] args) {

        File source = new File("test.txt");
        File target = new File("test_copy.txt");

        try {
            copyFile(source, target);
            System.out.println("파일 복사가 완료되었습니다.");
        } catch (BufferedFileCopy.InvalidPathException e) {
            System.err.println("잘못된 파일 경로입니다: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("파일 복사 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
    private static void copyFile(File source, File target) throws IOException {

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(target))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.flush();
        }
    }
}

