case class User(id: Int, name: String)

object UserRepo {
  def findUserById(id: Int): Option[User] = id match {
    case 1 =>
      Some(User(1, "Jane"))

    case 2 =>
      Some(User(2, "Michael"))

    case 3 =>
      Some(User(3, "Joshua"))

    case _ =>
      None
  }
}

/*
  When user is found, return "Hello, $name"
  Otherwise, return, return "User not found"
  -- use pattern matching
 */
def helloUser(id: Int): Option[User] = ???

/*
  Get length of username
  if user is not found, return 0
 */
def getUsernameLength(user: User): Int = ???