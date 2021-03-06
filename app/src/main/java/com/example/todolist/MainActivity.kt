package com.example.todolist

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd: Button = findViewById(R.id.btnAdd)
        val lv: ListView = findViewById(R.id.lv)
        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            mutableListOf()
        )
        lv.adapter = adapter
        btnAdd.setOnClickListener{
            val et = EditText(this)

            AlertDialog.Builder(this)
                .setTitle("項目の追加")
                .setView(et)
                .setPositiveButton("追加", null)
                .setNegativeButton("キャンセル",null)
                .show()
        }
    }
}