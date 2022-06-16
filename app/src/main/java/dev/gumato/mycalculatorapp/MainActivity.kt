package dev.gumato.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilnumber:TextInputLayout
    lateinit var etnumber:TextInputEditText
    lateinit var tilnumber2:TextInputLayout
    lateinit var etnumber2:TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract:Button
    lateinit var btnDivide: Button
    lateinit var btnModulus:Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvResult=findViewById(R.id.tvResult)
        tilnumber=findViewById(R.id.tilnumber)
        etnumber=findViewById(R.id.etnumber)
        tilnumber2= findViewById(R.id.tilnumber2)
        etnumber2= findViewById(R.id.etnumber2)
        btnModulus= findViewById(R.id.btnModulus)
        btnDivide= findViewById(R.id.btnDivide)
        btnSubtract= findViewById(R.id.btnSubtract)
        btnAdd= findViewById(R.id.btnAdd)

   btnAdd.setOnClickListener {
    var addition = etnumber.text.toString().toInt()
    var addition2 = etnumber2.text.toString().toInt()
    answer(addition,addition2)
}
   btnSubtract.setOnClickListener {
    var minus = etnumber.text.toString().toInt()
    var minus2=etnumber2.text.toString().toInt()
     result(minus,minus2)
}
btnDivide.setOnClickListener {
    var division =etnumber.text.toString().toInt()
    var division2 = etnumber2.text.toString().toInt()
    output(division, division2)
}
btnModulus.setOnClickListener {
    var reminder =etnumber.text.toString().toInt()
    var reminder2 =etnumber2.text.toString().toInt()
    solution(reminder,reminder2)
}
}
fun answer(add:Int,add2:Int){
    var sum = add
    var sum2 = add2 + sum
    tvResult.text = sum2.toString()
}
fun result(minus:Int,minus2:Int){
    var subtract =minus
    var subtract2=subtract-minus2
    tvResult.text= subtract2.toString()
}
fun output(times:Int, times2:Int){
    var divide = times
    var divide2 = times2/ divide
    tvResult.text= divide2.toString()
}
fun solution(reminder:Int, reminder2:Int){
    var modulus = reminder
    var modulus2 = reminder2%modulus
    tvResult.text= modulus2.toString()
}
}

