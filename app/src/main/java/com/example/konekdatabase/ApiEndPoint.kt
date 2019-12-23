package com.example.konekdatabase

class ApiEndPoint {
    companion object {
        //alamat IP didapatkan melalui cmd dengan mengetik ipconfig
        private val SERVER = "http://192.168.1.6/universitaskotlin/"
        val CREATE = SERVER+"create_fakultas.php"
        val READ = SERVER+"read_fakultas.php"
        val UPDATE = SERVER+"update_fakultas.php"
        val DELETE = SERVER+"delete_fakultas.php"
    }
}