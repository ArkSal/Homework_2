public class Homework {

    public static void main(String[] args) {

        TokenGenerator token = new TokenGenerator();
        System.out.println(token.tokenGenerator());

    }
}

/*
Zaimplementuj metodę Java - tokenGenerator().
                1. Liczba parametrów - dowolne
                2. Nazwa - tokenGenerator()
                3. Return - zwraca token
                4. token - to ciąg randomowych znaków [a-z][A-Z][0-9][!@#$%^&*()] - o dowolnej długości
                3  Metoda generuje 3 różne wersje tokenów w zależności od potrzeby usera:  5-znakowy, 10-znakowy oraz 15-znakowy

                Przykład tokena 5 znakowego - g4#2%
                Przykład tokena 10 znakowego - g4#2%hQQ5^
                Przykład tokena 15 znakowego - g4#2%hQQ5^YY5!2
                */
