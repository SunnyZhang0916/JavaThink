/*
 operator 操作符 and assignment 赋值
 */

class Tank{
    int level;
}

public class Assignment {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;

        System.out.println("1. t1 level:" + t1.level + " , t2 level:" + t2.level);

        t1 = t2;            //t2 赋值 给t1。由于赋值操作的是一个对象的引用，所以修改t1的同时也修改了t2

        System.out.println("1. t1 level:" + t1.level + " , t2 level:" + t2.level);

        t1.level = 27;      //这是由于t1和t2包含的是相同的引用，它们指向相同的对象

        System.out.println("1. t1 level:" + t1.level + " , t2 level:" + t2.level);

        /*
        如果想避免这个问题，t1.level = t2.level 这样就可以保持两个对象彼此独立，而不是捆绑在一起。
        */

    }


}
