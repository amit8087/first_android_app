package com.osi.myandroidapp

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf<Hobby>(
        Hobby("Coding"),
        Hobby("Reading"),
        Hobby("Writing"),
        Hobby("Climbing"),
        Hobby("Reading Newspaper"),
        Hobby("Swimming"),
        Hobby("Dancing"),
        Hobby("Skating"),
        Hobby("Sports"),
        Hobby("Music"),
        Hobby("Mountaineering"),
        Hobby("Hiking"),
        Hobby("Swimming"),
        Hobby("Gaming"),
        Hobby("Programming"),
        Hobby("Yoga"),
        Hobby("Talking"),
        Hobby("Sleeping"),
    )
}