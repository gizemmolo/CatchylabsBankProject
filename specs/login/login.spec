Kullanici Girisi
=====================
Created by gizem.molo on 8.01.2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

TC_001: Gecerli Kullanici Adi ve Sifre ile Giris
----------------
Tags: login,positive
* Catchylabs login sayfasina gidilir
* "gizem.molo" kullanici adi ve "Gizemmolo1025." sifresi girilerek giris yapilir
* Basarili giris yapildigi kontrol edilir

TC_002: Gecersiz Kullanici Adi ve Sifre ile Giris
----------------
Tags: login,negative
* Catchylabs login sayfasina gidilir
* "gizem" kullanici adi ve "1234" sifresi girilerek giris yapilir
* Gecersiz giris uyari mesaji goruntulenir

TC_003: Sifre Eksik Olarak Giris Yapma
----------------------------
Tags: login,negative
* Catchylabs login sayfasina gidilir
* "gizem.molo" kullanici adi ve "" sifresi girilerek giris yapilir
* Gecersiz giris uyari mesaji goruntulenir

TC_004: Uygulamadan Cikis Yapma
-------------------
Tags: logout,positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Back butonuna tiklanir
* logout butonuna tiklanir
