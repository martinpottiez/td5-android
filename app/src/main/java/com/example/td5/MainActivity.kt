package com.example.td5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var contacts: MutableList<Contact> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvContacts: RecyclerView = findViewById(R.id.rvContacts)
        contacts.add(Contact("Jean", "Pierre"))
        contacts.add(Contact("Jeanne", "D'arc"))
        contacts.add(Contact("Pierre", "Menez"))
        contacts.add(Contact("Arthur", "Rimbaud"))
        contacts.add(Contact("Richard", "Coeur de Lion"))
        contacts.add(Contact("Zinedine", "Zidane"))
        contacts.add(Contact("Yannick", "Noah"))


        val adapter: ContactAdapter = ContactAdapter(contacts)
        rvContacts.adapter = adapter
        rvContacts.layoutManager = LinearLayoutManager(this)
    }
}