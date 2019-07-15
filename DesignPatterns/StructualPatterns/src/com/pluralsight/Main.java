package com.pluralsight;

import com.pluralsight.adapter.Employee;
import com.pluralsight.adapter.EmployeeAdapterLdap;
import com.pluralsight.adapter.EmployeeDB;
import com.pluralsight.adapter.EmployeeLdap;
import com.pluralsight.bridge.*;
import com.pluralsight.composite.Menu;
import com.pluralsight.composite.MenuItem;
import com.pluralsight.decorator.DressingDecorator;
import com.pluralsight.decorator.MeatDecorator;
import com.pluralsight.decorator.Sandwich;
import com.pluralsight.decorator.SimpleSandwich;
import com.pluralsight.facade.Address;
import com.pluralsight.facade.JdbcFacade;
import com.pluralsight.flyweight.InventorySystem;
import com.pluralsight.proxy.SecurityProxy;
import com.pluralsight.proxy.TwitterService;
import com.pluralsight.proxy.TwitterServiceImpl;
import com.pluralsight.proxy.TwitterServiceStub;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*	// write your code here
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john.wick@wick.com");
        employees.add(employeeFromDB);
        // Below won't work, needs adapter.
        //Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han.solo@rebelbase.com");
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han.solo@rebelbase.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        System.out.println(employees);*/

/*
        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();*/

/*

        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety","/safety");
        mainMenu.add(safetyMenuItem);
        Menu claimsSubMenu = new Menu("Claims","/claims");
        mainMenu.add(claimsSubMenu);
        MenuItem personalClaimsMenu = new MenuItem("Personal Claim","/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
*/

/*        Sandwich sandwich = new DressingDecorator(new MeatDecorator( new SimpleSandwich()));

        System.out.println(sandwich.make());

        */
/*

        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();
        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddresses();
        for (Address address : addresses) {
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
        }
*/

/*
        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung TV", 432);
        ims.takeOrder("Samsung TV", 323);
        ims.takeOrder("Roomba", 563);
        ims.takeOrder("Bose Headphones", 321);
        ims.takeOrder("Roomba", 234);
        ims.takeOrder("Samsung TV", 54);
        ims.takeOrder("Roomba", 34);
        ims.takeOrder("Bose Headphones", 365);
        ims.takeOrder("Samsung TV", 332);
        ims.takeOrder("Roomba", 456);

        ims.process();

        System.out.println(ims.report());

        */

/*

        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline("bh5k"));

*/





    }
}
