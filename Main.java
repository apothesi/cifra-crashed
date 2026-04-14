public class Main {
    
    static String limpar(String s) {
        return s.toUpperCase().replaceAll("[^A-Z]", "");
    }
    
    static String cifrar(String s, int salto) {
        String limpo = limpar(s);
        int n = limpo.length();
        char[] cifrado = new char[n];
        
        for (int i = 0; i < n; i++) {
            cifrado[i] = limpo.charAt((i * salto) % n);
        }
        return new String(cifrado);
    }
    
    static String decifrar(String s, int salto) {
        int n = s.length();
        char[] limpo = new char[n];
        
        for (int i = 0; i < n; i++) {
            limpo[(i * salto) % n] = s.charAt(i);
        }
        return new String(limpo);
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
