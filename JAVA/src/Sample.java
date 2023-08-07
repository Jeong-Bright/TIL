class Calculator {
    static int result = 0;

    static int add(int num){
        result += num;
        return result;
    }

}

class Animal{
    String Name; // 객체 변수 ( 클래스에 선언된 변수 )

    public void setName(String name) { // method, 클래스 내에 구현된 함수
        this.Name = name; // this.name = "puppy" -> dog.name = "puppy" / 객체.객체변수 = 값
    }
}

class Dog extends Animal { // 상속
    Dog(){ // 생성자의 입력 항목이 없고 생성자 내부에 아무 내용이 없는 생성자 => 디폴트 생성자

    }
    void sleep() {
        System.out.println(this.Name+" is sleep"); // sleep method를 추가하여 Animal class보다 더 많은 기능을 가지게 됨
    }

}

class HouseDog extends Dog {
    HouseDog(String Name){ // 메서드명 == 클래스명 , 리턴 자료형을 정의하지 않는 메서드 => 생성자

        this.setName(Name);
    }

    void sleep() {
        System.out.println(this.Name + " is sleep in house "); // 메서드 오버라이딩, 부모클래스의 메서드를 자식 클래스가 동일한 형태로 또 다시 구현하는 행위 (메서드 덮어쓰기)
    }

    void sleep(int hour) {
        System.out.println(this.Name + " is sleep in house " + hour + "hours"); // 메서드 오버로딩, 매개변수가 다를 경우 동일한 이름의 메서드 생성 가능
    }
}
class Update{
    void update(Counter counter){
        counter.cnt++;
    }

    void update(int a){
        a++;
    }


}

class Counter{
    int cnt = 0;
}

public class Sample {
    int a;

    int sum (int a, int b){
        return a+b;
    }

    void Q(int a){
        if(a==9){
            System.out.println("출력 불가");
            return;
        }
        else if (a>5) System.out.println(a);
    }

    void vartest() {
        this.a++;
    }
    public static void main(String[] args) {
        // 5-1 ~ 5-2
        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal horse = new Animal();
        // 객체와 인스턴스의 차이, 클래스에 의해 만들어진 객체를 인스턴스라고 한다. 위처럼 만들어진 cat은 객체이다. 그리고 cat이라는 객체는 Animal의 인스턴스이다.
        // 인스턴스라는 말은 특정 객체가 어떤 클래스의 객체인지를 관계 위주로 설명할 때 사용된다.

        // 클래스는 무언가를 만들어내는 틀, 객체는 그 틀에 의해 만들어진 무언가이다.
        dog.setName("puppy");
        System.out.println(dog.Name); // null, setName method 선언 후 변수 입력, -> puppy

        // 클래스에서 가장 중요한 것은 객체 변수의 값이 독립적으로 유지된다.
        // ex)
        cat.setName("cat");
        System.out.println(cat.Name);

        // 이러한 경우, cat의 문장이 나중에 수행되므로 dog의 값도 변경되지는 않을까. 서로 공유되는 변수라면 그럴 것이다.
        // 허나 출력 후, 결과를 보면 공유되지 않는다는 것을 알 수 있다.
        // 객체지향적이다 라는 말은, 객체변수의 값이 독립적으로 유지되기 때문에 가능하다.
        // static을 이용할 경우 객체변수를 공유할 수 있게 가능.

        //--------------------------------------------------------------------------------------------------
        Sample sample = new Sample();
        int c = sample.sum(5,5);

        System.out.println(c);
        // 매개변수 -> 메서드에 전달된 입력값을 저장하는 변수, 인수 -> 메서드를 호출할 때 전달하는 입력값

        // 메서드는 입력값을 가지고 어떤 처리를 해 적절한 리턴값을 돌려주는 블랙박스와 같다.
        // 입력값 -----> 메서드 -----> 리턴값

        // 메서드의 구조
        // 리턴 자료형 메서드명(매개변수 ... )
        // return 리턴값;
        // 입력값이 없는 메서드, 리턴값이 없는 메서드 모두 존재할 수 있다. 둘 다 없을 수도 있고(void -- , {system out ..})


        // 특별한 경우 메서드를 빠져나가고 싶다면 return을 단독으로 사용하여 메서드를 즉시 빠져나갈 수 있다.

        sample.Q(9);
        sample.Q(2);
        sample.a = 1;
        sample.vartest();
        System.out.println(sample.a); // sample 객체를 이용해 vartest라는 메서드를 호출할 경우
        // sample 객체를 전달할 필요가 없다. 왜냐하면 전달하지 않더라도 vartest 메서드는 this라는 키워드를 이용해 객체에 접근할 수 있기 때문

        //--------------------------------------------------------------------------------------------------

        // 메서드에 값을 전달하는 것과 객체를 전달하는 것에는 큰 차이가 있다. 결론부터 얘깋면, 메서드에 객체를 전달할 경우 메서드에서 객체 변수의 값을 변경할 수 있다.

        Counter cnter = new Counter();
        System.out.println("before update:"+cnter.cnt);
        Update dt = new Update();
        dt.update(cnter.cnt); // 값에 의한 호출
        dt.update(cnter); // 이전에는 int count와 같이 값을 전달받았다면, 지금은 객체를 전달받도록 변경한 것이다.
        System.out.println("after update:"+cnter.cnt);

        //--------------------------------------------------------------------------------------------------
        Dog dog12 = new Dog();
        dog12.setName("Puppy");
        dog12.sleep();
        HouseDog hdg = new HouseDog("Happy");
        hdg.sleep();
        // IS-A
        /// DOg은 Animal의 하위개념, Dog is Animal, 상속관계(IS-A 관계) 에 있을 때 자식 클래스의 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다.

        //--------------------------------------------------------------------------------------------------


    }
}
