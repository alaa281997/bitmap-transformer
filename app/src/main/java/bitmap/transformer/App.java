/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main.java.bitmap.transformer;

public class App {

    public static void main(String[] args) {

        Bitmap imgTest = new Bitmap("C:\\Users\\yousef\\Desktop\\software development\\401 Java\\bitmap-transformer\\app\\src\\main\\java\\bitmap\\transformer\\Image.bmp");
//        imgTest.gettingCrazy();
//        imgTest.lightenImage();
        imgTest.invert();
        imgTest.save("C:\\Users\\yousef\\Desktop\\software development\\401 Java\\bitmap-transformer\\app\\src\\main\\java\\bitmap\\transformer\\transformedImage.bmp");
    }
}
