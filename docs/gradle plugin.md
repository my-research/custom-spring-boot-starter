### 목차

- gradle plugin 이란
  - plugin 종류 두가지
- spring 의존성들 각각의 의미
  - 'org.springframework.boot' version '2.7.2'
  - 'io.spring.dependency-management' version '1.0.12.RELEASE'
- "io.freefair.lombok" 를 plugin 에서 등록하는 것과 dependencies 에서 추가해주는 것의 차이
   
# gradle plugin 이란

- gradle plugin 은 gradle task 의 집합
- 어떤 task 를 계속해서 실행하는 것이 비효율적이기 때문에 개발사에서 이런 task 를 묶어서 plugin 으로 제공한 것

# plugin 종류 두가지

- 대표적으로 두가지 종류의 플러그인이 존재함
  1. binary plugin
  2. script plugin

### binary plugin

- `Plugin` 인터페이스를 구현한 프로그래밍방식으로 구현했거나 gradle 의 DSL 을 이용해서 구현한 플러그인

### script plugin

- script plugin 은 빌드를 추가로 구성하고 일반적으로 빌드를 조작하기 위한 선언적 접근 방식을 구현하는 추가 빌드 스크립트입니다.
- 두가지 사용법이 있음
  - 로컬 파일을 불러오는 방법
    - 다른 gradle 파일을 `apply from` 으로 불러와서 사용함
  - remote 파일을 불러오는 방법
    - remote script locations are specified with an HTTP URL

# lombok community

- [https://plugins.gradle.org](https://plugins.gradle.org) 에서 플러그인을 검색하고 사용할 수 있음

# Custom Plugin 만들기 docs 

- [https://docs.gradle.org/current/userguide/custom_plugins.html#custom_plugins](https://docs.gradle.org/current/userguide/custom_plugins.html#custom_plugins)

### References

- [https://docs.gradle.org/current/userguide/plugins.html](https://docs.gradle.org/current/userguide/plugins.html)
- [https://kotlinworld.com/323](https://kotlinworld.com/323)
- [https://www.tutorialspoint.com/gradle/gradle_plugins.htm](https://www.tutorialspoint.com/gradle/gradle_plugins.htm)