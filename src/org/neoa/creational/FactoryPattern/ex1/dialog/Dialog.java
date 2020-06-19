package org.neoa.creational.FactoryPattern.ex1.dialog;

import org.neoa.creational.FactoryPattern.ex1.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }


    public abstract Button createButton();
}
