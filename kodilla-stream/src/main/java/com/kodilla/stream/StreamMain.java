package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){
        /*
        System.out.println("Welcome to module 7 - Stream!");

       Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Processor processor2 = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor2.execute(codeToExecute);


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expression with lambdas.");
        expressionExecutor.executeExpression(5,5, (a, b) -> a + b );
        expressionExecutor.executeExpression(6,2, (a, b) -> a - b );
        expressionExecutor.executeExpression(3,2, (a, b) -> a * b);
        expressionExecutor.executeExpression( 10, 2, (a, b) -> a / b );

        System.out.println("\nCalculating expression with method reference.");
        expressionExecutor.executeExpression(5,5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(6,2, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,2, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10,2, FunctionalCalculator::divideAByB);
        */
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String test = poemBeautifier.beautify("RKS ", text -> text + "Motor Lublin!");
        System.out.println(test);

    }
}
