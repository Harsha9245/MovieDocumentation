package com.movie.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie_info")
public class MovieInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id    
	@Column(name="MOVIE_ID")
	String movieId;
	@Column(name="MOVIE_NAME")
	String moviename;
	@Column(name="GENRE")
	String genre;
	@Column(name="DIRECTOR")
	String director;
	
	@OneToMany(targetEntity = Theatre.class,cascade = CascadeType.ALL)
	@JoinColumn(name="Movie_Name",referencedColumnName = "MOVIE_NAME")
	List<Theatre> theatre=new ArrayList<Theatre>();
	
	
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
