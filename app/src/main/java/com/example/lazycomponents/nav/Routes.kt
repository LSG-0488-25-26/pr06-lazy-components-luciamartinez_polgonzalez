package com.example.lazycomponents.nav

sealed class Routes(val route: String) {
    object Llista : Routes("lista")
    object Detalls : Routes("detalle/{id}") {
        fun createRoute(id: String) = "detalle/$id"
    }
}
