package by.boldysh.creational.abstract_factory;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 * <p>
 * Вариация чекбокса под Windows.
 */
public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
