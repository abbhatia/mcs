package mcs

object Main2 {

  println(moves.map(m => s"sg_remove(${m._1},${14 - m._2})").mkString(";"))

  def moves = List(
    (13, 5),
    (2, 13),
    (9, 0),
    (14, 4),
    (4, 0),
    (12, 0),
    (5, 11),
    (9, 13),
    (1, 1),
    (12, 5),
    (11, 3),
    (3, 11),
    (11, 7),
    (3, 3),
    (7, 10),
    (5, 3),
    (11, 7),
    (6, 3),
    (10, 4),
    (9, 7),
    (1, 4),
    (13, 3),
    (9, 4),
    (2, 5),
    (6, 10),
    (5, 0),
    (7, 9),
    (5, 0),
    (6, 0),
    (13, 3),
    (7, 4),
    (10, 2),
    (7, 2),
    (14, 7),
    (7, 1),
    (2, 8),
    (1, 7),
    (0, 2),
    (1, 3),
    (1, 4),
    (5, 1),
    (4, 0),
    (0, 4),
    (6, 4),
    (11, 1),
    (7, 1),
    (0, 0),
    (3, 0),
    (9, 1),
    (0, 1),
    (0, 0),
    (1, 0),
    (0, 1),
    (4, 0),
    (5, 0),
    (6, 0),
    (7, 1),
    (2, 0),
    (1, 0),
    (0, 1),
    (0, 0),
    (0, 0),
    (0, 0),
    (0, 0),
    (0, 0)
  )
}