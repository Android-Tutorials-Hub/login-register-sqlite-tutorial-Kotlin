package com.androidtutorialshub.loginregisterkotlin.model

/**
 * Created by Lalit Vasan on 9/12/2016.
 */

// model class
data class User(val id: Int = -1, val name: String, val email: String, val password: String)