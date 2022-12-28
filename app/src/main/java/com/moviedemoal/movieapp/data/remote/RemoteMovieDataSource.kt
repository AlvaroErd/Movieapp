package com.moviedemoal.movieapp.data.remote

import com.moviedemoal.movieapp.application.AppConstants
import com.moviedemoal.movieapp.data.model.MovieList
import com.moviedemoal.movieapp.repository.WebService

class RemoteMovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList =
        webService.getUpcomingMovies(AppConstants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList =
        webService.getTopRatedMovies(AppConstants.API_KEY)

    suspend fun getPopularMovies(): MovieList =
        webService.getPopularMovies(AppConstants.API_KEY)
}