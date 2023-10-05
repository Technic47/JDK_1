package org.example;

public class JavaDeveloper extends Developer implements BackDeveloper{
    @Override
    public void developServer() {
        System.out.println("Writes Spring program.");
    }
}
