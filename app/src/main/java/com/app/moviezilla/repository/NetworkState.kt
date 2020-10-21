package com.app.moviezilla.repository


enum class Status {
    RUNNING,
    SUCCESS,
    FAILED
}

class NetworkState(val status: Status,val msg: String) {

    companion object {
        val LOADED: NetworkState
        val LOADING: NetworkState
        val EROR :NetworkState
    }

}
