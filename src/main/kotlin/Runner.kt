package com.rsk

fun main() {
    val meeting = Meeting("Review", UKAddress("a house", "a street", "a city", "a county", "00000"))
    val review = PersonalReview("Review Meeting", Participant(Name("Mike"), ""), listOf(), Room("Room 1"))

    println("Created $review with name ${review.meetingName} and at ${review.locationName}")

    review.closeReview()

    val name = Name("Ravi")
    val participant = Participant(name, "ravi@email.com")
    val canonicalEmail = participant.canonicalEmail

    review.addParticipant(participant)

    //meeting.meetingName = "Review"

    //meeting.verifyMeeting
    //meeting.verifyParticipant
    //meeting.logger
}

val double: (Int) -> Int = { it * it }

fun compute(x:Int, algo: (Int) -> Int): Int {
    return algo(x)
}

val y = compute(10, double)
