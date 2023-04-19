import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<Integer, Order> orderMap; 
    private DataAccess dataAccess;

    public OrderManager() {
        orderMap = new HashMap<>();
        dataAccess = new DataAccess();
        orderMap = dataAccess.loadOrders(); 
    }

    public void addOrder(Order order) {
        int orderId = order.getId();
        orderMap.put(orderId, order);
        dataAccess.saveOrders(orderMap); 
    }

    public void updateOrder(Order order) {
        int orderId = order.getId();
        if (orderMap.containsKey(orderId)) {
            orderMap.put(orderId, order);
            dataAccess.saveOrders(orderMap); 
        } else {
            System.out.println("Không tìm thấy " + orderId);
        }
    }

    public void deleteOrder(int orderId) {
        if (orderMap.containsKey(orderId)) {
            orderMap.remove(orderId);
            dataAccess.saveOrders(orderMap); 
        } else {
            System.out.println("Không tìm thấy " + orderId);
        }
    }

    public void displayAllOrders() {
        System.out.println("Danh sách đơn hàng:");
        for (Order order : orderMap.values()) {
            System.out.println(order);
        }
    }
}
