def string7 input_str, n
  output_str = ""
  (0..input_str.length - 1).each do |i|
    k = i - (input_str.length - n) 
    output_str += input_str[k] 
  end
  p output_str
end

string7 "123456", 4