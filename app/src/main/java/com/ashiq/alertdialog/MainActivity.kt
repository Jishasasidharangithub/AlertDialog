package com.ashiq.alertdialog

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ashiq.alertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    private lateinit var builder : AlertDialog.Builder
    val button: Button? = binding?.button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        builder = AlertDialog.Builder(this)

        binding?.button?.setOnClickListener {
            builder.setTitle("Alert Dialog")
            builder.setMessage("This is an alert dialog")
            builder.setIcon(R.drawable.ic_alert)
            builder.setPositiveButton("Yes"){dialog, which ->
               finish()
            }
            builder.setNegativeButton("No"){dialog, which ->
                dialog.dismiss()
            }
            builder.setNeutralButton("Cancel"){dialog,which ->
                dialog.dismiss()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
            }

        }
    }
