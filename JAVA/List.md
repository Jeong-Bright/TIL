- List
	- 리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.
	- 리스트와 배열의 가장 큰 차이는 배열은 크키가 정해져 있지만 리스트는 크기가 정해져 있지 않고 동적으로 변한다.
		- ex) 배열의 크기를 10개로 정했다면 10개이상 X 리스트는 크기가 정해져 있지 않아 원하는 만큼의 값 담기 O

    - List 자료형
    List 자료형에는 ArrayList, Vector, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다. 여기서 말하는 List 자료형은      인터페이스인데 인터페이스에 대해서는 뒤에서 자세히 다루도록 한다.

-----------------
    - 제네릭스
	- 자바는 J2SE 5.0 버전 이후부터 ArrayList<String> pitches = new ArrayList<>(); 처럼 객체를 포함하는 자료형도 어떤 객체를 포함하는지에 대해서 명확하게 표현할 것을 권고하고 있다. 인텔리제이에서 위의 예제와 같이 제네릭스 없이 코딩하면 명확한 타입을 명시하라는 warning이 표시될 것이다.
	- ArrayList<String> pitches = new ArrayList<String>(); 이와같은게 제네릭스
	- ArrayList<String> pitches = new ArrayList<>(); 선호되는 방식은 이것


> 제네릭스를 사용하지 않은 경우

```java
ArrayList pitches = new ArrayList();
pitches.add("138");
pitches.add("129");

String one = (String) pitches.get(0);
String two = (String) pitches.get(1);
```

- 위처럼 제네릭스를 사용하지 않을 경우에는 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식된다. Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형이다. 따라서 ArrayList 객체인 pitches에 값을 넣을 때는 문제가 안되지만 값을 가져올 경우에는 항상 Object 자료형에서 String 자료형으로 다음과 같이 형변환(casting)을 해야 한다.
```java
String one = (String) pitches.get(0); // Object 자료형을 String 자료형으로 캐스팅한다.
```
- 그런데 여기서 주의할 점은 pitches 안에는 String 객체 이외의 객체도 넣을 수 있기 때문에 형 변환 과정에서 잘못된 형변환으로 인한 오류가 발생할 가능성이 있다는 점이다. 바로 이러한 점이 제네릭스의 탄생 이유이기도 하다.

> 제네릭스를 사용한 경우

```java
ArrayList<String> pitches = new ArrayList<>();
pitches.add("138");
pitches.add("129");

String one = pitches.get(0);  // 형 변환이 필요없다.
String two = pitches.get(1);  // 형 변환이 필요없다.
```

> 다양한 방법의 ArrayList

- 문자열 배열이 존재하는 경우
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);  // [138, 129, 142] 출력
    }
}
- 배열의 데이터를 ArrayList에 삽입한다.
```

> String.join

- ArrayList의 각 요소를 콤마(",")로 구분하여 다음과 같은 하나의 문자열로 만들 수 있는 방법이 있을까?
	- String.join("구분자", 리스트객체)와 같이 사용하여 리스트의 각 요소에 "구분자"를 삽입하여 하나의 문자열로 만들 수 있다.

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
```
- 문자열 배열에도 사용 가능하다.

> Sort
- sort 메서드에는 정렬기준을 파라미터로 전달해야 한다. 정렬기준에는 다음처럼 오름차순, 내림차순이 있다.
	- 오름차순(순방향) 정렬 - Comparator.naturalOrder()
	- 내림차순(역방향) 정렬 - Comparator.reverseOrder()
