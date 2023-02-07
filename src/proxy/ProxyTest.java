package proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("img1.jpg");
        Image image2 = new ProxyImage("img2.jpg");

        image1.displayImage();
        System.out.println();
        image2.displayImage();
    }
}
