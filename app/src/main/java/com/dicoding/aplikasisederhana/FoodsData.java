package com.dicoding.aplikasisederhana;

import java.util.ArrayList;

class FoodsData {
    private static String[] foodsNames = {
            "Martabak",
            "Martabak Manis",
            "Putu Ayu",
            "Nagasari",
            "Cireng",
            "Onde Onde",
            "Rujak",
            "Sempol",
            "Pentol",
            "Klepon"
    };

    private static String[] foodsDeskripsi = {
            "Martabak adalah hidangan Indonesia yang terkenal, terutama sebagai jajanan malam. Ada dua jenis martabak, yaitu martabak manis dan martabak telur. Martabak manis biasanya berisi campuran gula, cokelat, kacang, dan keju, sementara martabak telur memiliki isian seperti telur, daging cincang, dan bawang.",
            "Martabak manis adalah versi manis dari martabak. Biasanya terbuat dari adonan berbahan dasar tepung terigu, telur, ragi, dan susu. Isian martabak manis bisa beragam, seperti cokelat, keju, kacang, atau selai.",
            "Putu ayu adalah kue tradisional Indonesia yang terbuat dari tepung beras, kelapa parut, gula merah, dan santan. Biasanya dibentuk bulat dengan warna putih dan diberi taburan kelapa parut di atasnya.",
            "Nagasari adalah kue tradisional Indonesia yang terbuat dari tepung beras, pisang, dan daun pisang. Kue ini biasanya dikukus dan memiliki rasa manis.",
            "Cireng adalah makanan ringan yang berasal dari Indonesia, terutama populer di Jawa Barat. Cireng terbuat dari campuran tepung tapioka dan bumbu rempah-rempah, kemudian digoreng hingga berwarna kecokelatan.",
            "Onde onde adalah jajanan pasar tradisional Indonesia yang terbuat dari tepung ketan yang diisi dengan pasta kacang hijau, kemudian digoreng dan dilapisi dengan wijen.",
            "Rujak adalah hidangan Indonesia yang terdiri dari potongan buah-buahan segar yang disajikan dengan saus rujak yang pedas dan manis. Rujak sering disantap sebagai makanan penutup atau camilan.",
            "Sempol adalah jajanan gorengan tradisional Indonesia yang terbuat dari adonan daging cincang yang dicampur dengan tepung terigu, bumbu, dan rempah-rempah, kemudian dibentuk bulat dan digoreng.",
            "Pentol adalah makanan jalanan Indonesia yang terdiri dari bulatan kecil adonan daging yang dimasak dengan cara digoreng atau direbus. Pentol sering disajikan dengan saus atau sambal sebagai pelengkap.",
            "Klepon adalah jajanan khas Indonesia yang terbuat dari tepung ketan yang diisi dengan gula merah cair, kemudian dibentuk bulat dan direbus, lalu digulingkan dalam kelapa parut. Klepon memiliki rasa manis dan aroma kelapa yang khas."
    };

    private static int[] foodsImages = {
            R.drawable.asin,
            R.drawable.martabak,
            R.drawable.putu,
            R.drawable.nogosari,
            R.drawable.cireng,
            R.drawable.onde,
            R.drawable.rujak,
            R.drawable.sempol,
            R.drawable.pentol,
            R.drawable.ijo
    };

    static ArrayList<Foods> getListData(){
        ArrayList<Foods> list = new ArrayList<>();
        for (int position = 0; position < foodsNames.length; position++) {
            Foods player = new Foods();
            player.setName(foodsNames[position]);
            player.setDeskripsi(foodsDeskripsi[position]);
            player.setPhoto(foodsImages[position]);
            list.add(player);
        }
        return list;
    }


}

