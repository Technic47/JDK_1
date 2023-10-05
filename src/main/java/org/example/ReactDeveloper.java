package org.example;

public class ReactDeveloper extends Developer implements FrontDeveloper {
    @Override
    public void developGUI() {
        System.out.println("Creates nice web page.");
    }
}
