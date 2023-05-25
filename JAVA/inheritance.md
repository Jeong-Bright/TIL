- 상속
	- 상속을 위해서는 extends 라는 키워드를 사용한다.
	- 부모 클래스에 선언된 객체와 메서드는, 자식 클래스에 선언되지 않았지만 상속되었기 때문에 사용이 가능하다.
	- 부모 클래스를 상속받은 자식 클래스는 부모 클래스 기능에 더하여 좀 더 많은 기능을 갖도록 작성한다.


- Is-A
	- 자식 클래스는 부모 클래스를 상속했다. 즉 하위 개념이다. A라는 클래스는 B클래스에 포함되기 때문에 A는 B다. 라고 표현할 수 있다. 자바는 이러한 관계를 IS-A 관계라고 표현한다. A is a B와 같이 말할 수 있는 관계
	- 이렇게 IS-A 관계에 있을 때 자식 클래스의 객체는 부모 클래스의 자료형인 것 처럼 사용 할 수 있다.

	  ex):
		- B a = new A(); // A is a B (O)
		- A a = new B(); // B is a A (X)

- 메서드 오버라이딩
	- 부모 클래스의 메서들르 자식 클래스가 동일한 형태로 또 다시 구현하려는 행위를 메서드 오버라이딩이라고 한다.
	

	  ex):
		- class B extends A { void temp() { system. ...} }
		- class C extends B { void temp() { system. ...} }


- 메서드 오버로딩
	- 입력항목이 다른 경우 동일한 이름의 메서드를 만들 수 있는데 이를 메서드 오버로딩(method overloading)이라고 부른다.

	  ex):
		- class C extends B { void temp() {} 
		- void temp(int K) {} }