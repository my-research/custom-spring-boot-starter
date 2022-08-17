# Custom Spring Boot Starter

Custom starter 를 만들고 사용합니다

# infrastructure

- modules
  - `greeter`
    - target library
  - `greeter-spring-boot-autoconfigure`
    - bean 등록해주는 autoconfigure 
  - `greeter-spring-boot-starter`
    - starter
- private repository : nexus 

### 궁금한 것

- gradle dependencies 에서 api 와 implementation 은 어떻게 다른가
- gradle plugin 은 무엇인가
  - java-library 은 무엇인가
  - lombok 을 plugin 에서 가져오는것과 dependencies 에서 가져오는 것은 어떤 차이가 있는가
- spring-boot-starter 와 spring-boot 는 어떤 차이가 있는가

### References

- [https://www.baeldung.com/spring-boot-custom-starter](https://www.baeldung.com/spring-boot-custom-starter)
- [https://github.com/Tetragramato/gradle-custom-spring-boot-starter](https://github.com/Tetragramato/gradle-custom-spring-boot-starter)