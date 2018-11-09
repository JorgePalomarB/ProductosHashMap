
import java.util.HashMap;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JORGE
 */
public class TestHashMap {
 
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        
        hashMap.put(12, "Jorge");
        hashMap.put(1, "Héctor");
        hashMap.put(2, "Ramiro");
        hashMap.put(5, "Isabel");
        hashMap.put(56, null);
        
        System.out.println("Obtenemos el hashMap completo: " + hashMap + "\n");
        System.out.println("Conjunto de keys: " + hashMap.keySet() + "\n");
        System.out.println("Conjunto de values: " + hashMap.values()+ "\n");
        
        System.out.println("Eliminando elemento con la key 1: " + hashMap.remove(1) + "\n");
        System.out.println("Obtenemos el nuevo hashMap completo: " + hashMap + "\n");
        System.out.println("Obtener un elemento con la key 12 : " + hashMap.get(12) + "\n");
        
        //Borra todos los elementos
        //hashMap.clear();
        
        
        if (hashMap.containsValue("Jorge")) 
            System.out.println("Se encontró el valor \"Jorge\" en el hashMap");
        else
            System.out.println("No se encontró el valor \"Jorge\" en el hashMap");
       
        if (hashMap.containsValue(null)) 
            System.out.println("Se encontró el valor NULL ");
        else
            System.out.println("No se encontró el valor NULL");
        
        System.out.println("Mostrar información:");
        
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer llave = iterator.next();
            System.out.println(llave + "-" + hashMap.get(llave));
            
        }
        
       
        
    
       
        
    }
    
}
