# DI(Dependency Injection)

### XML을 이용한 설정방법
- setter를 이용한 방법
- 생성자를 이용한 방법
- ex1~ex6까지 실습

### Java Annotation 이용한 설정방법
- Annotation : 컴파일러에게 정보를 알려주거나 컴파일할 때 deployment시 작업을 지정하거나 실행할 때 별도의 처리가 필요한 경우 사용한다.
 -> 클래스, 메소드, 변수 등 모든요소에 선언 가능.
- @Configuration : 스프링 설정시 사용하는 어노테이션
- @Bean : Bean 생성 및 스프링 컨테이너가 관리, 메소드 앞에 선언
 
### Java와 XML 혼용사용한 설정방법

### Bean의 생명주기(Life Cycle)

- ctx.refresh 과정에서 Bean이 생성
- ctx.close() 컨테이너가 소멸하는 단계에서 Bean도 자동으로 소멸

- InitializingBean Interface
  -> public void afterPropertiesSet() throws Exception
- DisposableBean Interface
  -> public void destroy() throws Exception  
  
- 어노테이션 활용
> @PostConstruct
> public void initMethod() {}  // 초기화시 설정

> @PreDestroy
> public void destroyMethod() {} // 종료시 설정
