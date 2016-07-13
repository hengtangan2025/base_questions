reverse = (array)->
  for i in [0..array.length - 1]
    for j in [0..array.length - i - 2]
      if array[j] < array[j + 1]
        number = array[j + 1]
        array[j + 1] = array[j]
        array[j] = number

  return array

array3 = (input_array)->
  reverse_array = reverse input_array 
  for i in reverse_array
    console.log i

array3 [3,4,6,5,8,7,0]