import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void updateProduct(Product product) {
        
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getCode().equals(product.getCode())) {
                
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                break;
            }
        }
    }
    
    public void removeProduct(Product product) {
        products.remove(product);
    }
}
//17 vòng for để tìm kiếm sản phẩm
//21 cập nhật thông tin về sp