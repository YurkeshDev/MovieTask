package com.app.moviezilla.repository

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.app.moviezilla.api.MovieDBInterface
import com.app.moviezilla.valueObject.Movie
import io.reactivex.disposables.CompositeDisposable

class MovieDataFactory(
    private val apiService: MovieDBInterface,
    private val compositeDisposable: CompositeDisposable
) : DataSource.Factory<Int, Movie>() {

    val moviesLiveDataSource = MutableLiveData<MovieDataSource>()

    override fun create(): DataSource<Int, Movie> {
        val movieDataSource = MovieDataSource(apiService, compositeDisposable)

        moviesLiveDataSource.postValue(movieDataSource)
        return movieDataSource
    }

}