package exercise.chapter_58;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageIOTest {
    public static void main(String[] args) {

        // 이미지 파일 경로
        String filePath = "src/exercise/chapter_58/Oak.png";

        try {
            File file = new File(filePath);
            BufferedImage image = ImageIO.read(file);
            // 이미지 회전
            BufferedImage rotatedImage = rotateImage(image, 90);

            // 변환된 이미지 저장
            String outputFilePath = "src/exercise/chapter_58/Oak2.png";
            ImageIO.write(rotatedImage, "png", new File(outputFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 변환된 이미지 저장

    // 미리 만들기
    private static BufferedImage rotateImage(BufferedImage image, double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.abs(Math.sin(radians));
        double cos = Math.abs(Math.cos(radians));

        int width = image.getWidth();
        int height = image.getHeight();

        int newWidth = (int) Math.round(width * cos + height * sin);
        int newHeight = (int) Math.round(height * cos + width * sin);

        BufferedImage rotatedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = rotatedImage.createGraphics();

        graphics.translate((newWidth - width) / 2, (newHeight - height) / 2);
        graphics.rotate(radians, width / 2, height / 2);
        graphics.drawRenderedImage(image, null);
        graphics.dispose();

        return rotatedImage;
    }

}
