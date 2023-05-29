package stripesbook.dao;

import java.util.*;

import stripesbook.model.Contact;

public class MockContactDao implements ContactDao {

    private static MockContactDao dao;

    private static Map<Integer, Contact> contacts;

    static {
        populateContacts();
    }

    public static ContactDao getInstance() {
        if (dao == null) {
            dao = new MockContactDao();
            return dao;
        }
        return dao;
    }

    public Collection<Contact> read() {
        return contacts.values();
    }

    public Contact read(Integer id) {
        return contacts.get(id);
    }

    public void save(Contact contact) {
        contacts.put(contact.getId(), contact);
    }

    public void delete(Integer id) {
        contacts.remove(id);
    }

    private static void populateContacts() {
        Contact zoro = new Contact("Roronoa", "Zoro", "roronoazoro@onepiece.com", "1199999999", "09/09/1999");
        Contact luffy = new Contact("Monkey", "Luffy", "monkeydluffy@onepiece.com", "1199999999", "09/09/1999");
        Contact sanji = new Contact("Vinsmoke", "Sanji", "vinsmokesanji@onepiece.com", "1199999999", "09/09/1999");
        Contact nami = new Contact("Nami", "Navigator", "nicorobin@onepiece.com", "1199999999", "09/09/1999");

        contacts = new HashMap<Integer, Contact>();
        contacts.put(zoro.getId(), zoro);
        contacts.put(luffy.getId(), luffy);
        contacts.put(sanji.getId(), sanji);
        contacts.put(nami.getId(), nami);
    }

}
