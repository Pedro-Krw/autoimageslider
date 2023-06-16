package com.pacepdro.imageslider.model

import com.pacepdro.imageslider.R


data class ImageData(

    val title :String,
    val rating : Float,
    val desc :String,
    val imgUri:Int
)

/**
 * create Kids List
 * */

val imageList = listOf(
    ImageData(
        "Yesaya 40:31",
        4.0f,
        "orang-orang yang menanti-nantikan TUHAN mendapat kekuatan baru: mereka seumpama rajawali yang naik terbang dengan kekuatan sayapnya; mereka berlari dan tidak menjadi lesu, mereka berjalan dan tidak menjadi lelah.",
        R.drawable.asatu
    ),
    ImageData(
        "Roma 8:28",
        4.0f,
        "Kita tahu sekarang, bahwa Allah turut bekerja dalam segala sesuatu untuk mendatangkan kebaikan bagi mereka yang mengasihi Dia, yaitu bagi mereka yang terpanggil sesuai dengan rencana Allah.",
        R.drawable.adua
    ),
    ImageData(
        "Yeremia 29:11",
        4.0f,
        "Sebab Aku ini mengetahui rancangan-rancangan apa yang ada pada-Ku mengenai kamu, demikianlah firman TUHAN, yaitu rancangan damai sejahtera dan bukan rancangan kecelakaan, untuk memberikan kepadamu hari depan yang penuh harapan.",
        R.drawable.atiga
    ),
    ImageData(
        "Filipi 4:13",
        4.0f,
        "Segala perkara dapat kutanggung di dalam Dia yang memberi kekuatan kepadaku",
        R.drawable.aempat
    ),
    ImageData(
        "Yosua 1:9",
        4.0f,
        "Bukankah telah Kuperintahkan kepadamu: kuatkan dan teguhkanlah hatimu? Janganlah kecut dan tawar hati, sebab TUHAN, Allahmu, menyertai engkau, ke mana pun engkau pergi.”",
        R.drawable.alima
    ),
    ImageData(
        "Filipi 4:6",
        4.0f,
        "Janganlah hendaknya kamu kuatir tentang apapun juga, tetapi nyatakanlah dalam segala hal keinginanmu kepada Allah dalam doa dan permohonan dengan ucapan syukur.",
        R.drawable.aenam
    )

)