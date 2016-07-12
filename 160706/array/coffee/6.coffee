array6 = (array)->
  for i in [0..array.length - 1]
    k = Math.floor(Math.random()*i)
    number = array[k]
    array[k] = array[i]
    array[i] = number

  console.log array

array6 [1,2,4,7,3,8,0]