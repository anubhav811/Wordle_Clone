package com.anubhav.wordleclone

import android.content.Context
import android.text.TextUtils
import android.util.AttributeSet
import android.util.SparseArray
import android.view.View
import android.view.inputmethod.InputConnection
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.keyboard.view.*

class Keyboard(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
    LinearLayout(context, attrs, defStyleAttr), View.OnClickListener {
    val keys : SparseArray<Any> = SparseArray()
    private var inputConnection: InputConnection? = null


    private fun init(context: Context?, attrs: AttributeSet?) {
        button_q.setOnClickListener {
            keys.put(R.id.button_q,"Q")
        }
        button_w.setOnClickListener {
            keys.put(R.id.button_w,"W")
        }
        button_E.setOnClickListener {
            keys.put(R.id.button_E,"E")
        }
        button_r.setOnClickListener {
            keys.put(R.id.button_r,"R")
        }
        button_t.setOnClickListener {
            keys.put(R.id.button_t,"T")
        }
        button_y.setOnClickListener {
            keys.put(R.id.button_q,"Y")
        }
        button_u.setOnClickListener {
            keys.put(R.id.button_q,"U")
        }
        button_i.setOnClickListener {
            keys.put(R.id.button_q,"I")
        }
        button_o.setOnClickListener {
            keys.put(R.id.button_q,"O")
        }
        button_p.setOnClickListener {
            keys.put(R.id.button_q,"P")
        }
        button_a.setOnClickListener {
            keys.put(R.id.button_q,"A")
        }
        button_s.setOnClickListener {
            keys.put(R.id.button_q,"S")
        }
        button_d.setOnClickListener {
            keys.put(R.id.button_q,"D")
        }
        button_f.setOnClickListener {
            keys.put(R.id.button_f,"F")
        }
        button_g.setOnClickListener {
            keys.put(R.id.button_g,"G")
        }
        button_h.setOnClickListener {
            keys.put(R.id.button_q,"H")
        }
        button_j.setOnClickListener {
            keys.put(R.id.button_q,"J")
        }
        button_k.setOnClickListener {
            keys.put(R.id.button_q,"K")
        }
        button_l.setOnClickListener {
            keys.put(R.id.button_q,"L")
        }
        button_z.setOnClickListener {
            keys.put(R.id.button_q,"Z")
        }
        button_x.setOnClickListener {
            keys.put(R.id.button_q,"X")
        }
        button_c.setOnClickListener {
            keys.put(R.id.button_q,"C")
        }
        button_v.setOnClickListener {
            keys.put(R.id.button_q,"V")
        }
        button_b.setOnClickListener {
            keys.put(R.id.button_q,"B")
        }
        button_n.setOnClickListener {
            keys.put(R.id.button_q,"N")
        }
        button_m.setOnClickListener {
            keys.put(R.id.button_q,"M")
        }

    }


    override fun onClick(v: View?) {
        if (inputConnection == null) return
        if (v != null) {
            if (v.getId() === R.id.button_delete) {
                val selectedText = inputConnection!!.getSelectedText(0)
                if (TextUtils.isEmpty(selectedText)) {
                    inputConnection!!.deleteSurroundingText(1, 0)
                } else {
                    inputConnection!!.commitText("", 1)
                }
            } else {
                val value = keys[v.getId()]
                inputConnection!!.commitText(value as CharSequence?, 1)
            }
        }
    }
    fun setInputConnection(ic: InputConnection) {
        inputConnection = ic
    }

}





}