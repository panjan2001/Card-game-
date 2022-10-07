package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class secondPlayerActivity : AppCompatActivity() {




    lateinit var textView :TextView
    lateinit var yesButton: Button
    lateinit var noButton : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_player)

//        DeckOfCards()
//        addDealerCard()
//
//
//        card1 = findViewById(R.id.cardView1)
//        dealerCard[0] = deckOfCards.getNewCard()
//        getValue(dealerCard[0])
//
//        card1.setImageResource(dealerCard[0].id)
//      val cards = intent.getIntExtra( "value" ,  21)


        yesButton = findViewById(R.id.yesButton)
        noButton = findViewById(R.id.noButton)
       yesButton.setOnClickListener {
  val intent = Intent(this , MainActivity:: class.java)
           startActivity(intent)}


            finish()
        noButton.setOnClickListener{
            finish()
        }
        }



    }



//fun getValue(v: Card) {
//        var r = 0
//        if (r in 0 until dealerCard.size) {
//            if (v == dealerCard[r])
//                value = dealerCard[r].imageValue
//        }
//
//    }
//
//    fun addDealerCard() {
//        val dealer1 = Card(R.id.secondPlayer4, 0)
//        dealerCard.add(dealer1)
//        dealerCard.add(Card(R.id.secondPlayer3, 0))
//        dealerCard.add(Card(R.id.secondPlayer2, 0))
//    }









