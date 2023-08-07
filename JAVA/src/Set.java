import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String > set = new HashSet<>(); // 집합과 관련된 것을 쉽게 처리하게 위해 만든 것
        // 중복 허용 X , 순서 X
        // List , Array -> ordered , HashSet -> unordered

        // 교집합 구하기
        Integer arr[] = {1,2,3,4,5};
        Integer arr2[] = {2,3,4,5,6};
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(arr));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(arr2));

        HashSet<Integer> s3 = new HashSet<>(s1);
        s3.retainAll(s2); // 교집합
        System.out.println(s3);

        // 합집합 구하기
        s3.addAll(s2);
        System.out.println(s3);

        // 차집합 구하기
        s3.removeAll(s2);
        System.out.println(s3);

        // add
        s3.add(10);

        // add all

        s2.addAll(Arrays.asList(10, 20, 30, 40)); // 전부 추가
        System.out.println(s2);

        // remove
        s2.remove(10);
        System.out.println(s2);

        // remove all

        s2.removeAll(Arrays.asList(20, 30)); // asList 안에 지정된 변수들 전부 삭제
        System.out.println(s2);

        // Map 과 동일하게 정렬된 데이터를 가지고 오고 싶다면 LinkedHashset이나 TreeSet을 사용하면 된다.

        TreeSet<Integer> ts = new TreeSet<>();
        LinkedHashSet<Integer> ls  = new LinkedHashSet<>();

    }
}
