import java.util.Scanner;
public class MenuProductos {
    
    
    public void menu()
    {
        Scanner leer = new Scanner(System.in);
        Productos productos = new Productos();
        int idProducto;
        int opcion;
        
        do
        {
            System.out.println("\n\tMENÚ PRODUCTOS");
            System.out.println("1.-Agregar producto");
            System.out.println("2.-Eliminar producto");
            System.out.println("3.-Buscar un producto");
            System.out.println("4.-Obtener todos los productos");
            System.out.println("5.-Salir");
            System.out.println("Ingresa una opción:");
            opcion = leer.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Ingresa el id del producto:");
                    idProducto = leer.nextInt();
                    System.out.println("Ingresa el nombre:");
                    String nombreProducto = leer.next();
                    productos.agregarProducto(idProducto, nombreProducto);
                    break;

                case 2:
                    System.out.println("Ingresa el id del producto a eliminar:");
                    idProducto = leer.nextInt();
                    System.out.println(productos.removerProducto(idProducto));
                    break;

                case 3:
                    System.out.println("Ingresa el id del producto a buscar:");
                    idProducto = leer.nextInt();
                    System.out.println(productos.obtenerProducto(idProducto));
                    break;
                    
                case 4:
                    System.out.println(productos.getProductos());
                    break;
            }
        }while(opcion !=5 );

    }
    
}
