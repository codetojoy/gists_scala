
package net.codetojoy.strategy

class MaxCard extends Strategy {
    def selectCard(prizeCard:Int, hand:List[Int], maxCard:Int): Int =
        hand.max
}
