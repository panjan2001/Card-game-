package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    lateinit var imageView1: ImageView
    lateinit var imageView2: ImageView
    lateinit var imageView3: ImageView
    lateinit var imageView4: ImageView
    lateinit var imageView5: ImageView
    lateinit var imageView6: ImageView
    lateinit var dealerCard1: ImageView
    lateinit var dealerCard2: ImageView
    lateinit var dealerCard3: ImageView
    lateinit var dealerCard4: ImageView
    lateinit var startButton: Button
    lateinit var dealerButton: Button
    lateinit var resultButton: Button
    lateinit var hitButton: Button
    lateinit var standButton: Button
    lateinit var newGame: Button
    val handCards = arrayListOf<Card>( )
    val dealerCards = arrayListOf<Card>()
    val deckOfCards = DeckOfCards()
    var value = 0
    var dealerValue = 0
    var totalValueDealer = 0
    var sumOfValue = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DeckOfCards()



        dealerCard1 = findViewById(R.id.secondPlayer1)
        dealerCard2 = findViewById(R.id.secondPlayer2)
        dealerCard3 = findViewById(R.id.secondPlayer3)
        dealerCard4 = findViewById(R.id.secondPlayer4)
        imageView1 = findViewById(R.id.cardView1)
        imageView2 = findViewById(R.id.cardView2)
        imageView3 = findViewById(R.id.cardView3)
        imageView4 = findViewById(R.id.cardView4)
        imageView5 = findViewById(R.id.cardView5)
        imageView6 = findViewById(R.id.cardView6)
        hitButton = findViewById(R.id.hitButton)
        startButton = findViewById(R.id.start)
        resultButton = findViewById(R.id.resultButton)
        dealerButton = findViewById(R.id.dealerResult)
        standButton = findViewById(R.id.stand)
        newGame = findViewById(R.id.newGame)



    startButton.setOnClickListener {


        dealFirstCards()
        sumOfValue = value

        resultTextView()
        value = 0


    }


        hitButton.setOnClickListener() {

            dealMoreCards()
            playerSumOfValue()
            sumOfValue += handCards[2].imageValue
            resultTextView()
    }



        standButton.setOnClickListener() {

            dealerCard2.visibility = View.VISIBLE
            if (sumOfValue <= 21) {

                if (totalValueDealer <= 16) {
                   dealerCards.add(deckOfCards.getNewCard())
                    dealerCard3.setImageResource(dealerCards[2].id)

                    getValue(dealerCards[2].imageValue)
                    dealerCard3.visibility = View.VISIBLE

                    if (totalValueDealer <= 16) {

                       dealerCards.add(deckOfCards.getNewCard())
                        dealerCard4.setImageResource(dealerCards[4].imageValue)
                        getValue(dealerCards[4].imageValue)
                        dealerCard4.visibility = View.VISIBLE
                    }
                }
                dealerTextView()
                comparingValue()
            } else comparingValue()


        }

        newGame.setOnClickListener() {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }


    fun comparingValue() {

        if (sumOfValue == 21) startButton.text = "You Win!"
        else if (totalValueDealer == 21) startButton.text = "Dealer Wins!"
        else if (sumOfValue < 21 && sumOfValue > totalValueDealer) startButton.text = "You Win!"
        else if (totalValueDealer < 21 && totalValueDealer > sumOfValue) startButton.text =
            "Dealer Wins!"
        else if (totalValueDealer == 21 && sumOfValue == 21) startButton.text = "Dealer Wins!"
        else if (sumOfValue == totalValueDealer) startButton.text = "Tie!"
        else if (sumOfValue > 21) startButton.text = "Dealer Wins!"
        else if (totalValueDealer > 21) startButton.text = "You Win!"

    }


    fun dealFirstCards() {

        handCards.add(deckOfCards.getNewCard())
        imageView1 .setImageResource(handCards[0].id)
        handCards.add(deckOfCards.getNewCard())
        imageView2.setImageResource(handCards[1].id)
        dealerCards.add(deckOfCards.getNewCard())
        dealerCard1.setImageResource(dealerCards[0].id)
        dealerCards.add(deckOfCards.getNewCard())
        dealerCard2.setImageResource(dealerCards[1].id)


        getValue(dealerCards[0].imageValue)
        dealerButton.text = dealerValue.toString()
        getValue(dealerCards[1].imageValue)

         playerSumOfValue ()


    }

    fun dealMoreCards() {
        addCard()
        getNewCard()


        handCards[2] = deckOfCards.getNewCard()

        imageView3.setImageResource(handCards[2].id)
        imageView3.visibility = View.VISIBLE
        imageView3 = imageView4
        imageView4 = imageView3
        imageView4 = imageView5
        imageView5 = imageView6
        if (imageView4.id == handCards[2].id )
            imageView4.visibility = View.VISIBLE
        if (imageView5.id == handCards[2].id){
            imageView5.visibility = View.VISIBLE}
        if (imageView6.id == handCards[2].id){
            imageView6.visibility = View.VISIBLE}

    }

    fun getValue(r: Int) {
        for (i in dealerCards) {

            if (r == i.imageValue)
                dealerValue = i.imageValue
        }
        totalValueDealer = totalValueDealer + dealerValue

    }


    fun dealerTextView() {

        dealerButton.text = totalValueDealer.toString()
    }


    fun playerSumOfValue(){

        for (card in 0 until handCards.size) {
            value +=  handCards[card].imageValue

            if (handCards[0].imageValue == 11 && handCards[1].imageValue == 11) {  handCards[0].imageValue = 11
                   handCards[1].imageValue = 10}

                if (value > 10 && handCards[handCards.size - 1].imageValue == 11){
                    handCards[handCards.size - 1].imageValue = 1}

        }
    }


    fun resultTextView() {
        resultButton.text = sumOfValue.toString()
        if (sumOfValue > 21) {
            resultButton.text = "You Lose!"

            if (resultButton.text == "You Lose!")
               startButton.text = "Dealer Wins!"
       }
    }

    fun getNewCard() {
        handCards[2] = deckOfCards.getNewCard()
    }

   fun addCard() {
       handCards.add(Card(R.id.secondPlayer4, 0))
   }

}




























