package com.example.animalsbio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val catBio = "The cat (Felis catus) is a domestic species of small carnivorous mammal.[1][2] It is the only domesticated species in the family Felidae and is often referred to as the domestic cat to distinguish it from the wild members of the family.[4] A cat can either be a house cat, a farm cat or a feral cat; the latter ranges freely and avoids human contact.[5] Domestic cats are valued by humans for companionship and their ability to kill rodents. About 60 cat breeds are recognized by various cat registries"

        val parrotBio = "Parrots, also known as psittacines (/ˈsɪtəsaɪnz/),[1][2] are birds of the roughly 398 species[3] in 92 genera comprising the order Psittaciformes (/ˈsɪtəsɪfɔːrmiːz/), found mostly in tropical and subtropical regions. The order is subdivided into three superfamilies: the Psittacoidea (\"true\" parrots), the Cacatuoidea (cockatoos), and the Strigopoidea (New Zealand parrots). One-third of all parrot species are threatened by extinction, with higher aggregate extinction risk (IUCN Red List Index) than any other comparable bird group.[4] Parrots have a generally pantropical distribution with several species inhabiting temperate regions in the Southern Hemisphere, as well. The greatest diversity of parrots is in South America and Australasia."

        var received = this.intent.extras

        if(received != null)
        {

            when(received.get("animalKind"))
            {
                "cat" ->{
                    Toast.makeText(this, "cat clicked", Toast.LENGTH_LONG).show()
                    this.setTitle("Cat")
                    bioSelectedAnimal.text = catBio
                    imgSelectedAnimal.setImageResource(R.drawable.cat)

                }
                "parrot" -> {
                    Toast.makeText(this, "parrot clicked", Toast.LENGTH_LONG).show()
                    this.setTitle("Parrot")
                    bioSelectedAnimal.text = parrotBio
                    imgSelectedAnimal.setImageResource(R.drawable.parrot)

                }
            }
        }
    }
}