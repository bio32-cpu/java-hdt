import java.util.ArrayList;

public class ProductManager {
   private ArrayList<Product> productList;
   
   public ProductManager() {
      productList = new ArrayList<>();
   }
   
   public void addProduct(Product product) {
      productList.add(product);
      System.out.println("add pass");
   }
   
   public void removeProduct(int productId) {
      for (Product product : productList) {
         if (product.getId() == productId) {
            productList.remove(product);
            System.out.println("remove pass ");
            return;
         }
      }
      System.out.println("lỗi");
   }
   
   public void displayProducts() {
      System.out.println("danh sách product ");
      for (Product product : productList) {
         System.out.println(product);
      }
   }
   
   public void updateProduct(int productId, String name, double price) {
      for (Product product : productList) {
         if (product.getId() == productId) {
            product.setName(name);
            product.setPrice(price);
            System.out.println("cập nhật pass");
            return;
         }
      }
      System.out.println("lỗi");
   }
   
   public ArrayList<Product> getProductList() {
      return productList;
   }
}
//sử dụng ArrayList<Product>.
//21 cập nhật thông tin về sp