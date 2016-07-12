array8 = (array)->
  hash = {}
  for i in [0..array.length - 1]
    if i%2 == 0
      hash[array[i]] = array[i + 1]

  console.log  hash
  
array8 [1,2,4,7,3,6,8,8,0,9]