package com.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

	public static void main(String[] args) {
//		new MovieRepository().getSomeMoviesByYear(2000).forEach(System.out::println);
		boolean updateMovie = new MovieRepository().updateMovie(new Movie("M_1000", "xdsnk", 1233, 5));
		System.out.println("Movie with id M_1000 " + (updateMovie ? "has been updated" : "hasn't been updated"));

		Movie movie = new Movie("MI6", "Georgica", 2000, 100);
		boolean insertMovie = new MovieRepository().insertMovie(movie);
		System.out.println("Movie " + movie.toString()
				+ (insertMovie ? "has been inserted successfully!!!" : "hasn't been inserted"));
	}

	public List<Movie> getSomeMovies() {
		List<Movie> movieList = new ArrayList<>();
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			String query = "select * from movie_info where year > 2000 limit 20";
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				Movie movie = new Movie();
				// m.setId(rs.getString(1));
				movie.setId(rs.getString("movie_id")); // dupa numele coloanei
				movie.setName(rs.getString(2));
				movie.setYear(rs.getInt(3));
				movie.setRating(rs.getInt(4));
				movieList.add(movie);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieList;
	}

	public List<Movie> getSomeMoviesByYear(int year) {
		List<Movie> movieList = new ArrayList<>();
		try (Connection connection = getConnection()) {
			String query = "select * from movie_info where year > ? limit 20";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, year);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Movie movie = new Movie();
				// m.setId(rs.getString(1));
				movie.setId(rs.getString("movie_id")); // dupa numele coloanei
				movie.setName(rs.getString(2));
				movie.setYear(rs.getInt(3));
				movie.setRating(rs.getInt(4));
				movieList.add(movie);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieList;
	}

	private boolean updateMovie(Movie movie) {
		try (Connection connection = getConnection()) {
			String update = "update movie_info set year = 1999 where movie_id = ?";
			PreparedStatement ps = connection.prepareStatement(update);
			ps.setString(1, movie.getId());
			int rows = ps.executeUpdate();
			System.out.println("is autocommit --> " + connection.getAutoCommit());
			return rows > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	private boolean insertMovie(Movie movie) {
		try (Connection connection = getConnection()) {
			String insert = "insert into movie_info values(?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setQueryTimeout(10);
			ps.setString(1, movie.getId());
			ps.setString(2, movie.getName());
			ps.setInt(3, movie.getYear());
			ps.setInt(4, movie.getRating());
			int rows = ps.executeUpdate(); // returns numarul de randuri afectate de operatie
			return rows > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	private Connection getConnection() {
		try {
			// jdbc:tipulBazeiDeDate://numeHost(sau IP):port/database_name
			DriverManager.setLoginTimeout(10);
			return DriverManager.getConnection("jdbc:mysql://localhost/movie", "root", "password");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Vezi ca ai gresit url-ul de conctare la Db");
			return null;
		}
	}

}
