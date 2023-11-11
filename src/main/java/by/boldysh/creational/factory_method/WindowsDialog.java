package by.boldysh.creational.factory_method;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
