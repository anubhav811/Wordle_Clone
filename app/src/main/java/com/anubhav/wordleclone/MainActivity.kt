package com.anubhav.wordleclone

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.SparseArray
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.keyboard.*
import kotlinx.android.synthetic.main.keyboard.view.*


class MainActivity : AppCompatActivity() {

    val WORD = "TIGER"
    val keys: SparseArray<Any> = SparseArray()
    var currRow = 1;
    val inputConnection = et_11.onCreateInputConnection(EditorInfo())
    val inputConnection2 = et_12.onCreateInputConnection(EditorInfo())
    val inputConnection3 = et_13.onCreateInputConnection(EditorInfo())
    val inputConnection4 = et_14.onCreateInputConnection(EditorInfo())
    val inputConnection5 = et_15.onCreateInputConnection(EditorInfo())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wordET1: ArrayList<EditText> = ArrayList()
        wordET1.add(et_11)
        wordET1.add(et_12)
        wordET1.add(et_13)
        wordET1.add(et_14)
        wordET1.add(et_15)

        var ics : ArrayList<InputConnection> = ArrayList()
        ics.add(inputConnection)
        ics.add(inputConnection2)
        ics.add(inputConnection3)
        ics.add(inputConnection4)
        ics.add(inputConnection5)

        et_11.requestFocus()

        et_11.addTextChangedListener(GenericTextWatcher(et_11, et_12,keyboard,ics[1]))
        et_12.addTextChangedListener(GenericTextWatcher(et_12, et_13,keyboard,ics[2]))
        et_13.addTextChangedListener(GenericTextWatcher(et_13, et_14,keyboard,ics[3]))
        et_14.addTextChangedListener(GenericTextWatcher(et_14, et_15,keyboard,ics[4]))
        et_15.addTextChangedListener(GenericTextWatcher(et_15, null,keyboard,ics[5]))

        et_11.setOnKeyListener(GenericKeyEvent(et_11, null))
        et_12.setOnKeyListener(GenericKeyEvent(et_12, et_11))
        et_13.setOnKeyListener(GenericKeyEvent(et_13, et_12))
        et_14.setOnKeyListener(GenericKeyEvent(et_14,et_13))
        et_15.setOnKeyListener(GenericKeyEvent(et_15,et_14))
    }

    class GenericKeyEvent internal constructor(private val currentView: EditText, private val previousView: EditText?) : View.OnKeyListener {
        override fun onKey(p0: View?, keyCode: Int, event: KeyEvent?): Boolean {
            if (event!!.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_DEL && currentView.id != R.id.et_11 && currentView.text.isEmpty()) {
                previousView!!.text = null
                previousView.requestFocus()

                return true
            }
            return false
        }
    }

    class GenericTextWatcher internal constructor(private val currentView: View, private val nextView: View?,private var keyboard: MyKeyboard ,private val ic: InputConnection) : TextWatcher {
        override fun afterTextChanged(editable: Editable) { // TODO Auto-generated method stub
            val text = editable.toString()
            when (currentView.id) {
                R.id.et_11 -> if (text.length == 1) {
                    nextView!!.requestFocus()
                    keyboard.setInputConnection(ic)
                }
                R.id.et_12 -> if (text.length == 1) {
                    nextView!!.requestFocus()
                }
                R.id.et_13 -> if (text.length == 1) {
                    nextView!!.requestFocus()
                }
                R.id.et_14 -> if (text.length == 1) {
                    nextView!!.requestFocus()
                }
                //You can use EditText4 same as above to hide the keyboard
            }
        }

        override fun beforeTextChanged(
            arg0: CharSequence,
            arg1: Int,
            arg2: Int,
            arg3: Int
        ) { // TODO Auto-generated method stub
        }

        override fun onTextChanged(
            arg0: CharSequence,
            arg1: Int,
            arg2: Int,
            arg3: Int
        ) { // TODO Auto-generated method stub
        }

    }



}





