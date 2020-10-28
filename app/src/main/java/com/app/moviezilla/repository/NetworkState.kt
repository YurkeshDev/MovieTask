package com.app.moviezilla.repository


enum class Status { //enum class what this
    RUNNING,
    SUCCESS,
    FAILED
}

class NetworkState(val status: Status, val msg: String) {

    companion object {
        val LOADED: NetworkState
        val LOADING: NetworkState
        val ERROR: NetworkState
        val ENDOFLIST: NetworkState

        init {
            LOADED = NetworkState(Status.SUCCESS, "загружено!")
            LOADING = NetworkState(Status.RUNNING, "Загрузка...")
            ERROR = NetworkState(Status.FAILED, "Упс.... Что - то пошло не так ")
            ENDOFLIST = NetworkState(Status.FAILED, "Конец страницы")
        }
    }

}
