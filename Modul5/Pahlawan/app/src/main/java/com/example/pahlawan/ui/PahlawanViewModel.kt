package com.example.pahlawan.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pahlawan.network.Pahlawan
import com.example.pahlawan.network.PahlawanApi
import kotlinx.coroutines.launch

class PahlawanViewModel : ViewModel(){

    private val _pahlawan = MutableLiveData<List<Pahlawan>>()
    val pahlawan: LiveData<List<Pahlawan>> = _pahlawan

    private val _hero = MutableLiveData<Pahlawan>()
    val hero: LiveData<Pahlawan> = _hero

    init {
        getPahlawanData()
    }

    fun getPahlawanData() {
        viewModelScope.launch {
            try {
                _pahlawan.value = PahlawanApi.retrofitServiceApi.getData()
                Log.d("berhasil Tersambung",pahlawan.value.toString())
            }catch (e:Exception){
                _pahlawan.value = listOf(Pahlawan("gagal","gagal","gagal","gagal",1))
                Log.d("error",e.stackTraceToString())
            }
        }
    }
    fun onPahlawanClicked(pahlawan: Pahlawan){
        _hero.value = pahlawan
    }
}