package com.example.td5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ContactAdapter(private val mContacts: MutableList<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

         var surnameTextView: TextView
         var nameTextView: TextView

         init {
             surnameTextView = itemView.findViewById(R.id.surname)
             nameTextView = itemView.findViewById(R.id.name)
         }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context: Context = parent.getContext()
        val inflater: LayoutInflater = LayoutInflater.from(context)

        val contactView: View = inflater.inflate(R.layout.item_contact, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact: Contact = mContacts[position]
        val nameTextView: TextView = holder.nameTextView
        val surnameTextView: TextView = holder.surnameTextView
        val contactImageView: ImageView = holder.itemView.findViewById(R.id.image)

        nameTextView.text = contact.name
        surnameTextView.text = contact.surname
        Glide.with(holder.itemView).load(contact.urlPhoto).into(contactImageView)

    }

    override fun getItemCount(): Int {
        return mContacts.size
    }
}