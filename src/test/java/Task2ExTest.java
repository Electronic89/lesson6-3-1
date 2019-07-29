import Lesson_6.Task2;
import org.junit.Before;
import org.junit.Test;

public class Task2ExTest {
    private Task2 task2;

    @Before
    public void startTest() {
        task2 = new Task2();
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        Task2.AfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }
}
