def array2 input_array
  output_array = []
  output_array = flatten(input_array,output_array)
  p output_array
end

def flatten input_array,output_array
  (0..input_array.length - 1).each do |i|
    if input_array[i].to_s[0] != "["
      output_array.push(input_array[i])
    else
      flatten input_array[i],output_array
    end
  end
  return output_array
end

array2 [1,2,[2,3,[3,4,5]]]