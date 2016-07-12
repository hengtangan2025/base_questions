string10 = (input_str,regexp)->
  match_str = new RegExp(regexp, "g")
  regExpMatchResult = match_str.exec(input_str)
  console.log regExpMatchResult.index

string10 "123456", "[^12]+"