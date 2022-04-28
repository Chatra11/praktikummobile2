package com.example.modul4.ui.hewanair

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modul4.R
import com.example.modul4.model.HewanAir

class HewanairViewModel : ViewModel() {
    var airMutableLiveData: MutableLiveData<ArrayList<HewanAir>?> = MutableLiveData()
    var airArrayList: ArrayList<HewanAir>? = null

    fun init(){
        airlist()
        airMutableLiveData.value = airArrayList
    }

    fun airlist(){
        //hair = hewan air
        var hair = HewanAir("Belut",R.drawable.belut)
        airArrayList = ArrayList()
        airArrayList!!.add(hair)
        hair = HewanAir("Hiu",R.drawable.hiu)
        airArrayList!!.add(hair)
        hair = HewanAir("Ikan Pari",R.drawable.ikanpari)
        airArrayList!!.add(hair)
        hair = HewanAir("Kraken",R.drawable.kraken)
        airArrayList!!.add(hair)
        hair = HewanAir("Krustasea",R.drawable.krustasea)
        airArrayList!!.add(hair)
        hair = HewanAir("Kuda Laut",R.drawable.kudalaut)
        airArrayList!!.add(hair)
        hair = HewanAir("Lumba-Lumba",R.drawable.lumba_lumba)
        airArrayList!!.add(hair)
        hair = HewanAir("Paus",R.drawable.paus)
        airArrayList!!.add(hair)
        hair = HewanAir("Ikan Salmon",R.drawable.salmon)
        airArrayList!!.add(hair)
        hair = HewanAir("Ubur-ubur",R.drawable.ubur_ubur)
        airArrayList!!.add(hair)
    }
    init {
        init()
    }
    fun airdata(hewanair: HewanAir,context: Context){
        airArrayList
    }

}