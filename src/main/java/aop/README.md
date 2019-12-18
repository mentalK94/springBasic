# AOP : (Aspect Oriented Programming) - 관점지향 프로그래밍
- 기존 OOP를 보완한 개념(핵심사항과 공통관심사항을 분리하여 구현)
- AOP는 primary concern과 cross-cutting concern을 별도의 코드로 구현해서 최종적으로 이들을 조합해서 완성하는 것

### 주요용어정리
- core(primary) concern(핵심관심 사항) : 비즈니스 로직(주 업무)
- cross-cutting concern(공통관심 사항) : 부가적인 기능(보조 업무)
--> 비즈니스 로직은 core+cross-cutting도 될 수 있다
- code : primary concern을 구현한 코드
- advice : cross-cutting concern을 구현한 코드
- jointPoint : code와 advice를 연결해 주는 설정정보, advice가 적용 가능한 지점(메소드 호출, 필드값 변경)
- Point-cut : JointPoint의 부분집합으로 실제 advice가 적용되는 지점
- Weaving : Code, Advice, Point-cut등을 조합해서 어플리케이션을 만들어가는 과정
- Target : 핵심사항이 구현된 객체
> AOP의 Aspect는 Advice와 Point-cut을 함께 지칭하는 용어

##### * 스프링은 자체적인 프록시 기반의 AOP를 지원 필드값 변경과 같은 JointPoint는 사용할 수 없다.
##### * 메소드호출 jointPoint만 지원한다.
##### * 스프링 AOP는 완전한 AOP를 지원하는 것이 목적이 아니라 엔터프라이즈 어플리케이션을 구현하는데 필요한 정도의 기능제공을 목적으로 하고있다.
##### * AOP구현 
    - 설정파일을 이용하는 방법
    - 어노테이션을 이용하는 방법