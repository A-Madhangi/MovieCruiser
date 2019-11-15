/**
 * 
 */
package com.cognizant.moviecruiser.dao;

import java.util.List;

import com.cognizant.moviecruiser.model.MovieList;


/**
 * @ created by madhangi 761100
 *
 */
public interface MovieListDao {

    List<MovieList> getMovieListAdmin();
	List<MovieList> getMovieListCustomer();
	void modifyMenuItem(MovieList movieList);
	MovieList getMovieList(long movieListId);
	
}
