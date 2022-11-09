package com.example.contextmenu_example

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity


private var Any.adapter: Unit
    get() = Unit
    set(value) =Unit

class MainActivity : AppCompatActivity() {
    private lateinit var listview: Any
    private val contact = arrayOf<String>("Ayushi","Yash","Rajan","Deversh","Arpit")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar: Toolbar =findViewById<View>(R.id.toolbar)as Toolbar
        setSupportActionBar(toolbar)

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contact)


    }

    private fun setSupportActionBar(toolbar: Toolbar) {
        TODO("Not yet implemented")
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item!!.itemId) {
            R.id.call ->{
                Toast.makeText(applicationContext, "call code", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.sms ->{
                Toast.makeText(applicationContext, "sms code", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}