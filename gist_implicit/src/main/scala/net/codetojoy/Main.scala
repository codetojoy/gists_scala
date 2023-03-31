
package net.codetojoy

case class Foo(group: String)
case class Bar(location: String)

object Main {
    def buildStr(text: String)(implicit foo: Foo, bar: Bar) =
        s"""TRACER ${text} the ${foo.group} at ${bar.location}"""

    def main(args: Array[String]): Unit =
        println("TRACER hello from main")

        // ------
        implicit val foo: Foo = Foo("frontline workers")
        implicit val bar: Bar = Bar("Mill River Resort")
        println(buildStr("we are hosting"))

        println("Ready.")
}
