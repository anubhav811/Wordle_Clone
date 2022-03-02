package com.anubhav.wordleclone

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.keyboard.*
import java.util.*
import java.util.Arrays.asList
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    var currRow = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ic11 = et_11.onCreateInputConnection(EditorInfo())
        val ic12 = et_12.onCreateInputConnection(EditorInfo())
        val ic13 = et_13.onCreateInputConnection(EditorInfo())
        val ic14 = et_14.onCreateInputConnection(EditorInfo())
        val ic15 = et_15.onCreateInputConnection(EditorInfo())

        val ic21 = et_21.onCreateInputConnection(EditorInfo())
        val ic22 = et_22.onCreateInputConnection(EditorInfo())
        val ic23 = et_23.onCreateInputConnection(EditorInfo())
        val ic24 = et_24.onCreateInputConnection(EditorInfo())
        val ic25 = et_25.onCreateInputConnection(EditorInfo())

        val ic31 = et_31.onCreateInputConnection(EditorInfo())
        val ic32 = et_32.onCreateInputConnection(EditorInfo())
        val ic33 = et_33.onCreateInputConnection(EditorInfo())
        val ic34 = et_34.onCreateInputConnection(EditorInfo())
        val ic35 = et_35.onCreateInputConnection(EditorInfo())

        val ic41 = et_41.onCreateInputConnection(EditorInfo())
        val ic42 = et_42.onCreateInputConnection(EditorInfo())
        val ic43 = et_43.onCreateInputConnection(EditorInfo())
        val ic44 = et_44.onCreateInputConnection(EditorInfo())
        val ic45 = et_45.onCreateInputConnection(EditorInfo())

        val ic51 = et_51.onCreateInputConnection(EditorInfo())
        val ic52 = et_52.onCreateInputConnection(EditorInfo())
        val ic53 = et_53.onCreateInputConnection(EditorInfo())
        val ic54 = et_54.onCreateInputConnection(EditorInfo())
        val ic55 = et_55.onCreateInputConnection(EditorInfo())

        val ic61 = et_61.onCreateInputConnection(EditorInfo())
        val ic62 = et_62.onCreateInputConnection(EditorInfo())
        val ic63 = et_63.onCreateInputConnection(EditorInfo())
        val ic64 = et_64.onCreateInputConnection(EditorInfo())
        val ic65 = et_65.onCreateInputConnection(EditorInfo())

        val wordET1: ArrayList<EditText> = ArrayList(listOf(et_11, et_12, et_13, et_14, et_15))
        val wordET2: ArrayList<EditText> = ArrayList(listOf(et_21, et_22, et_23, et_24, et_25))
        val wordET3: ArrayList<EditText> = ArrayList(listOf(et_31, et_32, et_33, et_34, et_35))
        val wordET4: ArrayList<EditText> = ArrayList(listOf(et_41, et_42, et_43, et_44, et_45))
        val wordET5: ArrayList<EditText> = ArrayList(listOf(et_51, et_52, et_53, et_54, et_55))
        val wordET6: ArrayList<EditText> = ArrayList(listOf(et_61, et_62, et_63, et_64, et_65))


        val ics1: ArrayList<InputConnection> = ArrayList(listOf(ic11, ic12, ic13, ic14, ic15))
        val ics2: ArrayList<InputConnection> = ArrayList(listOf(ic21, ic22, ic23, ic24, ic25))
        val ics3: ArrayList<InputConnection> = ArrayList(listOf(ic31, ic32, ic33, ic34, ic35))
        val ics4: ArrayList<InputConnection> = ArrayList(listOf(ic41, ic42, ic43, ic44, ic45))
        val ics5: ArrayList<InputConnection> = ArrayList(listOf(ic51, ic52, ic53, ic54, ic55))
        val ics6: ArrayList<InputConnection> = ArrayList(listOf(ic61, ic62, ic63, ic64, ic65))

        if (currRow == 1) {
            setupEts(wordET1, ics1)
            setupBackSpace(button_delete, wordET1)
        }
    }

    private fun setupEts(wordEt: ArrayList<EditText>, ics: ArrayList<InputConnection>) {
        wordEt[0].requestFocus()
        keyboard.setInputConnection(ics[0])

        wordEt[0].addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (wordEt[0].length() == 1 && wordEt[0].isFocused) {
                    wordEt[1].requestFocus()
                    keyboard.setInputConnection(ics[1])
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }


        })
        wordEt[1].addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (wordEt[1].length() == 1 && wordEt[1].isFocused) {
                    wordEt[2].requestFocus()
                    keyboard.setInputConnection(ics[2])
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
        wordEt[2].addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (wordEt[2].length() == 1 && wordEt[2].isFocused) {
                    wordEt[3].requestFocus()
                    keyboard.setInputConnection(ics[3])
                }

            }

            override fun afterTextChanged(s: Editable?) {
            }


        })
        wordEt[3].addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (wordEt[3].length() == 1 && wordEt[3].isFocused) {
                    wordEt[4].requestFocus()
                    keyboard.setInputConnection(ics[4])
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
    }

    private fun setupBackSpace(button: ImageButton, wordEt: ArrayList<EditText>) {
        button.setOnClickListener {
            if (wordEt[0].isFocused) {
                if (wordEt[0].text.length == 1) {
                    wordEt[0].text = null
                }
            }
            if (wordEt[1].isFocused) {
                if (wordEt[1].text.length == 1) {
                    wordEt[1].text = null
                } else {
                    wordEt[0].requestFocus()
                    wordEt[0].text = null
                }
            }
            if (wordEt[2].isFocused) {
                if (wordEt[2].text.length == 1) {
                    wordEt[2].text = null
                } else {
                    wordEt[1].requestFocus()
                    wordEt[1].text = null
                }
            }
            if (wordEt[3].isFocused) {
                if (wordEt[3].text.length == 1) {
                    wordEt[3].text = null
                } else {
                    wordEt[2].requestFocus()
                    wordEt[2].text = null
                }
            }
            if (wordEt[4].isFocused) {
                if (wordEt[4].text.length == 1) {
                    wordEt[4].text = null
                } else {
                    wordEt[3].requestFocus()
                    wordEt[3].text = null
                }
            }
        }
    }

}









