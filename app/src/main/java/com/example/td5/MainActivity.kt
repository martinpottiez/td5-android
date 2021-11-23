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
        contacts.add(Contact("Jean-Pierre", "Pernault", "https://resize-public.ladmedia.fr/img/var/public/storage/images/news/jean-pierre-pernaut-quitte-le-jt-de-tf1-une-celebre-journaliste-a-refuse-le-poste-1663182/44061505-1-fre-FR/Jean-Pierre-Pernaut-quitte-le-JT-de-TF1-Une-celebre-journaliste-a-refuse-le-poste-!.jpg"))
        contacts.add(Contact("Jeanne", "D'arc", "https://www.troyeslachampagne.com/wp-content/uploads/2020/10/Jeanne-dArc-2.jpg"))
        contacts.add(Contact("Pierre", "Menez", "https://pbs.twimg.com/profile_images/597478658299842560/Pwy4MKBx_400x400.jpg"))
        contacts.add(Contact("Arthur", "Rimbaud", "https://upload.wikimedia.org/wikipedia/commons/1/1c/Rimbaud.PNG"))
        contacts.add(Contact("Richard", "Coeur de Lion", "https://static.wikia.nocookie.net/lemondededisney/images/e/e4/Robin-hood-1080p-disneyscreencaps.com-9546.jpg/revision/latest?cb=20180417212203&path-prefix=fr"))
        contacts.add(Contact("Zinedine", "Zidane", "https://www.programme-tv.net/imgre/fit/https.3A.2F.2Fprd2-tel-epg-img.2Es3-eu-west-1.2Eamazonaws.2Ecom.2FproviderPerson.2F91e3ca4e9de2a106.2Ejpeg/300x300/quality/80/zinedine-zidane.jpeg"))
        contacts.add(Contact("Yannick", "Noah", "https://mradio.fr/media/artiste/yannick-noah.jpg"))


        val adapter: ContactAdapter = ContactAdapter(contacts)
        rvContacts.adapter = adapter
        rvContacts.layoutManager = LinearLayoutManager(this)
    }
}