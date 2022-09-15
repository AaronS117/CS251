public class project_01
{
    public static void main(String[] args)
    {
        boolean[] myDeck = new boolean[52];
        final int cardsPerRow = 8;
        int cardsThisRow = 0;
        int myCard;
        initDeck(myDeck);
        System.out.println("\nHere is a shuffled deck ...\n");
        while (!emptyDeck(myDeck))
        {
            myCard = dealCard(myDeck);
            ++cardsThisRow;
            if (cardsThisRow <= cardsPerRow)
            {
                printCard(myCard);
                System.out.print(" ");
            }
            else
            {
                System.out.println("");
                cardsThisRow = 1;
                printCard(myCard);
                System.out.print(" ");
            }
        }
        System.out .println('\n');
    }
    public static void initDeck(boolean[] deck) {
        for (int i = 0; i <= 51; i++)
            deck[i] = true;
    }
    public static boolean emptyDeck(boolean[] deck){
        for (int i = 0; i < 51; i++) {
            if (deck[i]){
                return false;
            }
        }
        return true;
    }
    public static int dealCard(boolean[] deck) {
        while (!emptyDeck(deck)){
            for (int j = 0; j < 51; j++) {
            }
        }

        return 0;
    }
    public static void printCard(int card){
        card = 1;
    }
}
