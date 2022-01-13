package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
	private List<Contact> contactList = new ArrayList<>(); 


	public boolean addContact(Contact contact) {
		return contactList.add(contact);
	}

	public List<Contact> getContactList() {
		return contactList;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program..");

	}

}
