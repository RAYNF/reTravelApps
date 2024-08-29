package com.example.submissionakhir.ui.model

import com.example.submissionakhir.R

data class Menu(
    val id: Long,
    val image: Int,
    val title: String,
    val location: String,
    val deskripsi: String
)

val dummyMenu = listOf(
    Menu(
        1,
        R.drawable.image_lokasi_bromo,
        "Gunung Bromo",
        "Jawa Timur",
        "Gunung Bromo atau dalam bahasa Tengger dieja Brama, juga disebut Kaldera Tengger, adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.614 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru."
    ),
    Menu(
        2,
        R.drawable.image_lokasi_everest,
        "Gunung Everest",
        "Eropa",
        "Gunung Everest (bahasa Inggris: Mount Everest) adalah gunung tertinggi kedua di dunia setelah Mauna Kea (jika diukur dari permukaan laut). Rabung puncaknya menandakan perbatasan antara Nepal dan Tibet; puncaknya berada di Tibet. Di Nepal, gunung ini disebut Sagarmatha (सगरमाथा, bahasa Sanskerta untuk Kepala Langit dan dalam bahasa Tibet Chomolangma atau Qomolangma Bunda Semesta, dilafalkan dalam bahasa Tionghoa 珠穆朗瑪峰 (pinyin: Zhūmùlǎngmǎ Fēng)."
    ),
    Menu(
        3,
        R.drawable.image_lokasi_view,
        "Bukit Panjangan",
        "Jawa Tengah",
        "Bukit adalah suatu bentuk wujud alam wilayah bentang alam yang memiliki permukaan tanah yang lebih tinggi dari permukaan tanah di sekelilingnya namun dengan ketinggian relatif rendah dibandingkan dengan gunung.[1] Perbukitan adalah rangkaian bukit yang berjajar di suatu daerah yang cukup luas."
    ),
    Menu(
        4,
        R.drawable.image_lokasi_sejarah,
        "Kuil Peninggalan",
        "Jepang",
        "Kuil (dari bahasa Tamil: koil) adalah bangunan yang disediakan untuk ritual dan kegiatan spiritual seperti doa dan pengorbanan. Agama yang mendirikan kuil termasuk Kekristenan (yang kuilnya biasanya disebut gereja), Hinduisme (disebut mandira), Buddhisme (disebut vihara), Sikhisme (yang kuilnya disebut gurudwara), Jainisme (yang kuilnya kadang disebut derasar), Islam (yang kuilnya disebut masjid), Yudaisme"
    ),
    Menu(
        5,
        R.drawable.image_lokasi_pantai, "Pantai Marina", "Jawa Tengah",
        "Pantai Marina (bahasa Jawa: ꦥꦱꦶꦱꦶꦂꦩꦫꦶꦤ, translit. Pasisir Marina) adalah salah satu objek wisata pantai yang berada di Kota Semarang, Jawa Tengah. Pantai ini menyimpan pemandangan eksotis khas Kota Semarang. Dahulu, tempat ini"
    ),
    Menu(
        6,
        R.drawable.image_lokasi_gunung,
        "Dieng",
        "Jawa Tengah",
        "Dataran tinggi Dieng atau Plato Dieng adalah sebuah wilayah di pusat Jawa Tengah yang memiliki ciri geologi, sejarah, dan pertanian yang dinilai khas.[oleh siapa?] Dataran ini berada di ketinggian antara 2000 hingga 2590 Meter di atas permukaan laut (MDPL) yang diapit oleh jajaran perbukitan di sisi utara dan selatannya, yang berasal dari aktivitas vulkanik yang sama dan disebut Pegunungan Dieng."
    ),
    Menu(
        7,
        R.drawable.image_lokasi_pantai,
        "Pantai",
        "Jawa",
        "Pesisir adalah daerah darat di tepi laut yang masih mendapat perngaruh laut seperti pasang surut, angin laut dan perembesan air laut. Sedangkan pantai adalah daerah di tepi perairan yan"
    ),
    Menu(8, R.drawable.image_lokasi_gunung, "D", "Jawah", "adalah sebuah huruf ke 4"),
)

val dummyBestSellerMenu = dummyMenu.shuffled()


