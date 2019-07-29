import Lesson_6.Task2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task2Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 6, 5, 4, 2, 3, 3}, new int[]{2, 3, 3}},
                {new int[]{4, 3, 7, 5, 4, 4, 3, 2}, new int[]{3, 2}},
                {new int[]{ 2}, new int[]{3, 2}}
        });
    }

    private int[] in;
    private int[] out;

    public Task2Test(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    private Task2 task2;

    @Before
    public void startTest() {
        task2 = new Task2();
    }

    @Test
    public void testAfterLast4() {
        Assert.assertArrayEquals(out, Task2.AfterLast4(in));
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        Task2.AfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }
}
