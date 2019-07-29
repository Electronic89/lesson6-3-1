import Lesson_6.Task3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task3Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 3, 3, 4, 1}, true},
                {new int[]{3, 8, 7, 1, 7, 3, 5, 1}, true},
                {new int[]{1, 1, 8, 7}, false},
                {new int[]{1, 4, 3, 1, 3, 5, 1}, true},
                {new int[]{1, 1, 1, 1}, true}

        });
    }
    private int[] in;
    private boolean out;

    public Task3Test(int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }

    private Task3 task3;

    @Before
    public void startTest() {
        task3 = new Task3();
    }

    @Test
    public void test1And4() {
        Assert.assertEquals(Task3.OneAndFour(in), out);
    }
}

