import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Final {
    public static void main(String[] args) {
        // String to Int
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);
        // Int to String
        int m = 123;
        String M = "" + m; // 빈 문자열 더해주기
        System.out.println(M);

        String X = String.valueOf(m);
        String P = Integer.toString(m);
        System.out.println(X);
        System.out.println(P);

        // String to Double, float

        String Q = "123.456";
        double q = Double.parseDouble(Q);
        System.out.println(q);

        // Int <-> Double

        // int to double
        int w = 456;
        double z = w;
        System.out.println(z);

        // double to int
        double a = 123.456;
        int v = (int) a;
        System.out.println(v);

        // final

        final int o = 123;
        // int o = 5999; // variable o is already defined in method main <- int o는 이미 상수화 되었기 때문에 값을 수정할 수 없음


        // List의 경우도 같음
        final ArrayList<Integer> dd = new ArrayList<>(Arrays.asList(1,2,3));
        // dd = new ArrayList<>(Arrays.asList(4,5,6)); // cannot assign a value to final variable dd

        // 리스트의 경우 final로 선언할 때 리스트에 값을 더하거나(add) 뺄(remove) 수 있다. 다만 재할당만 불가능할 뿐이다.
        // 만약 값을 더하거나 빼는 것도 할 수 없게 하고 싶다면 List.of를 작성하여 수정할 수 없는 리스트(unmodifiable list)로 만들면 된다.
        // JAVA 9 부터 사용가능하단다
    }
}
