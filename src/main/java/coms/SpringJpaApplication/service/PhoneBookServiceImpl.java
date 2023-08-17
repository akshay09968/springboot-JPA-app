package coms.SpringJpaApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.SpringJpaApplication.Repositories.PhoneBookRepo;
import coms.SpringJpaApplication.model.PhoneBook;

@Service
public class PhoneBookServiceImpl implements PhoneBookService{
	
	@Autowired
	PhoneBookRepo pbr;
	
	@Override
	public String AddPhoneBook(PhoneBook pb) {
		PhoneBook p = pbr.save(pb); //saves data into db and returns same object
		if(p!=null)
			return "Success";
		else
			return "Error";
	}

	@Override
	public List<PhoneBook> ShowAll() {
		List<PhoneBook> allcustomers = pbr.findAll(); //fetches all rows from the db and stores into the list of objects
		return allcustomers;
	}

	@Override
	public PhoneBook searchPhone(int cid) {
		Optional<PhoneBook> pbook = pbr.findById(cid);
		if(pbook.isPresent())
			return pbook.get(); // it will return phonebook object
		return null;
	}

	@Override
	public String UpdatePhoneBook(PhoneBook pb) {
		PhoneBook pbs = pbr.saveAndFlush(pb);
		if(pbs!=null) 
			return "Success";	
		return "Fail";
	}

	@Override
	public String DeletePhoneBook(int cid) {
		Optional<PhoneBook> pbook = pbr.findById(cid);
		if(pbook.isPresent()) {
			pbr.deleteById(cid);
			return "Success";
		}
		return "Fail";
	}
}
