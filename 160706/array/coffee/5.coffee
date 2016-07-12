array5 = (array)->
  for i in [0..array.length - 1]
    for j in [0..array.length - i - 2]
      if array[j] > array[j + 1]
        number = array[j + 1]
        array[j + 1] = array[j]
        array[j] = number

  console.log  array

array5 [1,2,4,7,3,8,0]