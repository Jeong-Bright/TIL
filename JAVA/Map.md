- Map
	- 다른 언어의 Map과 동일하다. (Key , Value)
	- Map은 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다. 맵(Map)의 가장 큰 특징이라면 key로 value를 얻어낸다는 점이다. baseball이란 단어의 뜻을 찾기 위해서 사전의 내용을 순차적으로 모두 검색하는 것이 아니라 baseball이라는 단어가 있는 곳만을 펼쳐보는 것이다.

---------

> HashMap
 - Map 역시 List와 마찬가지로 인터페이스이다. Map 인터페이스를 구현한 Map 자료형에는 HashMap, LinkedHashMap, TreeMap 등이 있다.

- put(key, value), get(key), containskey(key) <- boolean, remove(key), size, keyset <- All key return

```
> LinkedHashMap과 TreeMap
Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는데 있다.
하지만 가끔은 Map에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고
때로는 입력된 key에 의해 Sort 되도록 저장하고 싶을 수도 있을 것이다.
이런경우에는 LinkedHashMap과 TreeMap을 사용하는 것이 유리하다.
- LinkedHashMap은 입력된 순서대로 데이터를 저장하는 특징을 가지고 있다.
- TreeMap은 입력된 key의 오름차순 순서로 데이터를 저장하는 특징을 가지고 있다.
```
