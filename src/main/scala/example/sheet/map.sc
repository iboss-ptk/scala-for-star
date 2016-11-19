val empty: List[Nothing] = List()

//All lists in scala are constructed from Empty list Nil
//Construct operation is Cons ::

val fruit: List[String] = "apples" :: "oranges" :: "bananas" :: Nil
val numbers: List[Int] = 1 :: 2 :: Nil
val secondNumbers: List[Int] = 3 :: 4 :: Nil

fruit length;
fruit last;
fruit drop(1)
fruit(1)
fruit.init

numbers :: secondNumbers
numbers ++ secondNumbers
numbers.reverse


