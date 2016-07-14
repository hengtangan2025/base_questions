string10 = (input_str,regexp)->
  match_str = new RegExp(regexp, "g")
  regExpMatchResult = match_str.exec(input_str)
  if regExpMatchResult == null
    console.log -1
  else
    console.log regExpMatchResult.index

string10 "123456", "[^12]+"
string10 "123456", "[a]+"