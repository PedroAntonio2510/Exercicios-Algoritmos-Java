public class CheckA {

    public static void CheckLetter(String frase){
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            char currentChar = frase.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                count++;
            }
        }
        if(count > 0) {
            System.out.println("A letra A aparece " + count + " vezes");
        } else {
            System.out.println("A frase digitada nao possui a letra A");
        }
    }

}
