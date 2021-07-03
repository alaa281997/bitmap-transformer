package main.java.bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;


public class Bitmap {

    // initializing our fields
    private double imgHeight;
    private double imgWidth;
    private BufferedImage imgData;

    // overloading default constructor
    public Bitmap(String readPath) {
        this.imgData = read(readPath);
        this.imgHeight = imgData.getHeight();
        this.imgWidth = imgData.getWidth();
    }

    // first transform
    public void gettingCrazy(){
        int rgb;
        for (int i=0; i<this.imgHeight;i++){
            for (int j=0; j<this.imgWidth;j++){
                rgb = (this.imgData.getRGB(j,i))/4;
                this.imgData.setRGB(j,i, rgb);
            }
        }
        System.out.println("Done transforming!");
    }

    // Second transform
    public void invert() {
        int rgb;

        for (int i = 1; i < this.imgHeight; i++) {
            for (int j = 1; j < this.imgWidth; j++) {
                rgb = 255 - this.imgData.getRGB(j, i);
                this.imgData.setRGB(j, i, rgb);
            }
        }
        System.out.println("Done transforming!");
    }

    // Third Transform
    public void lightenImage(){
        int rgb;

        for (int i = 1; i < this.imgHeight; i++) {
            for (int j = 1; j < this.imgWidth; j++) {
                rgb = (this.imgData.getRGB(j, i) * 2) % 256;
                this.imgData.setRGB(j, i, rgb);
            }
        }
        System.out.println("Done transforming!");
    }

    // method for reading input image
    public BufferedImage read(String filePath){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    // method for saving new transformed image
    public void save(String filePath){
        try {
            ImageIO.write(this.imgData, "bmp", new File(filePath));
        }catch (IOException e){
            System.out.println("Error while saving!");
        }
    }

}
