package homework.statics.task_2;

public class BClass {
    static int bCounter;

    public BClass() {
        System.out.println("В конструкторе В класса bCounter = " + bCounter);
    }

    static {
        //bCounter++;
    }

    {
        bCounter++;
        System.out.println("В статическом блоке bCounter = " + bCounter);
    }
}
