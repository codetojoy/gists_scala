
package net.codetojoy.strategy

class PopCard extends Strategy {
    def selectCard(prizeCard:Int, hand:List[Int], maxCard:Int): Int =
        hand.head
}
