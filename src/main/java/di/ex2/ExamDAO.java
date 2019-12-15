package di.ex2;

public class ExamDAO {

    private String msg;

    public ExamDAO() {};

    public ExamDAO(String msg) {
        this.msg = msg;
    }

    public void outputMsg() {
        System.out.println("msg : " + msg);
    }
}
