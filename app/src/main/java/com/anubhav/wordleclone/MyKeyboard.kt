package com.anubhav.wordleclone

import android.content.Context
import android.text.TextUtils
import android.util.AttributeSet
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputConnection
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.keyboard.view.*

class MyKeyboard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) :
    LinearLayout(context, attrs, defStyleAttr) , View.OnClickListener {
    val keys : SparseArray<Any> = SparseArray()
    private var inputConnection: InputConnection? = null

    private fun init(context: Context, attrs: AttributeSet?) {
     LayoutInflater.from(context).inflate(R.layout.keyboard, this, true);

        button_q.setOnClickListener(this)
        button_w.setOnClickListener(this)
        button_e.setOnClickListener(this)
        button_r.setOnClickListener(this)
        button_t.setOnClickListener(this)
        button_y.setOnClickListener(this)
        button_u.setOnClickListener(this)
        button_i.setOnClickListener(this)
        button_o.setOnClickListener(this)
        button_p.setOnClickListener(this)
        button_a.setOnClickListener(this)
        button_s.setOnClickListener(this)
        button_d.setOnClickListener(this)
        button_f.setOnClickListener(this)
        button_g.setOnClickListener(this)
        button_h.setOnClickListener(this)
        button_j.setOnClickListener(this)
        button_k.setOnClickListener(this)
        button_l.setOnClickListener(this)
        button_z.setOnClickListener(this)
        button_x.setOnClickListener(this)
        button_c.setOnClickListener(this)
        button_v.setOnClickListener(this)
        button_b.setOnClickListener(this)
        button_n.setOnClickListener(this)
        button_m.setOnClickListener(this)

        button_enter.setOnClickListener(this)

        keys.put(R.id.button_q,"Q")
        keys.put(R.id.button_w,"W")
        keys.put(R.id.button_e,"E")
        keys.put(R.id.button_r,"R")
        keys.put(R.id.button_t,"T")
        keys.put(R.id.button_y,"Y")
        keys.put(R.id.button_u,"U")
        keys.put(R.id.button_i,"I")
        keys.put(R.id.button_o,"O")
        keys.put(R.id.button_p,"P")
        keys.put(R.id.button_a,"A")
        keys.put(R.id.button_s,"S")
        keys.put(R.id.button_d,"D")
        keys.put(R.id.button_f,"F")
        keys.put(R.id.button_g,"G")
        keys.put(R.id.button_h,"H")
        keys.put(R.id.button_j,"J")
        keys.put(R.id.button_k,"K")
        keys.put(R.id.button_l,"L")
        keys.put(R.id.button_z,"Z")
        keys.put(R.id.button_x,"X")
        keys.put(R.id.button_c,"C")
        keys.put(R.id.button_v,"V")
        keys.put(R.id.button_b,"B")
        keys.put(R.id.button_n,"N")
        keys.put(R.id.button_m,"M")
    }


override fun onClick(view: View) {
        val value = keys[view.id]
        inputConnection!!.commitText(value as CharSequence?, 1)
}

fun setInputConnection(ic: InputConnection?) {
    inputConnection = ic
}

init {
    init(context, attrs)
}
}






