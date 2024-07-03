package Lmain.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    public Sets(){
        construirHashSet();
        cosntruirLinkendHashSet();
        construirTreeeSet();
        construirTreeeSetConComparador();
    }

    public void construirHashSet(){
        HashSet<String> conjunto=new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Pinas");
        System.out.println("HashSet:"+ conjunto);
        //Eliminar un elemento
        conjunto.remove("Banana");
        System.out.println("HashSet despues de remover banana:"+conjunto);
        conjunto.remove("Uvas");
        conjunto.remove("Pinas");
        System.out.println("HashSet despues de remover Uvas y Pinas:"+conjunto);

        //verifiar si un elemento existe
        boolean contieneNaranja=conjunto.contains("Naranja");
        System.out.println("¿HashSet contiene 'Naranja' ?" + conjunto);

        int tamano=conjunto.size();
        System.out.println("Tamaño del Hash:"+tamano);
    }

    public void cosntruirLinkendHashSet(){
        LinkedHashSet<String> conjunto=new LinkedHashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Pinas");
        System.out.println("LinkendHashSet:"+conjunto);



    }

    public void construirTreeeSet(){
        TreeSet<String> conjunto=new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Pinas");
        System.out.println("TreeSet:"+conjunto);

    }

    public void construirTreeeSetConComparador(){
        Comparator<String> ComparadorOrdenInverso=new Comparator<String>() {
            public int compare(String s1,String s2){
                return s2.compareTo(s1);
            }
        };
        TreeSet<String> conjunto=new TreeSet<>(ComparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Pinas");
        System.out.println("TreeSetInverso:"+conjunto);
    }

    
}
