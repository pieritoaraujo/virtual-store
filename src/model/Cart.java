package model;
    import java.util.List;
    import java.util.ArrayList;
public class Cart {
    private List<Product> producto = new ArrayList<>();

    public void agregarProducto(Product p){
        producto.add(p);
    }

    public double calculoTotal(){
        double Ctotal = 0;

        for (Product p : producto){
            Ctotal += p.getPrecio();
        }
        return Ctotal;
    }
}
