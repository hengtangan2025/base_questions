sort = (array)->
  for i in [0..array.length - 1]
    for j in [0..array.length - i - 2]
      if array[j] > array[j + 1]
        number = array[j + 1]
        array[j + 1] = array[j]
        array[j] = number

  return array

array4 = (input_array)->
  sort_array = sort input_array
  for i in sort_array
    console.log i 

array4 [5,6,8,0,3,2,1]