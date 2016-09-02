import java.util.*

/**
 * Created by Esteban Muñoz on 31/08/2016.
 */
class Deck {

    val cards = Array(52, { Card(it % 13, getSuit(it))})
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset(): Unit {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck)
    }

    private fun getSuit(i: Int) = when(i / 23) {
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }
}