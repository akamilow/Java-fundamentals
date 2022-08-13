package RETOSC2.RETO3;

import java.util.ArrayList;
public class Obra {

    public static ArrayList<Integer> clases(ArrayList<Integer> arr) {
        ArrayList<Integer> noRepetido = new ArrayList<>();
        for (Integer i : arr) {
            if (!noRepetido.contains(i)) {
                noRepetido.add(i);
            }
        }
        return noRepetido;
    }

    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> indices, ArrayList<Integer> grupos, int grupo) {
        ArrayList<Integer> necesito = new ArrayList<>();
        for (Integer i : indices) {
            if (grupos.get(i).equals(grupo)) {
                necesito.add(i);
            }
        }
        return necesito;
    }

    public static ArrayList<Integer> noTengo(ArrayList<Integer> museoA, ArrayList<Integer> museoB) {
        ArrayList<Integer> sirven = new ArrayList<>();
        for (Integer i : museoA) {
            if (!museoB.contains(i)) {
                sirven.add(i);
            }
        }
        return sirven;
    }

    public static Integer puedoCambiar(ArrayList<Integer> museoA, ArrayList<Integer> museoB) {
        ArrayList<Integer> listaMuseoA = new ArrayList<>();
        ArrayList<Integer> listaMuseoB = new ArrayList<>();

        if (museoB.size() > museoA.size()) {
            for (Integer i : museoA) {
                if (!museoB.contains(i)) {
                    listaMuseoA.add(i);
                }
            }
            return listaMuseoA.size();
        } else {
            for (Integer i : museoB) {
                if (!museoA.contains(i)) {
                    listaMuseoB.add(i);
                }
            }
            return listaMuseoB.size();
        }
    }
}
