
package net.codetojoy

trait Element:
    def header: String

class Link(val header: String, val name: String = "") extends Element {
}

class LinkGroup(val header: String, val id: Int = 0) extends Element {
}

object Main {
    def main(args: Array[String]): Unit =
        val elements: List[Element] = List(new Link("h-link"), new LinkGroup("h-group"))
        println("TRACER hello from main")
        for (e <- elements) {
            println("TRACER header: " + e.header)
        }
        println("Ready.")
}
