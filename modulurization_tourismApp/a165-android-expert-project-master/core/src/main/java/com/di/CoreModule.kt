package com.di

import androidx.room.Room
import com.data.TourismRepository
import com.data.source.local.LocalDataSource
import com.data.source.local.room.TourismDatabase
import com.data.source.remote.RemoteDataSource
import com.domain.repository.ITourismRepository
import com.utils.AppExecutors
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val databaseModule = module{
    factory { get<TourismDatabase>().tourismDao() }
    single {
        Room.databaseBuilder(androidContext(), TourismDatabase::class.java, "Tourism.db")
            .fallbackToDestructiveMigration().build()
    }
}

val networkModule = module {
    single {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build()
    }

    single {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://tourism-api.dicoding.dev/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
        retrofit.create(ApiService::class.java)
    }
}

val repositoryModule = module {
    single { com.data.source.local.LocalDataSource(get()) }
    single { RemoteDataSource(get()) }
    factory { AppExecutors() }
    single <ITourismRepository>{ com.data.TourismRepository(get(), get(), get()) }
}