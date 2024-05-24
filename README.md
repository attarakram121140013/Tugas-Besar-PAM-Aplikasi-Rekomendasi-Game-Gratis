<h1 align="center"> DAFTAR GAME GRATIS </h1>

<p align="justify"> Aplikasi Android ini menyediakan pengguna dengan akses mudah ke daftar game-game menarik yang dapat dimainkan secara gratis. Memanfaatkan layanan API FreeToGame, pengguna dapat dengan cepat menemukan berbagai judul game berkualitas tanpa biaya. Dengan antarmuka yang intuitif dan user-friendly, pengguna dapat menjelajahi daftar game, membaca deskripsi singkat, dan menemukan tautan langsung untuk mengunduh atau memainkan game secara online. Dengan aplikasi ini, pengguna dapat menikmati pengalaman bermain game yang menyenangkan tanpa harus khawatir tentang biaya. </p>


<h2 align="center">Anggota Proyek</h2>
<ul style="list-style-type:none; text-align:center; padding:0;">
  <li>
    <h4>Attar Akram Abdillah - 121140013 (pengembang proyek)</h4>
  </li>
   <li>
    <h4>Solafide Zamili - 121140201 (pengembang proyek)</h4>
  </li>
  <li>
    <h4>Nasrul Alfin Prassetyo - 121140001 (pengujian dan dokumentasi)</h4>
  </li>
  <li>
    <h4>Winnerson Laila - 121140121 (penguji dan dokumentasi)</h4>
  </li>
 
  <li>
    <h4>Muhammad Faried Halim - 121140197 (pengujian dan dokumentasi)</h4>
  </li>
</ul>

<h1 align="center">  BAB I : System Strukture </h1>
<p align="justify"> Tech Stack yang akan digunakan dalam aplikasi ini termasuk arsitektur MVVM untuk memisahkan antara model, tampilan, dan logika pemrosesan data. Aplikasi akan ditargetkan untuk SDK 34 dari Android. Basis data lokal akan dikelola menggunakan Room DB, sementara Retrofit akan digunakan untuk berkomunikasi dengan layanan API FreeToGame. Interceptor HTTP akan dipasang dengan Chucker untuk memantau dan mencatat panggilan API. Navigasi antar-fragmen akan dikelola menggunakan komponen Navigation, dan komponen Paging2 atau Paging3 akan digunakan untuk mengimplementasikan paginasi dalam daftar game.</p>		
<h2 align="center"> 1.1 Entity Relationship Diagram (ERD) </h2>
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/27e36a83-ba64-46dc-b575-e8731b3c2373" alt="ERD" width="600">
</p>

<h2 align="center"> 1.2 Sequence Diagram </h2>
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/74a9d9fc-992b-4138-99d8-c3d8bef2f9b3" alt="Sequence Diagram" width="600">
</p>

<h2 align="center"> 1.3 Class Diagram </h2>
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/57f861e7-1465-40f4-95bd-d7eba59bbf8b" alt="Class Diagram" width="600">
</p>

<h2 align="center"> 1.4 Desain </h2>
<p align="center">
  <a href="https://www.figma.com/file/YjxT3uiYV3rpXhAW8vc8Yn/Tugas-Besar-Pengembangan-Aplikasi-Mobile-R---03?type=design&mode=design&t=mwpzdenIHItqEs5O-0">Link ke Desain Figma</a>
</p>
<p align="center">Di dalam desain kami, kami memiliki beberapa layer:</p>
<div align="center">
  </div>
  <ol style="text-align: left;">
    <li>splashscreen</li>
    <li>sign in</li>
    <li>home</li>
    <li>profil</li>
    <li>favorit</li>
    <li>search</li>
    <li>detail game</li>
  </ol>

# Bab II: Penjelasan Fitur Aplikasi

## 1. Splashscreen
Splashscreen adalah layar pertama yang muncul saat aplikasi dijalankan. Biasanya digunakan untuk menampilkan logo atau pesan selamat datang sementara aplikasi memuat.
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/bf41d3a7-307e-4da4-9431-9a29129dd396" alt="Splashscreen Example">
</p>

## 2. Sign In
Fitur Sign In memungkinkan pengguna untuk masuk ke dalam aplikasi dengan menggunakan kredensial yang telah terdaftar, seperti email dan password atau metode autentikasi lainnya.
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/42d1b574-d42c-453f-9030-4a0782db9d4c" alt="Sign In Example">
</p>

## 3. Home
Home adalah layar utama aplikasi yang menampilkan konten utama atau informasi yang relevan bagi pengguna. Ini bisa berupa berita terbaru, tampilan game, atau konten yang disesuaikan.
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/3af84ccc-9b2d-435d-9fed-03ea047ce4cd" alt="Home Example">
</p>

## 4. Profil
Fitur Profil memungkinkan pengguna untuk melihat dan mengelola informasi pribadi mereka. Pengguna dapat mengubah foto profil, mengedit informasi kontak, atau mengatur preferensi pengguna.
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/063b0733-60ea-4aa7-a737-2a58151eca67" alt="Profil Example">
</p>

## 5. Favorit
Fitur Favorit memungkinkan pengguna untuk menandai atau menyimpan item yang mereka sukai atau ingin simpan untuk akses cepat di kemudian hari, seperti game favorit atau konten lainnya.
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/3bc87058-8f1a-47a9-ad77-084871cc74c2" alt="Favorite Example">
</p>

## 6. Search
Fitur Search memungkinkan pengguna untuk mencari konten dalam aplikasi, seperti game, pengguna lain, atau informasi lainnya berdasarkan kriteria tertentu.
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/6b93f6d7-91c7-484e-9cdd-ceb60631be5b" alt="Search Example">
</p>

## 7. Detail Game
Fitur Detail Game menyediakan informasi lengkap tentang suatu game, termasuk deskripsi, gambar, ulasan, dan informasi terkait lainnya. Pengguna dapat melihat detail ini sebelum memutuskan untuk memainkan atau membeli game tersebut.
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/8c699e69-da67-4cd6-901b-ba07227d5a25" alt="Detail Game Example">
</p>


 <h2>Bab III: Metode dan Penjelasan API</h2>

  <div class="method">
    <h3>Metode Waterfall</h3>
    <p>Kami menggunakan metode Waterfall dalam pengembangan aplikasi kami. Metode ini mengikuti alur kerja yang linear, dimulai dari perencanaan, analisis, desain, pengembangan, pengujian, hingga implementasi. Setiap tahap harus selesai sebelum memasuki tahap berikutnya.</p>
<p align="center">
  <img src="https://github.com/attarakram121140013/Tugas-Besar-PAM-Aplikasi-Rekomendasi-Game-Gratis/assets/96344530/446d368c-bb2e-4696-afa5-ad582c3a9a66" width="600" alt="Waterfall">
</p>


  </div>

  <div class="api">
    <h3>API yang Kami Gunakan</h3>
    <p>Berikut adalah API yang kami gunakan untuk aplikasi kami:</p>
    <ul>
      <li><a href="https://www.freetogame.com/api-doc">FreeToGame API</a>: API ini menyediakan data tentang game gratis.</li>
      <li><a href="https://apidocs.cheapshark.com/#a2620d3f-683e-0396-61e7-3fe4d30ea376">CheapShark API</a>: API ini memberikan informasi tentang penawaran game dan harga.</li>
    </ul>

<h2>Bab IV: Video Penggunaan Website</h2>

  <div align="center">
    <video width="800" controls>
      <source src="nama_video.mp4" type="video/mp4">
      Maaf, browser Anda tidak mendukung tag video.
    </video>


