class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args){
        Letter x = new Letter();
        x.c = 'a';
        System.out.println(x.c);

        f(x);                   //传递了一个引用
        System.out.println(x.c);

    }
}
