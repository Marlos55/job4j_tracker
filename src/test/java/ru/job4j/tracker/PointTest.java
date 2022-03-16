package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Assert;

public class PointTest extends TestCase {

    public void testDistance3d() {
        Point c = new Point(0,4,0);
        Point d = new Point(4,0,5);
        double ex = 7.55;
        double dist = c.distance3d(d);
        Assert.assertEquals(ex, dist, 0.01);

    }
}