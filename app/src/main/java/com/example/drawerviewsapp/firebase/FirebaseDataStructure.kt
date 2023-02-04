package com.example.drawerviewsapp.firebase

class FirebaseDataStructure {

    data class UserData(
        val userId: Int? = null,
        val userName: String? = null,
        val userEmail: String? = null,
        val userPassword: String? = null,
        val userFirstName: String? = null,
        val userLastName: String? = null,
        val userPhotoLinkId: String? = null
    )

    data class CategoryData(
        val categoryId: Int? = null,
        val categoryName: String? = null,
        val categoryTitle: String? = null,
        val categoryImageLink: String? = null
    )

}