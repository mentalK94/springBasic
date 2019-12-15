package di.ex1;

public class GetSum {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void sum(int a, int b) {
        System.out.println("더하기");
        int result = a+b;
        System.out.println("더하기 결과 : " + result);
    }
}
