public class Palindromo {
    public static void main(String[] args) {

        String palavra = "Tenet";
        String reversa = "";

        for (int i = (palavra.length() - 1); i >= 0; i--) {
            reversa += palavra.charAt(i);
        }

        if (reversa.toLowerCase().equals(palavra.toLowerCase())) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");
        }

    }
}
