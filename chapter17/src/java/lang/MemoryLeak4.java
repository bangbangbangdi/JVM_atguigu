package java.lang;

public class MemoryLeak4 {
    private String msg;
    public void receiveMsg(){
        //readfromnet(); // 从网络中接受数据保存到msg中
        //saveDB(); // 把msg保存到数据库中
        //msg = null;
    }
}
