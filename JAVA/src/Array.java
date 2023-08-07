public class Array {
    public static void main(String[] args) {
        String[] weeks = new String[7]; // 배열 size 할당 , size 할당이 없을 시 컴파일 오류
        int Y = weeks.length; // 배열의 길이 (string length)
        int[] arr = new int[5];
        int length = arr.length; // 배열의 길이가 int도 가능했구나 ..
        System.out.println(length);
    }
}
