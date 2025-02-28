/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test.java.bitmap.transformer;

import org.junit.Test;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import static junit.framework.TestCase.assertEquals;


class AppTest {
    String testpath = "C:\\Users\\User\\IdeaProjects\\bitmap-transformer\\bitmap-transformer\\app\\src\\main\\java\\bitmap\\transformer\\image.bmp"

    bitmap test = new bitmap(testpath);

    @Test
    public void testGettingCrazy() {
        test.read(testpath);
        int rgb = 442;
        assertEquals("Error","Done transforming!", test.gettingCrazy());
    }

    @Test
    public void testInvert() {
        test.read(testpath);
        int rgb = 442;
        assertEquals( "Error" ,"Done transforming!", test.invert());
    }

    @Test
    public void testLightenImage() {
        test.read(testpath);
        int rgb = 442;
        assertEquals("Error","Done transforming!", test.lightenImage());
    }
    @Test
    public void testRead() {
        assertEquals("Can not read the file", true, test.read(testpath));
    }

    @Test
    public void testSave() {
        test.read(testpath);
        assertEquals("Error while saving!", true, test.save(testpath));
    }

}
