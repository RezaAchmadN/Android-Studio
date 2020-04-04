fun main() {
    AND();
    OR();
    NOT();
}

fun AND() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    print("Office is open : $isOpen")
}

fun OR() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now < officeOpen || now > officeClosed

    print("Office is closed : $isOpen")
}

fun NOT() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}