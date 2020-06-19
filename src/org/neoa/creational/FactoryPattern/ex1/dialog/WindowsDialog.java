package org.neoa.creational.FactoryPattern.ex1.dialog;

import org.neoa.creational.FactoryPattern.ex1.button.Button;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
