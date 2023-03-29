import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private List<Product> products = new ArrayList<>();
    
}
    public Order(String id) {
    this.id = id;
}


    public String getId() {
    return id;
}

    public void setId(String id) {
    this.id = id;
}

    public List<Product> getProducts() {
    return products;
}

    public void addProduct(Product product) {
    products.add(product);
}

    public void removeProduct(Product product) {
    products.remove(product);
}

    public double getTotalPrice() {
    double totalPrice = 0.0;
    for (Product product : products) {
        totalPrice += product.getPrice();
    }
    return totalPrice;
}
}

// khởi tạo biến total với giá trị ban đầu là 0.0 đẻ lưu giá trị các sp.
//sử dụng for để lấy lần lượt từng sản phẩm trong danh sách product.
// với mỗi sp, phương thức gọi getprive() của sản phẩm đó và cộng vào biế total
//sau khi trong sẽ trả  về giá trị total Eg: có 3sp: 100.(10+20+70=100)