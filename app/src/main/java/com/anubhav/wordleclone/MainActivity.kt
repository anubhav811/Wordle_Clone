package com.anubhav.wordleclone

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.util.SparseArray
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.keyboard.*
import kotlinx.android.synthetic.main.keyboard.view.*


class MainActivity : AppCompatActivity() {

    val WORD = "TIGER"
    val keys: SparseArray<Any> = SparseArray()
    var currRow = 1;

    private var inputConnection: InputConnection? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (currRow == 1) {
            val ic: InputConnection = et_11.onCreateInputConnection(EditorInfo())
            keyboard.setInputConnection(ic)
            setEtChanger(et_11, et_12)
            setEtChanger(et_12, et_13)
            setEtChanger(et_13, et_14)
            setEtChanger(et_14, et_15)
            setEtChanger(et_15, et_21)
        }
    }


    private fun setEtChanger(et1: EditText, et2: EditText) {

        et1.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (et1.text.toString().length == 1) {
                    et2.requestFocus()
                    val ic: InputConnection = et2.onCreateInputConnection(EditorInfo())
                    keyboard.setInputConnection(ic)
                }
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable?) {}
        })
    }


    }


