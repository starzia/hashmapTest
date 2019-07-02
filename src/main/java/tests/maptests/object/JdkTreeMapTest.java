package tests.maptests.object;

import java.util.TreeMap;
import java.util.Map;

public class JdkTreeMapTest extends JdkMapTest {
    protected <T, V> Map<T, V> makeMap(final int size, final float fillFactor )
    {
        return new TreeMap<>();
    }
}
