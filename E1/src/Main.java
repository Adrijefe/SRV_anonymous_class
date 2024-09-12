class Persona {
    // ...
}

interface alumno{

}

public class Main {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {

        alumno alumne = new alumno(){};

        imprimirJerarquiaDeClasses(alumne.getClass());
    }
}