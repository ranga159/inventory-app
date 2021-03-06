package com.myprojects.inventory.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Book")
@Table(name = "book")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Book extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private LocalDate published_date;
	private int isbn;
	@ManyToOne
	@JoinColumn(name="author_id", nullable= false)
	private Author author;
	
	

}
