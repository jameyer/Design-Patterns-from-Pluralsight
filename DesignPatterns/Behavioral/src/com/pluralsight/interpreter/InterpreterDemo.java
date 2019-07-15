package com.pluralsight.interpreter;

public class InterpreterDemo {
    public static Expression buildInterpreterTree() {

        Expression terminal1 = new TerminalExpression("Lions");
        return terminal1;
//        Expression terminal2 = new TerminalExpression("Tigers");
//        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
//        Expression alternation1 = new AndExpression(terminal2, terminal3);
//
//        //Lions or (Tigers and Bears)
//        Expression alternation2 = new OrExpression(terminal1, alternation1);
//
//        return new AndExpression(terminal3, alternation2);
    }
}
