public class ShowProperties {
    public static void main(String[] args){
        /*
        list()方法将结果发送给它的参数System.out
         */
        System.getProperties().list(System.out); // print stream -> System.out

        /*
        查询了用户名和java.library.path
         */
        System.out.println(System.getProperty("user.name")); //string key -> ""

        System.out.println(
                System.getProperty("java.library.path")
        );
    }
}
