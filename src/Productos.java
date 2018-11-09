import java.util.HashMap;
public class Productos 
{
    private HashMap<Integer,String> productos = new  HashMap<Integer,String>();
    
    
    public HashMap<Integer, String> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Integer, String> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(int key,String value) {
        productos.put(key, value); 
    }

    public Object obtenerProducto(int key) {
        if (productos.containsKey(key)) 
            return productos.get(key);
        else
            return "¡No existe el producto con el id "+ key +"!";
        
    }
    
    public Object removerProducto(int key)
    {
        if (productos.containsKey(key)) 
            return "Producto eliminado:"+ productos.remove(key);
        else
            return "¡No existe el producto con el id "+ key +"!";   
    }
    
}
