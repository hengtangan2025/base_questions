string10 = (input_str,regexp)->
  match_str = new RegExp(regexp, "g")
  regExpMatchResult = match_str.exec(input_str)
  if regExpMatchResult == null
    console.log -1
  else
    match_string = regExpMatchResult[0]
    first_char = match_string[0]
    console.log match_string.indexOf(first_char)

string10 "123456", "[^12]+"
string10 "123456", "[a]+"