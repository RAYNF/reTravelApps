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
        R.drawable.image_waduk_jatibarang,
        "Waduk Jatibarang",
        "Semarang",
        "Waduk Jatibarang merupakan sebuah waduk yang terletak di Kecamatan Gunungpati, Kota Semarang. Pembangunan waduk ini selesai setelah sekitar empat tahun pembangunan dan memulai proses pengisian air pada tanggal 5 Mei 2014 bertepatan dengan Hari Air Dunia Ke-22 oleh Menteri Pekerjaan Umum, Djoko Kirmanto, bersama Gubernur Jawa Tengah, Ganjar Pranowo, dan Kepala Balai Besar Wilayah Sungai Pemali Juana, Imam Santoso."
    ),
    Menu(
        8,
        R.drawable.image_lokasi_gunung,
        "Bukit Paralayang",
        "Jogja",
        "Paralayang atau luncur layang (bahasa Inggris: paragliding) adalah olahraga terbang bebas dengan menggunakan sayap kain (parasut) yang lepas landas dengan kaki untuk tujuan rekreasi atau kompetisi. Induk organisasinya adalah PLGI (Persatuan Layang Gantung Indonesia), sedangkan PLGI sendiri di bawah naungan FASI (Federasi Aero Sport Indonesia)"
    ),
    Menu(
        9,
        R.drawable.image_kota_lama,
        "Kota Lama",
        "Semarang",
        "Kota Lama Semarang (bahasa Jawa: ꦑꦶꦛꦭꦩꦯꦼꦩꦫꦁ, translit. Kitha Lama Semarang, bahasa Belanda: Semarang Oude Stad) adalah suatu kawasan di Semarang yang menjadi pusat perdagangan pada abad 19–20 . Pada masa itu, untuk mengamankan warga dan wilayahnya, kawasan itu dibangun benteng, yang dinamai benteng Vijfhoek. Untuk mempercepat jalur perhubungan antar ketiga pintu gerbang di benteng itu maka dibuat jalan-jalan perhubungan, dengan jalan utamanya dinamai Heerenstraat. Saat ini bernama Jl. Letjen Soeprapto. Salah satu lokasi pintu benteng yang ada sampai saat ini adalah Jembatan Berok, yang disebut De Zuider Por. Kata 'Berok' sendiri merupakan hasil pelafalan masyarakat Pribumi yang kesulitan melafalkan kata 'Burg' dalam bahasa Belanda."
    ),

    Menu(
        10,
        R.drawable.image_sampokong,
        "Sampokonh",
        "Semarang",
        "Kelenteng Gedung Kuno Sam Poo Kong (Hanzi: 三保洞, Sānbǎo Dong) yang jika diterjemahkan menjadi Gua Tiga Perlindungan. Terminologi tiga perlindungan adalah doktrin umat Buddha, yang menyatakan berlindung pada Triratna (Sansekerta) atau Tiratana (Pali) yaitu Buddha, Dharma dan Sangha. Karakter “Pao” berdasarkan “Akun Zeng He” dalam Sejarah Dinasti Ming (明史) volume 304, adalah 保 “pao” yang berarti perlindungan,"
    ),
)

