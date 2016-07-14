def string10 input_str,regexp
  match_str_array = regexp.match(input_str)
  if match_str_array.nil?
    p -1
  else
    match_str = match_str_array[0]
    first_char = match_str[0]
    p input_str.index(first_char)
  end
end

string10 "123456", /[^12]+/
string10 "123456", /[a]+/