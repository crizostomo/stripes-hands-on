/***
 * Excerpted from "Stripes: and Java Web Development is Fun Again",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/fdstr for more book information.
***/

package stripesbook.dao;


import java.util.List;
import stripesbook.model.Contact;


public interface ContactDao {
    public List<Contact> read();
    public Contact read(Integer id);
    public void save(Contact contact);
    public void delete(Integer id);
}

