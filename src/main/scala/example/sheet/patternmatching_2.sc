trait Movie {
  val name: String
  val rating: Int
}

case class Romantic(name: String, rating: Int) extends Movie
case class Thriller(name: String, rating: Int) extends Movie

def getQuality(movie: Movie) = movie match {
  case m if m.rating >= 4 =>
    "great"

  case m if m.rating >= 2 =>
    "fine"

  case _ =>
    "trash"
}

def getType(movie: Movie) = movie match {
  case Romantic(_, _) =>
    "romantic"

  case Thriller(_, _) =>
    "thriller"
}


/*
  "$name is a $type movie and it was $quality!"
  eg. "Titanic is a romantic movie and it was great!"
 */
def getDescription(movie: Movie) = ???




/*
  more on pattern matching :)

  - extractor
  -- http://danielwestheide.com/blog/2012/11/21/the-neophytes-guide-to-scala-part-1-extractors.html

  - pattern matching with regular expression
  -- http://letstalkdata.com/2016/01/how-to-combine-scala-pattern-matching-with-regex/

 */
