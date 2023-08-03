package com.example.recyclerview

class LocationProvider {
    companion object {
        val locationsList = listOf<Locations>(
            Locations("El Cantaro", "08:00", "21:00", "Av. Paraguay Casi Mcal. Lopez 343"),
            Locations("Bacon Burgers", "11:00", "00:00", "Paseo la Galeria"),
            Locations("Pizza Hut", "11:00", "23:00", "Av. España Casi Gral. Santos"),
            Locations("Bar San Miguel", "08:00", "00:00", "Av. España"),
            Locations("Mc. Donald's", "10:00", "22:00", "Av. Aviadores del Chaco"),
            Locations("Burger King", "10:00", "22:00", "Av. Transchaco"),
        )
    }
}