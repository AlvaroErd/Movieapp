package com.moviedemoal.movieapp.data.local

import androidx.room.Database
import androidx.room.Room
import android.content.Context
import androidx.room.RoomDatabase
import com.moviedemoal.movieapp.data.model.MovieEntity


@Database(entities = [MovieEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun movieDao(): MovieDao

    companion object {

        private var INSTANCE: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                // Elvis operator, si INSTANCE no es nulo, devuelve INSTANCE, si es nulo, continua con lo siguiente, haz Room.data...etc
                context.applicationContext,
                AppDataBase::class.java,
                "movie_table"
            ).build()
            return INSTANCE!!
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }


}