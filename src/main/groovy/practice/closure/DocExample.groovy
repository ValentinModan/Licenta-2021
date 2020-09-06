package practice.closure

class DocExample {
    def show = { println it }
    def square_root = { Math.sqrt(it) }

    def please(action) {
        [the: { what ->
            [of: { n -> action(what(n)) }]
        }]
    }

// equivalent to: please(show).the(square_root).of(100)

// ==> 10.0
    def example() {
        please show the square_root of 100
    }
}
