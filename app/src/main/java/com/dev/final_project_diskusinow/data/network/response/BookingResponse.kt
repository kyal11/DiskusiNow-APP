package com.dev.final_project_diskusinow.data.network.response

import com.google.gson.annotations.SerializedName

data class BookingResponse(

	@field:SerializedName("data")
	val data: DataBooking? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataBooking(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("room_id")
	val room_id: Int? = null,

	@field:SerializedName("room_name")
	val room_name: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("user_id")
	val user_id: Int? = null,

	@field:SerializedName("user_name")
	val user_name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("no_phone")
	val no_phone: String? = null,

	@field:SerializedName("time_booking")
	val time_booking: String? = null,

	@field:SerializedName("participant")
	val participant: Int? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)
