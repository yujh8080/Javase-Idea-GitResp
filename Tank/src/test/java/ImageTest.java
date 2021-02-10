import org.junit.Assert;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @Auther: yujh
 * @Date: 2021/2/5 - 02 - 05 - 8:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class ImageTest {

    @Test
    public void test() throws IOException {
//        BufferedImage image= ImageIO.read(new File("C:\\Users\\admin\\Pictures\\Saved Pictures"));
//        Assert.assertNotNull(image);

        BufferedImage image1=ImageIO.read
                (ImageTest.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));
        System.out.println(image1);
    }
}
