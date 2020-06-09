# Roman Numeral Kata
The Romans were a clever bunch. They conquered most of Europe and ruled it for hundreds of years. They invented concrete and straight roads and even bikinis [1]. One thing they never discovered though was the number zero. This made writing and dating extensive histories of their exploits slightly more challenging, but the system of numbers they came up with is still in use today. For example the BBC uses Roman numerals to date their programmes.

The Romans wrote numbers using letters : I, V, X, L, C, D, M. (notice these letters have lots of straight lines and are hence easy to hack into stone tablets)

Part I
The Kata says you should write a function to convert from normal numbers to Roman Numerals: e.g.

     1 --> I
     10 --> X
     7 --> VII
     4 --> IV
     9 --> IX
     90 --> XC
etc.

There is no need to be able to convert numbers larger than about 3000. (The Romans themselves didn’t tend to go any higher)

Part II
Write a function to convert in the other direction, ie numeral to digit

- [x] RomanNumber.toRoman(1) -> I
- [x] RomanNumber.toRoman(2) -> II
- [x] Refactor if to use while loop
- [ ] Refactor test to parameterized test
- [ ] RomanNumber.toRoman(5) -> V
- [ ] RomanNumber.toRoman(4) -> IV
- [ ] RomanNumber.toRoman(9) -> IX
- [ ] RomanNumber.toRoman(10) -> X
- [ ] RomanNumber.toRoman(50) -> L
- [ ] RomanNumber.toRoman(90) -> XC
- [ ] RomanNumber.toRoman(100) -> C
- [ ] RomanNumber.toRoman(400) -> CD
- [ ] RomanNumber.toRoman(500) -> D
- [ ] RomanNumber.toRoman(900) -> CM
- [ ] RomanNumber.toRoman(1000) -> M

