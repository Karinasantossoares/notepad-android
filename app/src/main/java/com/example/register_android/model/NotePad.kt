package com.example.register_android.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class NotePad(
    val title:String,
    val description:String,
    val colorNote : String
):Parcelable
