def array1 input_array
  output_array = []
  (0..input_array.length - 1).each do |i|
    output_array.push(input_array[input_array.length - 1 - i])
  end
  p output_array
end

array1 [1,2]