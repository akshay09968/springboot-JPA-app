package coms.SpringJpaApplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.SpringJpaApplication.model.PhoneBook;

@Repository
public interface PhoneBookRepo extends JpaRepository<PhoneBook,Integer>{
/*
 * JpaRepository consists of following methods 
 * save() - for saving new record
 * findAll() - to show all rows 
 * findById() - to find a row based primary key field
 * saveAndFlush() - to modify exist record
 * DeleteById(0) - to delete a row based on primary key field
 * */
}
