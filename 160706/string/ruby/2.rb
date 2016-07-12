def string2 str_array
  output_string = ""
  str_array.each do |str|
    output_string += str 
  end
  p output_string
end

string2 ["abc","def","ghi","lmn"]