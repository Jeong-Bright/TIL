public class Enum {
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE;
    }
    public static void main(String[] args) {
        // 서로 연관 있는 여러개의 상수 집합을 정의할 때 사용한다.
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);

        // 반복문 사용
        for(CoffeeType type : CoffeeType.values()){
            System.out.println(type);
        }
        // 매직넘버를 사용할 때 보다 코드가 명확하다.
        // 잘못된 값을 사용해 생길 수 있는 오류를 막을 수 있다.
    }
}
