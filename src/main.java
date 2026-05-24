import model.Product;
import model.Cart;
import adapter.ExternalPaypalService;
import adapter.PayPalAdapter;
import adapter.PaymentProcessor;
import observer.EmailNotificationObserver;
import observer.AdminNotificationObserver;
import observer.InventoryObserver;
import service.OrderService;

class main {
    static void main(String[] args) {

        Product p1 = new Product("Play Station", 2599);
        Product p2 = new Product("Xbox", 2450);
        Product p3 = new Product("Laptop Gamer", 7600);
        Product p4 = new Product("Television 75", 1800);
        Product p5 = new Product("Silla Gamer", 550);

        Cart carrocomprasPA = new Cart();
        carrocomprasPA.agregarProducto(p1);
        carrocomprasPA.agregarProducto(p5);

        double total = carrocomprasPA.calculoTotal();

        PaymentProcessor pago = new PayPalAdapter(new ExternalPaypalService());
        OrderService OrdenS = new OrderService();
        OrdenS.agregarObserver(new EmailNotificationObserver());
        OrdenS.agregarObserver(new InventoryObserver());
        OrdenS.agregarObserver(new AdminNotificationObserver());

        System.out.println("Compra confirmada por S/ " +total);

        OrdenS.notificarObserver("Compra realizada");

        System.out.println();

        Cart carrocomprasPA2 = new Cart();
        carrocomprasPA2.agregarProducto(p2);
        carrocomprasPA2.agregarProducto(p3);
        carrocomprasPA2.agregarProducto(p4);

        double total2 = carrocomprasPA2.calculoTotal();
        System.out.println("Compra confirmada por S/ " +total2);
        OrdenS.notificarObserver("Compra realizada");
    }
}
