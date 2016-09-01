/**
 * Created by Esteban Muñoz on 31/08/2016.
 */
class Deck {

    var fn = fun (i: Int): Card {
        val value = i % 13
        val suit = when (i / 13) {
            0 -> "Clubs"
            1 -> "Diamonds"
            2 -> "Hearts"
            else -> "Spades"
        }
        return Card(value, suit)
    }

    val cards: Array<Card> = Array(52, fn)
}