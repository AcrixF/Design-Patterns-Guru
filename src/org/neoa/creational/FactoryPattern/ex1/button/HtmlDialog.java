package org.neoa.creational.FactoryPattern.ex1.button;

import org.neoa.creational.FactoryPattern.ex1.dialog.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
