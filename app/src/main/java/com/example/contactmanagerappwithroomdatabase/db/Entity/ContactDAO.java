package com.example.contactmanagerappwithroomdatabase.db.Entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ContactDAO {

    @Insert
    public long addContact(Contacts contact);

    @Update
    public void updateContact(Contacts contact);

    @Delete
    public void deleteContact(Contacts contact);


    @Query("select * from contacts")
    public List<Contacts> getContacts();

    @Query("select * from contacts where contact_id ==:contactId")
    public Contacts getContact(long contactId);

}
