package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entity.BookingJournal;
import com.hotel.entity.Reservation;

public interface BookingJournalRep extends JpaRepository<BookingJournal, Integer> {
	BookingJournal findById(int Id);
}
