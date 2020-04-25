import ru.geekbrains.servlet.route.service.ProductRepr;
import ru.geekbrains.servlet.route.service.ProductService;
import ru.geekbrains.servlet.route.service.ProductServiceWs;

import java.net.MalformedURLException;
import java.net.URL;

public class Client {


    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:8080/javaee/productService/ProductService?WSDL");
        ProductService productService = new ru.geekbrains.servlet.route.service.ProductService(url);
        ProductServiceWs serviceWs = productService.getProductServicePort();

        serviceWs.findAll().forEach(p -> System.out.println(p.getName()));
        System.out.println(serviceWs.find(1).getName());

        ProductRepr productRepr = new ProductRepr();
        productRepr.setId(1);
        serviceWs.delete(productRepr);
    }
}
