package di.ex4;

public class MyBatisService {
    private MyBatisDao myBatisDao;

    public void setMyBatisDao(MyBatisDao myBatisDao) {
        this.myBatisDao = myBatisDao;
    }

    public void myBatisTest() {
        System.out.println("=================");
        myBatisDao.insertDB();
        myBatisDao.updateDB();
        System.out.println("=================");
    }
}
