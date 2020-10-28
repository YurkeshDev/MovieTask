package com.app.moviezilla.user_interface.single_movie_details

import androidx.lifecycle.LiveData
import com.app.moviezilla.api.MovieDBInterface
import com.app.moviezilla.repository.MovieDetailsNetworkDataSource
import com.app.moviezilla.repository.NetworkState
import com.app.moviezilla.valueObject.MovieDetails
import io.reactivex.disposables.CompositeDisposable

class MovieDetailsRepo(private val apiService: MovieDBInterface) {

    lateinit var movieDetailsNetworkDataSource: MovieDetailsNetworkDataSource

    fun fetchSingleMovieDetails(
        compositeDisposable: CompositeDisposable,
        movieId: Int
    ): LiveData<MovieDetails> {

        movieDetailsNetworkDataSource =
            MovieDetailsNetworkDataSource(apiService, compositeDisposable)
        movieDetailsNetworkDataSource.fetchMovieDetails(movieId)

        return movieDetailsNetworkDataSource.downloadedMovieDetailsResponse

    }

    fun getMovieDetailsNetworkState(): LiveData<NetworkState> {
        return movieDetailsNetworkDataSource.networkState
    }


}