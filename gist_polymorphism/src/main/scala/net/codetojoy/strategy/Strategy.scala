
package net.codetojoy.strategy

trait Strategy {
    def selectCard(prizeCard:Int, hand:List[Int], maxCard:Int): Int 
}
