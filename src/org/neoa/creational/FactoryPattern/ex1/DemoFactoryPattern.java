package org.neoa.creational.FactoryPattern.ex1;

import org.neoa.creational.FactoryPattern.ex1.button.HtmlDialog;
import org.neoa.creational.FactoryPattern.ex1.dialog.Dialog;
import org.neoa.creational.FactoryPattern.ex1.dialog.WindowsDialog;

public class DemoFactoryPattern {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    public static void configure() {

        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    public static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
