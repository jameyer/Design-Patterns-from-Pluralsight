package com.pluralsight.abstractfactory;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch(cardType){
            case PLATINUM:
                return new VisaBlackCreditCard();
            case GOLD:
                return new VisaGoldCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
