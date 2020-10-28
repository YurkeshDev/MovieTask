package com.app.moviezilla.api

import com.app.moviezilla.valueObject.MovieDetails
import com.app.moviezilla.valueObject.MovieResponce
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieDBInterface {


    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponce>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>
}