package com.myappname.historyapp
//Denver Mojapelo 
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var inputAge: EditText
    private lateinit var discardButton: Button

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        searchButton = findViewById(R.id.searchButton)
        discardButton = findViewById(R.id.discardButton)
        inputAge = findViewById(R.id.inputAge)
        resultTextView = findViewById(R.id.resultTextView)

        searchButton.setOnClickListener {
            val age = inputAge.text.toString().toIntOrNull()

            if (age != null && age in 15..100) {
                val userName = when (age) {
                    95 -> "Nelson Mandela famously known for his anti-apartheid activism which ultimately led to him becoming the first black President of South Africa."
                    15 -> "Anne Frank had hidden from the Nazis for 2 years in her father's business annex. She would end up at the Bergen-Belson concentration camp which tragically ended up being where she died."
                    40 -> "Wat Tyler was the leader of the peasant riots which took 14th-century England by surprise. He fought for peasant wage increases as they were dying out from the plague and had fewer hands in the workforce."
                    19 -> "Joan of Arc, born back in 1412, is still remembered as a sort of heroine. She was tried for witchcraft and burned at the stake."
                    20 -> "King Tut, a former Pharaoh of Egypt, who began his rule at the age of 9! He died from illness by the time he turned 20."
                    30 -> "Sylvia Plath was a poet best known for the novel 'The Bell Jar' and her poetry collections titled 'The Colossus' and 'Ariel'. She had started writing at the age of 8 and had numerous short stories published by the time she went to Smith College."
                    33 -> "Alexander The Great, known as one of the world's greatest military generals to this day, hence the name Alexander The Great."
                    41 -> "Amelia Earhart, the first woman to fly across the Atlantic. She was also a member of the National Women's Party and early supporter of the Equal Rights Amendment."
                    21 -> "Napoleon II, named as the successor of his father Napoleon Bonaparte, never ruled France but was viewed as a savior for rebuilding the empire his father had made."
                    36 -> "Princess Diana of Wales was a member of the British royal family. Mother to Prince Charles and Harry, she was loved by all for her compassion for others and regard for human life regardless of where they came from."
                    37 -> "Vincent van Gogh is often considered to be one of the greatest painters to ever live despite the fact he's only ever sold 1 painting; 'The Red Vineyard' near Arles."
                    else -> null
                }

                val message = if (userName != null) "The historic figure's name is $userName"
                else "No historic figure was found with the age inserted."
                resultTextView.text = message
            } else {
                resultTextView.text = "Invalid input. Please enter a valid age between 15 and 100"
            }
        }

        discardButton.setOnClickListener {
            inputAge.text.clear()
            resultTextView.text = ""
        }
    }
}




