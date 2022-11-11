package com.sergienkoandrew.lab3

object DummyNameStorage {
    private val firstNames = listOf(
        "James",
        "Robert",
        "John",
        "Michael",
        "William",
        "David",
        "Richard",
        "Joseph",
        "Thomas",
        "Charles",
        "Christopher",
        "Daniel",
        "Matthew",
        "Anthony",
        "Mark",
        "Donald",
        "Steven",
        "Paul",
        "Andrew",
        "Joshua",
        "Kenneth",
        "Kevin",
        "Brian",
        "George",
        "Edward",
        "Ronald",
        "Timothy",
        "Jason",
        "Jeffrey",
        "Ryan",
        "Jacob",
        "Gary",
        "Nicholas",
        "Eric",
        "Jonathan",
        "Stephen",
        "Larry",
        "Justin",
        "Scott",
        "Brandon",
        "Benjamin",
        "Samuel",
        "Gregory",
        "Frank",
        "Alexandr",
        "Raymond",
        "Patrick",
        "Jack",
        "Dennis",
        "Jerry",
        "Tyler",
        "Aaron",
        "Jose",
        "Adam",
        "Henry",
        "Nathan",
        "Douglas",
        "Zachary",
        "Peter",
        "Kyle",
        "Walter",
        "Ethan",
        "Jeremy",
        "Harold",
        "Keith",
        "Christi",
        "Roger",
        "Noah",
        "Gerald",
        "Carl",
        "Terry",
        "Sea",
        "Austin",
        "Arthur",
        "Lawrence",
        "Jesse",
        "Dylan",
        "Bryan",
        "Joe",
        "Jordan",
        "Billy",
        "Bruce",
        "Albert",
        "Willie",
        "Gabriel",
        "Logan",
        "Alan",
        "Juan",
        "Wayne",
        "Roy",
        "Ralph",
        "Randy",
        "Eugene",
        "Vincent",
        "Russell",
        "Elijah",
        "Louis",
        "Bobby",
        "Philip",
        "Johnny"
    )

    private val secondNames = listOf(
        "Smith",
        "Johnson",
        "Williams",
        "Brown",
        "Jones",
        "Garcia",
        "Miller",
        "Davis",
        "Rodriguez",
        "Martinez",
        "Hernandez",
        "Lopez",
        "Gonzales",
        "Wilson",
        "Anderson",
        "Thomas",
        "Taylor",
        "Moore",
        "Jackson",
        "Martin",
        "Lee",
        "Perez",
        "Thompson",
        "White",
        "Harris",
        "Sanchez",
        "Clark",
        "Ramirez",
        "Lewis",
        "Robinson",
        "Walker",
        "Young",
        "Allen",
        "King",
        "Wright",
        "Scott",
        "Torres",
        "Nguyen",
        "Hill",
        "Flores",
        "Green",
        "Adams",
        "Nelson",
        "Baker",
        "Hall",
        "Rivera",
        "Campbell",
        "Mitchell",
        "Carter",
        "Roberts",
        "Gomez",
        "Phillips",
        "Evans",
        "Turner",
        "Diaz",
        "Parker",
        "Cruz",
        "Edwards",
        "Collins",
        "Reyes",
        "Stewart",
        "Morris",
        "Morales",
        "Murphy",
        "Cook",
        "Rogers",
        "Gutierrez",
        "Ortiz",
        "Morgan",
        "Cooper",
        "Peterson",
        "Bailey",
        "Reed",
        "Kelly",
        "Howard",
        "Ramos",
        "Kim",
        "Cox",
        "Ward",
        "Richardson",
        "Watson",
        "Brooks",
        "Chavez",
        "Wood",
        "James",
        "Bennet",
        "Gray",
        "Mendoza",
        "Ruiz",
        "Hughes",
        "Price",
        "Alvarez",
        "Castillo",
        "Sanders",
        "Patel",
        "Myers",
        "Long",
        "Ross",
        "Foster",
        "Jimenez"
    )

    fun random() = firstNames.random() + " " + secondNames.random()

    fun firstName() = firstNames.random()

    fun secondName() = secondNames.random()
}