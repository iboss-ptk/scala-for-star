case class Person(name: String, child: Option[Person])

val kid = Person("John", None)
val mom = Person("Rachel", Some(kid))
val grandpa = Person("Greg", Some(mom))


/*
  When child is found, returns child's name
  otherwise returns empty sting
 */
def getChildName(person: Person): String = ???

/*
  When child is found, returns child's name
  otherwise returns empty sting
 */
def getGrandChildName(person: Person): String = ???



/*
  more to learn
  - for comprehension
  - Try, Future
 */