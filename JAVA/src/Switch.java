import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String N = "";
        switch (n){
            case 1 : N = "Monday";
            break;
            case 2 : N = "Tuesday";
            break;
            default: N = "SEVEN";
            break;
        }
        System.out.println(N);

        // for each -> C++ 에서의 범위기반 for문과 동일 (range based for)
    }
}
