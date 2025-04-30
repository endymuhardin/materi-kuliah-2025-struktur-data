# Materi Kuliah Struktur Data dan Algoritma #

1. Pengantar Struktur Data
2. Struktur Data Linier dan Non-Linier
3. Array dan Linked List
4. Stack dan Queue
5. Tree dan Graph


## Cara Setup SSH Key untuk di GitHub dengan Git Bash ##
1. Buka Git Bash
2. Ketikkan perintah berikut untuk membuat SSH key baru:
   ```bash
   ssh-keygen
   ```
3. Tekan Enter untuk menerima lokasi default untuk menyimpan kunci.
4. Masukkan passphrase jika diinginkan (atau tekan Enter untuk tidak menggunakan passphrase).
5. Setelah kunci dibuat, tambahkan kunci publik ke SSH agent dengan perintah berikut:
   ```bash
   eval $(ssh-agent -s)
   ssh-add ~/.ssh/id_rsa
   ```
6. Salin kunci publik ke clipboard dengan perintah berikut:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
7. Masuk ke akun GitHub Anda.
8. Pergi ke **Settings** > **SSH and GPG keys** > **New SSH key**.
9. Tempelkan kunci publik yang telah disalin ke dalam kolom "Key".
10. Beri nama untuk kunci tersebut dan klik **Add SSH key**.
11. Sekarang Anda dapat menggunakan SSH untuk mengakses repositori GitHub Anda.

