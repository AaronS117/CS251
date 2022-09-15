public class project_01
{
    public static void main(String[] args)
    {
        // Mandatory code copy
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
    }// End Main


    public static void initDeck(boolean[] deck)
    {
        // set the values of deck to indicate that they are all
        // present - not dealt yet.

        for (int i = 0; i <= 51; i++)
            deck[i] = true;
    }

    public static boolean emptyDeck(boolean[] deck)
    {
        // returns whether all the cards in the deck
        // have already been dealt.

        for (int i = 0; i < 51; i++)
        {
            if (deck[i] == true){
                return false;
            }
        }
        return true;
    }

    public static int dealCard(boolean[] deck)
    {
        // returns a card (an int in the range 0 to 51) at random
        // that has not been dealt since the deck was initialize
        // via in Deck. Also notes (in deck) that this card is
        // no longer available.

        int a = (int) (Math.random()*(51));
        if (deck[a] == false){
            while (deck[a] == false){
                a = (int) (Math.random()*(51));
            }
        }
        deck [a] = false;
        System.out.print(a);
        return a;
    }
    public static void printCard(int card)
    {
        // given a card (an int in the range 0 to 51) prints
        // an appropriate representation of this card based
        // on a 1-1 and onto mapping of the set [0, 51] to
        // the cards described above.

        card = 1;
    }
}
