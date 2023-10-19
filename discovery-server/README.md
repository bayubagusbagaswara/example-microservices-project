# Discovery Server

Ini ada hubungannya dengan Eureka

# Eureka

Eureka adalah komponen dari Spring Cloud Netflix yang digunakan untuk implementasi Service Discovery dalam arsitektur microservices.
Fungsi utama Eureka dalam Spring Boot adalah sebagai berikut:

1. `Service Registry (Registrasi Layanan)` : Eureka berfungsi sebagai layanan registri dimana setiap microservice dalam lingkungan berbasis microservices mendaftarkan dirinya sendiri. Microservices ini mendaftarkan informasi seperti nama, alamat IP, dan port ke Eureka. Hal ini memungkinkan microservice lainnya untuk menemukan dan berinteraksi dengan microservice yang terdaftar
2. `Service Discovery (Penemuan Layanan)`
3. `Load Balancing`
4. `Kemampuan Auto-Healing`
5. `Skalabilitas`
6. `Manajemen Metadata`

Eureka dalam komponen penting dalam implementasi arsitektur berbasis microservices dengan Spring Boot, karena memungkinkan sistem untuk
secara otomatis menemukan, berinteraksi dengan, dan mengelola service-service yang ada dalam lingkungan yang dinamis.


Service Registry (Registrasi Layanan): Eureka berfungsi sebagai layanan registri di mana setiap mikro layanan dalam lingkungan berbasis mikro mendaftarkan dirinya sendiri. Mikro layanan ini mendaftarkan informasi seperti nama, alamat IP, dan port ke Eureka. Hal ini memungkinkan mikro layanan lainnya untuk menemukan dan berinteraksi dengan mikro layanan yang terdaftar.

Service Discovery (Penemuan Layanan): Mikro layanan yang ingin berkomunikasi dengan layanan lain dapat menghubungi Eureka untuk menemukan alamat IP dan port dari layanan yang dituju. Ini memungkinkan layanan untuk berkomunikasi secara dinamis tanpa perlu mengetahui detail implementasi fisik dari layanan yang dituju.

Load Balancing: Eureka dapat digunakan untuk mengatur pembagian beban lalu lintas ke instance-instance yang terdaftar dari suatu layanan. Dengan ini, permintaan dari klien akan didistribusikan secara seimbang ke berbagai instance layanan yang tersedia, meningkatkan kinerja dan ketersediaan.

Kemampuan Auto-Healing: Eureka dapat memantau kesehatan (health) dari instance-instance layanan yang terdaftar. Jika suatu instance layanan mengalami masalah atau gagal, Eureka dapat menghapusnya dari daftar yang aktif sehingga permintaan klien tidak akan diarahkan ke instance yang bermasalah tersebut.

Skalabilitas: Eureka dirancang untuk mendukung skalabilitas. Anda dapat memiliki beberapa server Eureka yang berjalan secara bersamaan dalam lingkungan yang tinggi sehingga jika salah satu server Eureka mati, yang lain masih dapat menyediakan layanan registrasi dan penemuan.

Manajemen Metadata: Eureka juga memungkinkan Anda untuk menambahkan metadata tambahan ke instance layanan, yang dapat digunakan untuk tujuan manajemen dan dokumentasi.

Eureka adalah komponen penting dalam implementasi arsitektur berbasis mikroservices dengan Spring Boot karena memungkinkan sistem untuk secara otomatis menemukan, berinteraksi dengan, dan mengelola layanan-layanan yang ada dalam lingkungan yang dinami