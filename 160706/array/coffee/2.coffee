flatten = (input_array,output_array)->
  for i in [0..input_array.length - 1]
    if input_array[i].length == undefined
      output_array.push(input_array[i])
    else
      flatten input_array[i],output_array
  return output_array

array2 = (input_array)->
  output_array = []
  output_array = flatten input_array,output_array
  console.log output_array

array2 [1,2,[2,3,[4,5]]]