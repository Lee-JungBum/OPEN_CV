//package com.OPEN_CV.characterface.service;
//
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.awt.image.DataBufferByte;
//import java.io.ByteArrayInputStream;
//import java.io.File;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//import lombok.extern.slf4j.Slf4j;
//import org.opencv.core.*;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.imgproc.Imgproc;
//import org.opencv.objdetect.CascadeClassifier;
//import org.opencv.videoio.VideoCapture;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//import org.opencv.core.Point;
//@Slf4j
//@Service
//public class FaceToCharService {
//    private static BufferedImage Mat2BufferedImage(Mat matrix) throws Exception {
//        MatOfByte matOfByte = new MatOfByte();
//        Imgcodecs.imencode(".jpg", matrix, matOfByte);
//        byte ba[] = matOfByte.toArray();
//        BufferedImage bi = ImageIO.read(new ByteArrayInputStream(ba));
//        return bi;
//    }
//
////    public void facetoCharacter(){
////        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
////        JFrame jFrame = new JFrame();
////        JLabel jLabel = new JLabel();
////
////
////        VideoCapture videoCapture = new VideoCapture();
////
////
////        String xmlFile = FaceToCharService.class.getResource("**/resources/lbpcascade_frontalface.xml").getPath().replaceFirst("/", ""); // window에서 path가 /로 시작해서 에러남
////        CascadeClassifier classifier = new CascadeClassifier(xmlFile);
////
////        Mat frame = new Mat();
////
////        try {
////
////            while (videoCapture.read(frame)) {
////
////                MatOfRect faceDetections = new MatOfRect();
////                classifier.detectMultiScale(frame, faceDetections);
////                System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));
////
////                // 얼굴에 사각형 박스 표시 처리
////                for (Rect rect : faceDetections.toArray()) {
////                    Imgproc.rectangle(frame, // where to draw the box
////                            new Point(rect.x, rect.y), // bottom left
////                            new Point(rect.x + rect.width, rect.y + rect.height), // top right
////                            new Scalar(0, 0, 255), 3 // RGB colour
////                    );
////                }
////
////                ImageIcon image = new ImageIcon(Mat2BufferedImage(frame));
////                jLabel.setIcon(image);
////                jLabel.repaint();
////            }
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
//public static Mat convertMat(BufferedImage im) {
//    // Convert INT to BYTE
//    im = toBufferedImageOfType(im, BufferedImage.TYPE_3BYTE_BGR);
//    // Convert bufferedimage to byte array
//    byte[] pixels = ((DataBufferByte) im.getRaster().getDataBuffer())
//            .getData();
//    // Create a Matrix the same size of image
//    Mat image = new Mat(im.getHeight(), im.getWidth(), 16);
//    // Fill Matrix with image values
//    image.put(0, 0, pixels);
//    return image;
//}
//    private static BufferedImage toBufferedImageOfType(BufferedImage original, int type) {
//        if (original == null) {
//            throw new IllegalArgumentException("original == null");
//        }
//
//        // Don't convert if it already has correct type
//        if (original.getType() == type) {
//            return original;
//        }
//        // Create a buffered image
//        BufferedImage image = new BufferedImage(original.getWidth(), original.getHeight(), type);
//        // Draw the image onto the new buffer
//        Graphics2D g = image.createGraphics();
//        try {
//            g.setComposite(AlphaComposite.Src);
//            g.drawImage(original, 0, 0, null);
//        } finally {
//            g.dispose();
//        }
//
//        return image;
//    }
//
//
//
//public BufferedImage facetoCharacter(MultipartFile image1, MultipartFile image2){
//        BufferedImage bufferedImage = null;
//        try {
//            BufferedImage bufferedImage1 = ImageIO.read(image1.getInputStream());
//            BufferedImage bufferedImage2 = ImageIO.read(image2.getInputStream());
//            Mat src1 = convertMat(bufferedImage1);
//            Mat src2 = convertMat(bufferedImage2);
//            String xmlFile = FaceToCharService.class.getResource("**/resources/lbpcascade_frontalface.xml").getPath().replaceFirst("/", ""); // window에서 path가 /로 시작해서 에러남
//            CascadeClassifier classifier = new CascadeClassifier(xmlFile);
//
//                MatOfRect faceDetections = new MatOfRect();
//                classifier.detectMultiScale(src1, faceDetections);
//                // 얼굴에 사각형 박스 표시 처리
//            int interpolation = Imgproc.INTER_CUBIC;
//            Mat re = new Mat();
//            Imgproc.resize(src2, re, faceDetections.size(), 0, 0, interpolation );
//                for (Rect rect : faceDetections.toArray()) {
//                   Point pos=new Point(faceDetections.width(),faceDetections.size().height-faceDetections.height()/3);
//                    overlayImage
//                }
//            return Mat2BufferedImage(src1);
//        }catch (Exception e)
//        {
//            log.error(e.toString());
//        }
//    return bufferedImage;
//}
//
//}
//
