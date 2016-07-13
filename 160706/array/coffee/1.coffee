array1 = (input_array) ->
  output_array = []
  for i in [0..input_array.length - 1]
    output_array.push(input_array[input_array.length - 1 - i])
  console.log output_array

array1([1,2,3])