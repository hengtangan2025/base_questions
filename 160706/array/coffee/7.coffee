array7 = (array)->
  hash = {}
  for i in [0..array.length - 1]
    hash[array[i]] = 0
    for j in [0..array.length - 1]
      if array[i] == array[j]
        hash[array[i]] += 1

  console.log  hash

array7 [1,2,4,4,7,9,0,2,5,4,6,7,8,0,7,3,8,0]