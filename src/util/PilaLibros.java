package util;

public class PilaLibros {
    private Libro[] elementos;
    private int tope;
    private int max;

    public PilaLibros(int max) {
        this.max = max;
        this.elementos = new Libro[max];
        this.tope = -1;
    }
    
    public void push(Libro libro) {
        if (PilaLlena()) {
            System.out.println("La pila está llena");
            return;
        }
        
        this.tope++;
        this.elementos[this.tope] = libro;
    }

    public Libro pop() {
        Libro libro = this.elementos[this.tope];
        this.tope--;
        return libro;
    }

    public Libro elementoArriba() {        
        return this.elementos[this.tope];
    }

    public boolean PilaVacia() {
        return this.tope == -1;
    }

    public boolean PilaLlena() {
        return this.tope == this.max - 1;
    }

    // Getters
    public int getTope() { return this.tope; }
    public int getMax() { return this.max; }

    // Setters
    public void setTope(int tope) { this.tope = tope; }
    public void setMax(int max) { this.max = max; }
}
