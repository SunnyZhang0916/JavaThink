public class ShowProperties {
    public static void main(String[] args){
        System.getProperties().list(System.out); // print stream -> System.out

        System.out.println(System.getProperty("user.name")); //string key -> ""

        System.out.println(
                System.getProperty("java.library.path")
        );
    }
}
