package com.trs88.kurolibrary.cache

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cache")
class Cache {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    var cacheKey: String = ""
    var data: ByteArray? = null
}