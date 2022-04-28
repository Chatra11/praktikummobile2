package com.example.modul4.ui.hewanudara

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modul4.R
import com.example.modul4.model.HewanUdara

class HewanudaraViewModel : ViewModel() {
    var udaraMutableLiveData:MutableLiveData<ArrayList<HewanUdara>?> = MutableLiveData()
    var udaraArrayList: ArrayList<HewanUdara>? = null

    fun init(){
        udaralist()
        udaraMutableLiveData.value = udaraArrayList
    }
    fun udaralist(){
        var hudara = HewanUdara("Burung Bangau",R.drawable.bangau)
        udaraArrayList = ArrayList()
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("burung Beo",R.drawable.burung_beo)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("Burung Kolibri",R.drawable.burung_kolibri)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("burung Kutilang",R.drawable.burung_kutilang)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("Cendrawasih",R.drawable.cendrawasih)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("Elang Jawa",R.drawable.elangjawa)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("Kelelawar",R.drawable.kelelawar)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("Lalat",R.drawable.lalat)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("Lebah",R.drawable.lebah)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara("Burung Hantu",R.drawable.singapuar)
        udaraArrayList!!.add(hudara)
    }
    init {
        init()
    }
    fun udaradata(hewanUdara: HewanUdara,context: Context){
        udaraArrayList
    }
}