package com.example.reminder.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.reminder.model.Reminder;

import java.util.List;

@Dao
public interface ReminderDao {

	@Query("SELECT * FROM reminder")
	List<Reminder> getAllReminders();

	@Insert
	void insertReminder(Reminder reminder);

	@Delete
	void deleteReminder(Reminder reminder);

	@Update
	void updateReminder(Reminder reminder);
}

