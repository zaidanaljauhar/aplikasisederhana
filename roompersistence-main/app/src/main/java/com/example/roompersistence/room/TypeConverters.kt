package com.room_persistence.roompersistence.room

import androidx.room.TypeConverter
import java.sql.Timestamp

class Converters {

    @TypeConverter
    fun fromTimestamp(value: Long?): Timestamp? {
        return value?.let { Timestamp(it) }
    }

    @TypeConverter
    fun dateToTimestamp(timestamp: Timestamp?): Long? {
        return timestamp?.time
    }
}
