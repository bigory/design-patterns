package by.boldysh.creational.factory_method;

/**
 * HTML-диалог.
 */
public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
