package JavaPart1.Quiz;
/*
    문제 3.
    자바의 String 자료형에는 많은 연산자 기능들이 있다.
    프로그래밍의 기본기를 익히기 위해 일부 연산자들을 제한하고 다음의 기능을 구현하려 한다.
    - String의 replace 기능 구현 ( replace는 문자열의 다른값으로 변경 )
    - String의 replace, indexOf, contains를 사용하지 않고 구현한다.
 */

public class Quiz03 {
    public static String solution(char[] str, char[] find, char[] to) {
        int idx = 0;

        String replaceStr = ""; // 최종 변경된 데이터 담을 변수
        char[] replaceBucket = str.clone(); // 중간 중간 업데이트에 사용할 변수

        // 문자열 내의 모든 find 에 해당하는 부분을 찾아서 to로 변경할 것
        // do while 로 우선 한 번 찾아보고 반복하여 진행
        do {
            // find 부분의 index 찾을 함수 별도로 작성
            idx = findIndex(replaceBucket, find);


            if (idx != -1) {
                // 우선 find 에 해당하는 idx 전까지는 기존 데이터로 업데이트
                for (int i = 0; i < idx; i++) {
                    replaceStr += replaceBucket[i];
                }

                // 그 다음 변경할 to로 업데이트
                for (int i = 0; i < to.length; i++) {
                    replaceStr += to[i];
                }

                // 그리고 find 이 후의 잔여 데이터 업데이트
                for (int i = idx + find.length; i < replaceBucket.length; i++) {
                    replaceStr += replaceBucket[i];
                }

                // replaceBucket 을 방금 변경된 replacStr 로 업데이트
                replaceBucket = replaceStr.toCharArray();
                // 그 다음 변경을 위해 다시 ""로 초기화
                replaceStr = "";
            }
        } while(idx != -1);

        replaceStr = new String(replaceBucket);
        return replaceStr;
    }

    public static int findIndex(char[] str, char[] find) { // 찾을 인덱스
        int idx = -1;
        boolean isMatch = false;

        for (int i = 0; i < str.length; i++) {
            // find 의 첫 글자와 같은지 확인 + 그 때의 str 에 남은 길이가 find 보다 크거나 같은지 확인 후 각 자리 비교
            if (str[i] == find[0] && str.length - i >= find.length) {
                isMatch = true;
                for (int j = 1; j < find.length; j++) {
                    // 하나라도 같지 않은 경우 false 로 변경 후 break
                    if (str[i + j] != find[j]) {
                        isMatch = false;
                        break;
                    }
                }
            }
            if (isMatch) { // find 부분 찾았으면 idx 업데이트 후 break
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
