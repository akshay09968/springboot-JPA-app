package coms.SpringJpaApplication.service;

import java.util.List;



import coms.SpringJpaApplication.model.PhoneBook;

public interface PhoneBookService {
	/*
	 * Declare some methods for CURD operations
	 * */
	public String AddPhoneBook(PhoneBook pb);
	public List<PhoneBook> ShowAll();
	public PhoneBook searchPhone(int cid);
	public String UpdatePhoneBook(PhoneBook pb);
	public String DeletePhoneBook(int cid);
}
