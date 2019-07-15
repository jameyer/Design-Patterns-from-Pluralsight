package com.pluralsight;

import com.pluralsight.abstractfactory.CardType;
import com.pluralsight.abstractfactory.CreditCard;
import com.pluralsight.abstractfactory.CreditCardFactory;
import com.pluralsight.builder.LunchOrder;
import com.pluralsight.builder.LunchOrderBean;
import com.pluralsight.builder.LunchOrderTele;
import com.pluralsight.factory.Website;
import com.pluralsight.factory.WebsiteFactory;
import com.pluralsight.factory.WebsiteType;
import com.pluralsight.prototype.Movie;
import com.pluralsight.prototype.Registry;
import com.pluralsight.singleton.DbSingleton;

public class App {

    public static void main(String[] args) {

        /************************************************
        * Singleton
        *************************************************/
/*
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton instance2 = DbSingleton.getInstance();
        System.out.println(instance2);

 */
        /***************************************************
         * Builder example = also shows telescoping
         **************************************************/
        /*
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());



        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat","Lettuce","Mustard","Ham");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());


    */

        /*********************************************************
         * Prototype Pattern
         ********************************************************/
/*
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
*/

        /**********************************************************************
         * Factory Pattern
         **********************************************************************/
/*

        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());

*/

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = abstractFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());



    }
}
