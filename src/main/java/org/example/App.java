package org.example;

public class App
{
    public static void main( String[] args )
    {
        Developer serverDev = new JavaDeveloper();
        Developer frontDev = new ReactDeveloper();

        if (serverDev instanceof BackDeveloper) {
            ((BackDeveloper) serverDev).developServer();
        }
        if (frontDev instanceof FrontDeveloper) {
            ((FrontDeveloper) frontDev).developGUI();
        }
    }
}
