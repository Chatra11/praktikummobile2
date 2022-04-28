package com.example.modul4.ui.hewandarat

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modul4.R
import com.example.modul4.model.HewanDarat

class HewanDaratViewModel : ViewModel() {
    var daratMutableLiveData: MutableLiveData<ArrayList<HewanDarat>?> = MutableLiveData()
    var daratArrayList: ArrayList<HewanDarat>? = null

    fun init(){
        daratlist()
        daratMutableLiveData.value = daratArrayList
    }

    fun daratlist(){
        var hdarat = HewanDarat("Badak Jawa",R.drawable.badakjawa)
        daratArrayList = ArrayList()
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Beruang Kutub",R.drawable.beruangkutub)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Gajah",R.drawable.gajah)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Harimau Sumatra",R.drawable.harimausumatra)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Jerapah",R.drawable.jerapah)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Burung Maleo",R.drawable.maleo)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Burung Merak",R.drawable.merak)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Rusa Moose",R.drawable.mose)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Musang",R.drawable.musangcongok)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat("Singa",R.drawable.singa)
        daratArrayList!!.add(hdarat)
    }
    init {
        init()
    }
    fun daratdata(hewandarat: HewanDarat,context: Context){
        daratArrayList
    }

}
