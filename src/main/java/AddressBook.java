import java.util.*;

public class AddressBook {
    private HashMap<String, Set<String>> addressBook = new HashMap<>();

    /** Метод добавляет контакт в телефонный справочник */
    public void add(String surname, String phoneNumber) {
        Set<String> phoneNumbers = addressBook.containsKey(surname) ? addressBook.get(surname) : new HashSet<>();
        phoneNumbers.add(phoneNumber);
        addressBook.put(surname, phoneNumbers);
    }

    /** Метод выводит телефон контакта из телефонного справочника,
     * в т.ч. если контакт встречается в справочнике несколько раз */
    public void get(String surname) {
        for (String contact : addressBook.keySet()) {
            if (contact.equals(surname)) {
                System.out.println("Contact: " + surname + " has phone number: " + addressBook.get(surname));
             }
        }

    }
}
