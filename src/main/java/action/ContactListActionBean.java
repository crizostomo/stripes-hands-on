package action;

import net.sourceforge.stripes.action.*;
import dao.ContactDao;
import dao.MockContactDao;
import model.Contact;

import java.util.Collection;

public class ContactListActionBean extends BaseActionBean {

	private final String LIST = "/WEB-INF/jsp/contact_list.jsp";
	private final String VIEW = "/WEB-INF/jsp/contact_view.jsp";
	
	private ContactDao contactDao = MockContactDao.getInstance();
	
	private Integer contactId;
	
	@DefaultHandler
	public Resolution list() {
		return new ForwardResolution(LIST);
	}
	
	public Resolution view() {
		return new ForwardResolution(VIEW);
	}
	
	public Resolution delete() {
		Contact contact = contactDao.read(getContactId());
		contactDao.delete(getContactId());
		getContext().getMessages().add(new SimpleMessage("Deleted {0}", contact));
		return new RedirectResolution(getClass());
	}
	
	public Collection<Contact> getContacts() {
		return contactDao.read();
	}
	
	public Contact getContact() {
		return contactDao.read(getContactId());
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getContactId() {
		return contactId;
	}
}
