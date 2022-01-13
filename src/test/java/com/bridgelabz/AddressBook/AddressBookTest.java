package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class AddressBookTest {
@Test
public void givenContactInfo_AfterAddingContact_ShouldTrue() {
	Contact contact = new Contact("Rohini", "Telang", "Pune", "Pune", "Maharashtra","abc@gmail.com", "9787786635", "435623");
	
	AddressBookMain addressBookMain = new AddressBookMain();
	addressBookMain.addContact(contact);
	List<Contact> contactsList = new ArrayList<Contact>();
	contactsList = addressBookMain.getContactList();
	   Assert.assertTrue(contactsList.contains(contact));
}
@Test
public void givenContactInfo_AfterAddingContact_ShouldFalse() {
	Contact contact = new Contact("Rohini", "Telang", "Pune", "Pune", "Maharashtra","abc@gmail.com", "9787786635", "435623");
	
	AddressBookMain addressBookMain = new AddressBookMain();
	addressBookMain.addContact(contact);
	List<Contact> contactsList = new ArrayList<Contact>();
	contactsList = addressBookMain.getContactList();
	   Assert.assertFalse(contactsList.contains(contact));
}
}
