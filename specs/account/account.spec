Hesap Islemi
=====================
Created by gizem.molo on 9.01.2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.


TC_005: My Account Sayfasi Goruntulenmesi ve Ogelerin Dogrulanmasi
----------------
Tags: account,moneyTransfer,positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Hesap bilgisi sayfasi ogelerinin dogru sekilde goruntulendigi kontrol edilir

TC_006: Gecerli Hesaba Başarili Para Transferi Islemi
----------------
Tags: account,moneyTransfer,positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Transfer Money butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Amount alanina tutar girilir ve girilen tutar kaydedilir
* Send butonuna tiklanir ve My accout sayfasinin goruntulendigi kontrol edilir
* Transactions alaninda gonderilen transfer tutari kontrol edilir


TC_007: Tutar Girilmeden Para Transferi Islemi
----------------
Tags: account,moneyTransfer,negative
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Transfer Money butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Send butonunun tiklanabilir olmadigi kontrol edilir

TC_008: Tutar Alanina Negatif Sayı Girilerek Para Transferi Islemi
-------------------
Tags: account,moneyTransfer,negative
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Transfer Money butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Amount alanina eksi tutar girilir ve girilen tutar kaydedilir
* Send butonunun tiklanabilir olmadigi kontrol edilir

TC_009: Kart ile Para Yatirma Isleminin Transactions Alaninda Kontrolu
------------------
Tags:account,moneyAdd,positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Add Money butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Kredi karti bilgileri girilir
* Add butonuna tiklanir ve My accout sayfasinin goruntulendigi kontrol edilir
* Transactions alaninda karta yatirilan tutar kontrol edilir


TC_010: Hesap Isminin Duzenlenmesi Islemi
---------------
Tags: account,edit,positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Edit Account butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Account name alanina hesap ismi girilir ve girilen isim kaydedilir
* Update butonuna tiklanir ve My account sayfasinin goruntulendigi kontrol edilir
* Duzenlenen account name kontrol edilir

TC_011: Hesapta Bulunan Bakiyeden Fazla Tutar Transfer Edilememesi Kontrolu
----------------
Tags: account,moneyTransfer,negative
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Transfer Money butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Amount alanina eksi tutar girilir ve girilen tutar kaydedilir
* Send butonunun tiklanabilir olmadigi kontrol edilir


