/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application.testevelocidadelists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author wasabi
 */
public class TesteVelocidadeLists {

    public static void main(String[] args) {
        int tamanho = 10000;
        
        List<Integer> arrayList = new ArrayList();
        
        long startTime = System.nanoTime();
        
        for(int i = 0; i < tamanho; i++){
            
            arrayList.add(i);
        
        }
        
        long endTime = System.nanoTime();
        
        System.out.println("ArrayList - Insert Final : " + (endTime - startTime));
        
        startTime = System.nanoTime();
        
        for(int i = 0; i < tamanho; i++){
        
            arrayList.get(i);
        
        }
        
        
        endTime = System.nanoTime();
        System.out.println("ArrayList - Acesso de Indice : " + (endTime - startTime));
       
        List<Integer> linkedList = new LinkedList <>();
        startTime = System.nanoTime();
        
        for(int i = 0; i < tamanho; i++){
        
              linkedList.add(i);
        
        } 
        
        endTime = System.nanoTime();
     
        System.out.println("LinkedList - Insert Final : " + (endTime - startTime));
        
        startTime = System.nanoTime();
        
        for(int i = 0; i < tamanho; i++){
        
            linkedList.get(i);
        }
        
        endTime = System.nanoTime();
        System.out.println("LinkedList  - Acesso de Indice : " + (endTime - startTime));
    
        
    }   
    
      
}
