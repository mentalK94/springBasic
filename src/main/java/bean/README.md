# Bean

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

### 빈의 범위(Bean Scope)
- singleone(default값) : 스프링 컨테이너에 의해 한개의 빈 객체만 생성
- prototype : 빈 사용시(getBean 등등)마다 생성
- request : HTTP 요청 마다 빈 객체를 생성(WebAppContext에서만 적용)
- session : HTTP 세션 마다 빈 객체를 생성(WebAppContext에서만 적용)
- global-session : global HTTP 세션에 대해 빈 객체를 생성

### 커스텀 초기화 / 소멸 메소드
- 객체의 생성과 소멸시에 특정 메소드를 실행시키고 싶을 때 사용.
- init-method : 커스텀 초기화 메소드를 지정하는 <bean>태그의 속성
- destroy-method : 커스텀 소멸 메소드를 지정하는 <bean>태그의 속성
- BeanNameAware Interface
>> 빈 객체가 자기자신의 이름을 알아야 할 경우 사용된다.

>> 클래스가 BeanNameAware 인터페이스를 구현한 경우 컨테이너는 setBeanName()메소드를 호출해서 빈 객체의 이름을 전달한다.

>> setBeanName(String arg) : 객체가 생성될 때 해당 객체의 id나 name값을 전달 받는 메소드

### 외부 파일을 이용한 빈 설정
- Environment 인터페이스 활용
>> Context --> getEnvironment() : Environment 객체 얻기
>> Environment --> getPropertySources 객체 얻기
>> PropertySources --> 프로퍼티를 추가하거나(addLast), 추출(getProperty)작업을 한다.
