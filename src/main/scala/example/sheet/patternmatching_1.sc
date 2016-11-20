class Movie(val name: String, val rating: Int)

/*
  When rating >= 4 returns "great"
  When 2 <= rating < 4  returns "fine"
  Otherwise returns "trash"
 */

def getQuality(movie: Movie): String = ???


/*
  returns just "romantic" or "thriller" according to type
 */
def getType(movie: Movie) = ???