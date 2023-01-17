package com.example.calculator_new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator_new.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var operation:String? = null
    var valueA: String? = null
    var valueB:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var show = binding.textshow
        binding.reset.setOnClickListener(){
            show.text = ""
        }
        binding.intdot.setOnClickListener{
            show.text =show.text.toString()+"."
        }
        binding.int1.setOnClickListener{
            show.text=show.text.toString()+"1"
        }
        binding.int2.setOnClickListener{
            show.text=show.text.toString()+"2"
        }
        binding.int3.setOnClickListener{
            show.text=show.text.toString()+"3"
        }
        binding.int4.setOnClickListener{
            show.text=show.text.toString()+"4"
        }
        binding.int5.setOnClickListener{
            show.text=show.text.toString()+"5"
        }
        binding.int6.setOnClickListener{
            show.text=show.text.toString()+"6"
        }
        binding.int7.setOnClickListener{
            show.text=show.text.toString()+"7"
        }
        binding.int8.setOnClickListener{
            show.text=show.text.toString()+"8"
        }
        binding.int9.setOnClickListener{
            show.text=show.text.toString()+"9"
        }
        binding.int0.setOnClickListener{
            show.text=show.text.toString()+"0"
        }

        binding.clearL.setOnClickListener(){
            if(show.text.toString().isNotBlank()){
                show.text = show.text.substring(0,(show.text.length)-1)
            }
        }


        binding.devide.setOnClickListener(){
            operation = "/"
            if(show.text.contains("/")){
                val splitval = show.text.split("/")
                operation = "/"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble()  / valueB!!.toDouble() ).toString()
            }
            /////
            if(show.text.contains("*")){
                val splitval = show.text.split("*")
                operation = "*"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() * valueB!!.toDouble() ).toString()
            }
            if(show.text.contains("+")){
                val splitval = show.text.split("+")
                operation = "+"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble()  + valueB!!.toDouble() ).toString()
            }
            if(show.text.contains("-")){
                val splitval = show.text.split("-")
                operation = "-"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() - valueB!!.toDouble() ).toString()
            }
            //////
            show.text =show.text.toString()+"/"
        }
        binding.multiply.setOnClickListener(){
            operation = "*"
            if(show.text.contains("*")){
                val splitval = show.text.split("*")
                operation = "*"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() * valueB!!.toDouble() ).toString()
            }
            //////////
            if(show.text.contains("/")){
                val splitval = show.text.split("/")
                operation = "*"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() * valueB!!.toDouble() ).toString()
            }
            if(show.text.contains("+")){
                val splitval = show.text.split("+")
                operation = "+"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble()  + valueB!!.toDouble() ).toString()
            }
            if(show.text.contains("-")){
                val splitval = show.text.split("-")
                operation = "-"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() - valueB!!.toDouble() ).toString()
            }

            /////////
            show.text = show.text.toString()+"*"
        }
        binding.plus.setOnClickListener(){
            operation = "+"
            if(show.text.contains("+")){
                val splitval = show.text.split("+")
                operation = "+"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble()  + valueB!!.toDouble() ).toString()
            }
            //////////////
            if(show.text.contains("*")){
                val splitval = show.text.split("*")
                operation = "*"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() * valueB!!.toDouble() ).toString()
            }
            if(show.text.contains("/")){
                val splitval = show.text.split("/")
                operation = "+"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble()  + valueB!!.toDouble() ).toString()
            }
            if(show.text.contains("-")){
                val splitval = show.text.split("-")
                operation = "-"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() - valueB!!.toDouble() ).toString()
            }
            //////////////
            show.text =show.text.toString()+"+"
        }
        binding.minus.setOnClickListener(){
            operation = "-"
            if(show.text.contains("-")){
                val splitval = show.text.split("-")
                operation = "-"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() - valueB!!.toDouble() ).toString()
            }
            ////////////////
            if(show.text.contains("*")){
                val splitval = show.text.split("*")
                operation = "*"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() * valueB!!.toDouble() ).toString()
            }
            if(show.text.contains("+")){
                val splitval = show.text.split("+")
                operation = "+"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble()  + valueB!!.toDouble() ).toString()
            }
            if(show.text.contains("/")){
                val splitval = show.text.split("/")
                operation = "-"
                valueA = splitval[0]
                valueB = splitval[1]
                show.text = (valueA!!.toDouble() - valueB!!.toDouble() ).toString()
            }
            ///////////////
            show.text =show.text.toString()+"-"
        }
        binding.equals.setOnClickListener(){
            if(show.text.contains("-")){
                val splitval = show.text.split("-")
                operation = "-"
                valueA = splitval[0]
                valueB = splitval[1]
            }
            if(show.text.contains("+")){
                val splitval = show.text.split("+")
                operation = "+"
                valueA = splitval[0]
                valueB = splitval[1]
            }
            if(show.text.contains("/")){
                val splitval = show.text.split("/")
                operation = "/"
                valueA = splitval[0]
                valueB = splitval[1]
            }
            if(show.text.contains("*")){
                val splitval = show.text.split("*")
                operation = "*"
                valueA = splitval[0]
                valueB = splitval[1]
            }
            when(operation){
                "-"->{
                    show.text = (valueA!!.toDouble() - valueB!!.toDouble() ).toString()
                }
                "+"->{
                    show.text = (valueA!!.toDouble()  + valueB!!.toDouble() ).toString()
                }
                "/"->{
                    show.text = (valueA!!.toDouble()  / valueB!!.toDouble() ).toString()
                }
                "*"->{
                    show.text = (valueA!!.toDouble() * valueB!!.toDouble() ).toString()
                }
            }
        }
    }
}