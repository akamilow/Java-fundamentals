package RETOSC2.RETO3;

import java.util.ArrayList;
public class Producto {

    public static ArrayList<String> grupos(ArrayList<String> arr) {
        ArrayList<String> noRepetida = new ArrayList<>();
        for (String i : arr) {
            if (!noRepetida.contains(i)) {
                noRepetida.add(i);
            }
        }
        return noRepetida;
    }

    public static ArrayList<Integer> necesito_del_grupo(ArrayList<Integer> indices, ArrayList<String> grupos, String grupo) {
        ArrayList<Integer> necesito = new ArrayList<>();
        for (Integer i : indices) {
            if (grupos.get(i).equals(grupo)) {
                necesito.add(i);
            }
        }
        return necesito;
    }

    public static ArrayList<Integer> sirven_a_marta(ArrayList<Integer> maria, ArrayList<Integer> marta) {
        ArrayList<Integer> sirven = new ArrayList<>();
        for (Integer i : maria) {
            if (!marta.contains(i)) {
                sirven.add(i);
            }
        }
        return sirven;
    }

    public static Integer cuantas_cambian(ArrayList<Integer> maria, ArrayList<Integer> marta) {
        ArrayList<Integer> listaMaria = new ArrayList<>();
        ArrayList<Integer> listaMarta = new ArrayList<>();

        if (marta.size() > maria.size()) {
            for (Integer i : maria) {
                if (!marta.contains(i)) {
                    listaMaria.add(i);
                }
            }
            return listaMaria.size();
        } else {
            for (Integer i : marta) {
                if (!maria.contains(i)) {
                    listaMarta.add(i);
                }
            }
            return listaMarta.size();
        }
    }
    
}