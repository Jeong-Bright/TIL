// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String result = sb.toString();
        System.out.println(result);
    // StringBuilder == StringBuffer , stringbuffer의 경우 string보다 무겁다.  / 문자열을 추가 , 변경 -> stringbuffer / 적으면 -> string /
        sb.insert(0, " New");
        result = sb.toString();
        System.out.println(result);
        // 특정 위치 삽입 함수
        System.out.println(sb.substring(0, 5));
        // string의 substring /  파이썬의 slicing과 같은 개념
    }
}