package com.moviedemoal.movieapp.repository

import com.moviedemoal.movieapp.data.model.MovieList
import com.moviedemoal.movieapp.data.remote.RemoteMovieDataSource

//Hemos implementado los metodos con un Cntrl + i
class MovieRepositoryImpl(private val dataSource: RemoteMovieDataSource): MovieRepository {
//    override suspend fun getUpcomingMovies(): MovieList {
//        return dataSource.getUpcomingMovies()
    override suspend fun getUpcomingMovies(): MovieList = dataSource.getUpcomingMovies()

    override suspend fun getTopRatedMovies(): MovieList = dataSource.getTopRatedMovies()

    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()
}