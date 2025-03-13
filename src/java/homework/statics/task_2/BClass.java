package homework.statics.task_2;

public class BClass {
    static int bCounter;

    static {
        bCounter++;
    }

    {
        bCounter = 0;
    }
}
