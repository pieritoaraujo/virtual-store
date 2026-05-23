package service;
    import observer.OrderObserver;
    import java.util.ArrayList;
    import java.util.List;

public class OrderService {
    private List<OrderObserver> observers = new ArrayList<>();

    public void agregarObserver(OrderObserver observer) {
        observers.add(observer);
    }
    public void notificarObserver(String message){
        for(OrderObserver observer : observers);
    }
}
