def strng8 input_str, n
  output_str = ""
  (0..input_str.length - 1).each do |i|
    k = i - n
    output_str += input_str[k]
  end
  p output_str
end

strng8 "123456",4