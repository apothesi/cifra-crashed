public class Main {
    
    static String limpar(String s) {
        return s.toUpperCase().replaceAll("[^A-Z]", "");
    }
    
    static String cifrar(String s, int salto) {
        String limpo = limpar(s);
        int n = limpo.length();
        StringBuilder r = new StringBuilder();
        
        for (int i = 0, idx = 0; i < n; i++, idx = (idx + salto) % n) {
            r.append(limpo.charAt(idx));
        }
        return r.toString();
    }
    
    static String decifrar(String cifrado, int salto) {
        int n = cifrado.length();
        char[] orig = new char[n];
        
        for (int i = 0; i < n; i++) {
            orig[(i * salto) % n] = cifrado.charAt(i);
        }
        return new String(orig);
    }
    
    public static void main(String[] args) {
        String frase = "Quero ser programador. Aprendi Java no Devisate. Marilia";
        
        String c5 = cifrar(frase, 5);
        System.out.println("Cifrado 5: " + c5);
        System.out.println("Decifrado: " + decifrar(c5, 5));
        
        String c8 = cifrar(frase, 8);
        System.out.println("\nCifrado 8: " + c8);
        System.out.println("Decifrado: " + decifrar(c8, 8));
        
        String c3 = cifrar(frase, 3);
        System.out.println("\nCifrado 3: " + c3);
        System.out.println("Decifrado: " + decifrar(c3, 3));
    }
}
