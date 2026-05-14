class first {
    int i, j;
    
    first(int a, int b) {
        i = a;
        j = b;
    }
    
    void show() {
        System.out.println("i + j: " + (i + j));
    }
}

class second extends first {
    int k;
    
    second(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    
    void show() {
        super.show(); 
        System.out.println("k: " + k);
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        second b1 = new second(1, 2, 3);
        b1.show(); 
    }
}