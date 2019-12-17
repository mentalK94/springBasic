package bean.ex2;

import org.springframework.beans.factory.BeanNameAware;

public class LifeBeanImpl implements LifeBean, BeanNameAware {

    private String beanName;

    @Override
    public void lifeMethod() {
        System.out.println("비스니스 로직을 수행합니다.");
        System.out.println("beanName : " + beanName);
    }

    public void init() {
        System.out.println("커스텀 초기화 메소드");
    }

    public void destroy() {
        System.out.println("커스텀 소멸 메소드");
    }

    // 빈 객체가 자신의 이름을 알아야 하는 경우 사용하는 메소드(객체가 생성될때 해당 객체의 id값을 전달받는 메소드) : 언제 알아야하는지 감이 안온다...
    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
