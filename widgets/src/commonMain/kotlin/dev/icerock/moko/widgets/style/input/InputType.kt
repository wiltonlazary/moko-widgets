package com.icerockdev.mpp.widgets.style.input

enum class InputType(val mask: String?) {
    EMAIL(null),
    PLAIN_TEXT(null),
    PASSWORD(null),
    DATE("[00]{.}[00]{.}[0000]"),
    PHONE("+7 ([000]) [000] [00] [00]"),
    DIGITS(null)
}