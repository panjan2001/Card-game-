package com.example.project

import androidx.lifecycle.viewmodel.CreationExtras

class DeckOfCards () {



    val deckOfCards = mutableListOf<Card>()

    init {
        createCard()

    }

    fun createCard() {
        val card2 = Card(R.drawable.clubs2, 2)
        val card3 = Card(R.drawable.clubs3, 3)
        val card4 = Card(R.drawable.clubs4, 4)
        val card5 = Card(R.drawable.clubs5, 5)
        val card6 = Card(R.drawable.clubs6, 6)
        val card7 = Card(R.drawable.clubs7, 7)
        val card8 = Card(R.drawable.clubs8, 8)
        val card9 = Card(R.drawable.clubs9, 9)
        val card10 = Card(R.drawable.clubs10, 10)
        val card11 = Card(R.drawable.clubs11, 11)
        val card12 = Card(R.drawable.clubs12, 10)
        val card13 = Card(R.drawable.clubs13, 10)
        val card14 = Card(R.drawable.clubs14, 10)
        val card15 = Card(R.drawable.hearts2, 2)
        val card16 = Card(R.drawable.hearts3, 3)
        val card17 = Card(R.drawable.hearts4, 4)
        val card18 = Card(R.drawable.hearts5, 5)
        val card19 = Card(R.drawable.hearts6, 6)
        val card20 = Card(R.drawable.hearts7, 7)
        val card21 = Card(R.drawable.hearts8, 8)
        val card22 = Card(R.drawable.hearts9, 9)
        val card23 = Card(R.drawable.hearts10, 10)
        val card24 = Card(R.drawable.hearts11, 11)
        val card25 = Card(R.drawable.hearts12, 10)
        val card26 = Card(R.drawable.hearts13, 10)
        val card27 = Card(R.drawable.hearts14, 10)
        val card28 = Card(R.drawable.diamonds2, 2)
        val card29 = Card(R.drawable.diamonds3, 3)
        val card30 = Card(R.drawable.diamonds4, 4)
        val card31 = Card(R.drawable.diamonds5, 5)
        val card32 = Card(R.drawable.diamonds6, 6)
        val card33 = Card(R.drawable.diamonds7, 7)
        val card34 = Card(R.drawable.diamonds8, 8)
        val card35 = Card(R.drawable.diamonds9, 9)
        val card36 = Card(R.drawable.diamonds10, 10)
        val card37 = Card(R.drawable.diamonds11, 11)
        val card38 = Card(R.drawable.diamonds12, 10)
        val card39 = Card(R.drawable.diamonds13, 10)
        val card40 = Card(R.drawable.diamonds14, 10)
        val card41 = Card(R.drawable.spades2, 2)
        val card42 = Card(R.drawable.spades3, 3)
        val card43 = Card(R.drawable.spades4, 4)
        val card44 = Card(R.drawable.spades5, 5)
        val card45 = Card(R.drawable.spades6, 6)
        val card46 = Card(R.drawable.spades7, 7)
        val card47 = Card(R.drawable.spades8, 8)
        val card48 = Card(R.drawable.spades9, 9)
        val card49 = Card(R.drawable.spades10, 10)
        val card50 = Card(R.drawable.spades11, 11)
        val card51 = Card(R.drawable.spades12, 10)
        val card52 = Card(R.drawable.spades13, 10)
        val card53 = Card(R.drawable.spades14, 10)

         val card56 = Card(R.id.cardView2, 0)
         val card57 = Card(R.id.cardView3, 0)
        val card58 = Card(R.id.cardView4, 0)


        deckOfCards.add(card2)
        deckOfCards.add(card3)
        deckOfCards.add(card4)
        deckOfCards.add(card5)
        deckOfCards.add(card6)
        deckOfCards.add(card7)
        deckOfCards.add(card8)
        deckOfCards.add(card9)
        deckOfCards.add(card10)
        deckOfCards.add(card11)
        deckOfCards.add(card12)
        deckOfCards.add(card13)
        deckOfCards.add(card14)
        deckOfCards.add(card15)
        deckOfCards.add(card16)
        deckOfCards.add(card17)
        deckOfCards.add(card18)
        deckOfCards.add(card19)
        deckOfCards.add(card20)
        deckOfCards.add(card21)
        deckOfCards.add(card22)
        deckOfCards.add(card23)
        deckOfCards.add(card24)
        deckOfCards.add(card25)
        deckOfCards.add(card26)
        deckOfCards.add(card27)
        deckOfCards.add(card28)
        deckOfCards.add(card29)
        deckOfCards.add(card30)
        deckOfCards.add(card31)
        deckOfCards.add(card32)
        deckOfCards.add(card33)
        deckOfCards.add(card34)
        deckOfCards.add(card35)
        deckOfCards.add(card36)
        deckOfCards.add(card37)
        deckOfCards.add(card38)
        deckOfCards.add(card39)
        deckOfCards.add(card40)
        deckOfCards.add(card41)
        deckOfCards.add(card42)
        deckOfCards.add(card43)
        deckOfCards.add(card44)
        deckOfCards.add(card45)
        deckOfCards.add(card46)
        deckOfCards.add(card47)
        deckOfCards.add(card48)
        deckOfCards.add(card49)
        deckOfCards.add(card50)
        deckOfCards.add(card51)
        deckOfCards.add(card52)
        deckOfCards.add(card49)
        deckOfCards.add(card50)
        deckOfCards.add(card51)
        deckOfCards.add(card53)
    }
    fun getNewCard (): Card {
      if ( deckOfCards.isEmpty()){
          createCard()
      }
        val random = (0 until deckOfCards.size).random()

         val card = deckOfCards.removeAt(random)
        return card
    }



    }
