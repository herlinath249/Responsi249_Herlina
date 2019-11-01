package id.co.bubui.responsi249.model

import id.co.bubui.responsi249.R

object DataProgram {
    private val programName = arrayOf(
        "Ruby",
        "Phyton",
        "Java Script",
        "PHP",
        "C",
        "Java",
        "Pascal",
        "HTML",
        "Delphi",
        "C++"
    )

    private val deskripsi = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Phyton is interpreted scripting and object-oriented programming language",
        "Javascript is an object-based scripting language",
        "PHP is an interpreted language, l.e., there is no need for compilation",
        "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer",
        "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer ",
        "Pascal adalah bahasa pemrograman yang pertama kali di buat oleh Profesor Niklaus Wirth",
        "HyperText Markup Language (HTML) adalah sebuah bahasa markup yang digunakan untuk membuat sebuah halaman web",
        "Delphi adalah sebuah IDE compiler untuk Bahasa pemrograman pascal dan perkembangan perangkat lunak yang digunakan untuk merancang suatu aplikasi",
        "C++ adalah bahasa pemrograman komputer yang di buat oleh Bjarne Stroustrup"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Phyton is interpreted scripting and object-oriented programming language",
        "Javascript is an object-based scripting language",
        "PHP is an interpreted language, l.e., there is no need for compilation",
        "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories.",
        "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam",
        "Pascal adalah bahasa pemrograman yang pertama kali di buat oleh Profesor Niklaus Wirth, seorang anggota International Federation of Information Processing (IFIP) pada tahun 1971",
        "HyperText Markup Language (HTML) adalah sebuah bahasa markup yang digunakan untuk membuat sebuah halaman web",
        "Delphi adalah sebuah IDE compiler untuk Bahasa pemrograman pascal dan perkembangan perangkat lunak yang digunakan untuk merancang suatu aplikasi",
        "C++ adalah bahasa pemrograman komputer yang di buat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bong Labs (Dennis Ritchie) pada awal tahun 1970-an"
    )

    private val gambarprogram = intArrayOf(
        R.drawable.ruby,
        R.drawable.phyton,
        R.drawable.javascript,
        R.drawable.php,
        R.drawable.c,
        R.drawable.java,
        R.drawable.pascal,
        R.drawable.html,
        R.drawable.delphi,
        R.drawable.cpp

    )

    val daftarProgram: ArrayList<Program>
        get() {
            val daftar = arrayListOf<Program>()
            for (position in programName.indices) {
                val program = Program()
                program.nama = programName[position]
                program.deskripsi = deskripsi[position]
                program.gambar = gambarprogram[position]
                program.detail= detail[position]
                daftar.add(program)
            }
            return daftar
        }
}