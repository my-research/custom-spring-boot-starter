# java vs java-library in gradle plugin

# java

- test 및 compile 및 bundling 기능을 해당 프로젝트에 추가할 수 있게 함
- The Java plugin adds Java compilation along with testing and bundling capabilities to a project. It serves as the basis for many of the other JVM language Gradle plugins. You can find a comprehensive introduction and overview to the Java Plugin in the Building Java Projects chapter.
- 다음과 같은 기능 제공
  - `compileJava`
  - `jar`
  - `test`
  - `clean`
- 기본 값으로 project source layout 이 정해져 있다
  - `src/main/java`
  - `src/main/resources`
  - `src/test/java`
  - `src/test/resources`
  - 변경 가능

# java-library

- java 플러그인의 기능 확장 버전
- 표준 자바 플러그인과 자바 라이브러리 플러그인의 주요 차이점은 후자가 소비자에게 노출된 API의 개념을 도입한다는 것이다. 라이브러리는 다른 구성 요소가 소비하기 위한 자바 구성 요소이다. 다중 프로젝트 빌드에서 매우 일반적인 사용 사례이지만, 외부 종속성이 있는 즉시도 마찬가지입니다.
- 2 가지 설정을 제공
  1. `api`
  2. `implementation`

### References 

- [https://docs.gradle.org/current/userguide/java_plugin.html](https://docs.gradle.org/current/userguide/java_plugin.html)
- [https://docs.gradle.org/current/userguide/java_library_plugin.html](https://docs.gradle.org/current/userguide/java_library_plugin.html)