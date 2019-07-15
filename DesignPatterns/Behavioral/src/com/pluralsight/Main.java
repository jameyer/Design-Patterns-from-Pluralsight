package com.pluralsight;

import com.pluralsight.iterator.BikeRepository;
import com.pluralsight.mediator.*;
import com.pluralsight.memento.Caretaker;
import com.pluralsight.memento.Employee;
import com.pluralsight.observer.MessageStream;
import com.pluralsight.observer.PhoneClient;
import com.pluralsight.observer.Subject;
import com.pluralsight.observer.TabletClient;
import com.pluralsight.state.Fan;
import com.pluralsight.strategy.AmexStrategy;
import com.pluralsight.strategy.CreditCard;
import com.pluralsight.strategy.VisaStrategy;
import com.pluralsight.template.OrderTemplate;
import com.pluralsight.template.StoreOrder;
import com.pluralsight.template.WebOrder;
import com.pluralsight.visitor.*;

import java.sql.SQLOutput;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
/*
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE,500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE,1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE,2000);
        bryan.handleRequest(request);
*/
/*
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);


        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);
        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);*/


//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
/*
        String context = "Lions";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));*/
/*
        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();

    //    while(bikeIterator.hasNext()){
    //        System.out.println(bikeIterator.next());
    //    }

        for (String bike:repo) {
            System.out.println(bike);
        }*/

/*        Mediator mediator = new Mediator();
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();*/

/*
        Caretaker caretaker = new Caretaker();

        Employee emp = new Employee();

        emp.setName("John Wick");
        emp.setAddress("111 Main Street");
        emp.setPhone("888-555-1212");

        System.out.println("Employee before save:                     " + emp);
        caretaker.save(emp);
        emp.setPhone("444-555-6666");
        caretaker.save(emp);
        System.out.println("Employee after changed phone number save: " + emp);
        emp.setPhone("333-999-6666"); // <--- we haven't called save!
        caretaker.revert(emp);
        System.out.println("Reverts to last save point:               " + emp);
        caretaker.revert(emp);
        System.out.println("Reverted to original:                     " + emp);
*/

/*        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Another new message!");*/
/*
        Fan fan = new Fan();

        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);*/

/*        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");


        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("04/2017");
        amexCard2.setCvv("234");

        System.out.println("Is Amex valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");

        System.out.println("Is Visa valid: " + visaCard.isValid());*/

/*        System.out.println("Web Order: ");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        System.out.println("Store Order:");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();*/

        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new AtvPartsShippingVisitor());
        System.out.println(" ");
        order.accept(new AtvPartDisplayVisitor());


    }
}
