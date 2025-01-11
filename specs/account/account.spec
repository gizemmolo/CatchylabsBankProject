User Account
=====================
Created by gizem.molo on 9.01.2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.


TC_004: My Account Sayfasi Goruntulenmesi ve Ogelerin Dogrulanmasi
----------------
Tags: account, moneyTransfer, positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Hesap bilgisi sayfasi ogelerinin dogru sekilde goruntulendigi kontrol edilir



TC_005:Gecerli Hesaba Başarili Para Transferi Islemi
----------------
Tags: account, moneyTransfer, positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Transfer Money butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Amount alanina tutar girilir ve girilen tutar kaydedilir
* Send butonuna tiklanir ve My accout sayfasinin goruntulendigi kontrol edilir
* Transactions alaninda gonderilen transfer tutari kontrol edilir

//TC_006:Tutar Girilmeden Para Transferi Islemi
//----------------
//Tags: account, moneyTransfer, negative
//* Catchylabs sayfasina login olunur
//* Open Money Transfer butonuna tiklanir
//* Transfer Money butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
//* Sender account ve receiver account alanlarinin secili geldigi goruntulenir
//* Send butonunun tiklanabilir olmadigi kontrol edilir

TC_007:Hesaba Kart Ile Para Yatirma Islemi
------------------
Tags:account, moneyAdd,positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Add Money butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Kredi karti bilgileri girilir
* Add butonuna tiklanir ve My accout sayfasinin goruntulendigi kontrol edilir
* Transactions alaninda karta yatirilan tutar kontrol edilir



TC_008:Hesap Isminin Duzenlenmesi Islemi
---------------
Tags: account, edit, positive
* Catchylabs sayfasina login olunur
* Open Money Transfer butonuna tiklanir
* Edit Account butonuna tiklanir ve bilgilerin dogru listelendigi kontrol edilir
* Account name alanina hesap ismi girilir ve girilen isim kaydedilir
* Update butonuna tiklanir ve My account sayfasinin goruntulendigi kontrol edilir
* Duzenlenen account name kontrol edilir


