```
public class Array {
    public static void main(String[] args) {
        Employee[] tekcom = new Employee[5];
        for (int i = 0 ; i < tekcom.length; i++) {
            if(tekcom[i] != null) {
                System.out.println(tekcom[i]);
            }
    }
    }
}

class Employee{
    private String name;
    private int age;

    public Employee() {}

    public Employee(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

- 객체 배열
	- ex) Employee[] tekcom = new Employee[5] / 원래 new 키워드를 쓸 때에는 생성자를 사용했다.
		출력을 하였을 때 null만 출력이 된다. new 키워드로 실제 생성자가 실행된 것이 아니다.


	- 객체 배열을 생성하고, 따로 인스턴스를 생성하지 않고 주소를 출력을 하였을 때의 값은 null이 나온다.
	그 말인 즉슨 인스턴스의 주소를 담을 공간을 생성을 했다는 것이다. 주소의 공간을 미리 만들어 놓았다는 것
	당연히 실제 값도 없다.


|객체배열|주소값 초기화|인스턴스|
|------|---|---|
|Employee[0]|null|X|
|Employee[1]|null|X|
|Employee[2]|null|X|

- 인스턴스 생성


```public class Array {
    public static void main(String[] args) {
        Employee[] tekcom = new Employee[5];
        tekcom[0] = new Employee("왕실장", 38);
        tekcom[1] = new Employee("김팀장", 35);
        tekcom[2] = new Employee("영훈장", 33);
        for (int i = 0 ; i < tekcom.length; i++) {
            if(tekcom[i] != null) {
                System.out.println(tekcom[i].getName());
                System.out.println(tekcom[i].getAge());
            }
    }
    }
}
```
	- new Employee[5] 하고 new Employee() 는 전혀 다른 기능이다. 객체배열이 5개가 있으니까 5개만큼 객체 배열에
	각각 직원 객체를 생성하고 주소값을 넘겨준다. null이었던 곳에 참조값을 주는 것이다.

|객체배열|주소값 초기화|인스턴스|
|------|---|---|
|Employee[0]|null|주소값|
|Employee[1]|null|주소값|
|Employee[2]|null|주소값|
