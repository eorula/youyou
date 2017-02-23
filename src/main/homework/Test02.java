/**
 * Created by Administrator on 2017/2/23.
 */
public class Test02 {
    public static void main(String[] args){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
