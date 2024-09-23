package com.data

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : com.data.Resource<T>(data)
    class Loading<T>(data: T? = null) : com.data.Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : com.data.Resource<T>(data, message)
}
