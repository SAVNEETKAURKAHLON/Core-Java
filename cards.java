import java.util.Random;

public class Cards {
    private String suit[]={"s","d","c","h"};
    String selectedCard;
   
    String getSuit(){
        return selectedCard;
    }

    void setCard(){
        selectedCard = selectCard();
    }


    String selectCard(){
        String card;
        Random random = new Random();
        int randomSuit = random.nextInt(4 + 1 - 0) + 0;

        card = suit[randomSuit];

        int randomNumber = random.nextInt(13 + 1 - 1) + 1;
        card = card+randomNumber;
        return card;
    }

    public static void main(String args[]){
        Cards card = new Cards();
        card.setCard();
        System.out.println(" in card "+card.getSuit());

        Cards card2 = new Cards();
        card2.setCard();
        System.out.println(" in card 2 "+card2.getSuit());
    }
}
