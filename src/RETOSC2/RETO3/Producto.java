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

    public static ArrayList<String> sirven_a_marta(ArrayList<String> maria, ArrayList<String> marta) {
        ArrayList<String> sirven = new ArrayList<>();
        for (String i : maria) {
            if (!marta.contains(i)) {
                sirven.add(i);
            }
        }
        return sirven;
    }

    public static Integer cuantas_cambian(ArrayList<String> entradaMaria, ArrayList<String> entradaMarta) {
        ArrayList<String> listaMaria = new ArrayList<>();
        ArrayList<String> listaMarta = new ArrayList<>();

        if (entradaMarta.size() > entradaMaria.size()) {
            for (String i : entradaMaria) {
                if (!entradaMarta.contains(i)) {
                    listaMaria.add(i);
                }
            }
            return listaMaria.size();
        } else {
            for (String i : entradaMarta) {
                if (!entradaMaria.contains(i)) {
                    listaMarta.add(i);
                }
            }
            return listaMarta.size();
        }
    }
}