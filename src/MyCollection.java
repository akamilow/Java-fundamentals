import java.util.*;

public class MyCollection {
    ArrayList<Integer> mc1 = new ArrayList<>();

    public void insertarAlFinal(int valor) {
        mc1.add(valor);
    }

    public void insertarAlPrincipio(int valor) {
        mc1.add(0, valor);
    }

    public void agregarAlFinal(List<Integer> list) {
        mc1.addAll(list);
    }

    public void eliminar(int index) {
        mc1.remove(index);
    }

    public void setValor(int index, int value) {
        mc1.add(index, value);
    }

    public int getValor(int index) {
        return mc1.get(index);
    }

    public int getSumatoria() {
        int suma = 0;
        for (int mc1 : mc1) {
            suma += mc1;
        }
        return suma;
    }

    public double getPromedio() {
        double avg;
        double suma = 0;
        for (int mc1 : mc1) {
            suma += mc1;
        }
        avg = (suma / mc1.size());
        return avg;
    }

    public int cuentaElementos() {
        int elements;
        elements = mc1.size();
        return elements;
    }

    public int cuentaCeros() {
        int count = 0;
        for (int mc1 : mc1) {
            if(mc1 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public int sumaPares() {
        int plus = 0;
        for (int mc1 : mc1) {
            if(mc1 % 2 == 0) {
                plus += mc1;
            }
        }
        return plus;
    }

    public int cuentaRepeticiones(int number) {
        int count = 0;
        for (int mc1 : mc1) {
            if(mc1 == number) {
                count += 1;
            }
        }
        return count;
    }

    public void reemplazarValor(int antiguoValor, int nuevoValor) {
        mc1.set(antiguoValor, nuevoValor);
    }

    public void reemplazarTodo(List<Integer> list) {
        mc1.removeAll(mc1);
        mc1.addAll(list);
    }

    public ArrayList<Integer> invertir() {
        ArrayList<Integer> reversedArray = new ArrayList<>();    
        for (int i = mc1.size() - 1; i >= 0; i--) {
            reversedArray.add(mc1.get(i));
        }
        return reversedArray;
    }

    public int getMayor() {
        int greater = Collections.max(mc1);
        return greater;
    }

    public int getMenor() {
        int minor = Collections.min(mc1);
        return minor;
    }

    public ArrayList<Integer> getPrimeros(int value) {
        ArrayList<Integer> firstPart = new ArrayList<>(); 
        for (int i = 0; i <= value -1; i++) {
            firstPart.add(mc1.get(i));
        }
        return firstPart;
    }

    public ArrayList<Integer> getUltimos(int value) {
        ArrayList<Integer> lastPart = new ArrayList<>();    
        for (int i = value +2; i <= mc1.size() - value +1; i++) { 
            lastPart.add(mc1.get(i));
        }
        return lastPart;
    }

    public boolean esPalindrome() {
       int front = 0;
       int back = mc1.size() - 1;

       while(front < back)
            if (!mc1.get(front++).equals(mc1.get(back--)))
                return false;
        return true;
    }

    public boolean buscar(int number) {
        if (mc1.contains(number))
            return true;
        return false;
    }

    public void mostrarContenido() {
        System.out.println(mc1);
    }
}

        
        
        
    










