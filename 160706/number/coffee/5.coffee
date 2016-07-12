number5 = (n)->
  for i in [2..n]
    console.log i
    k = 0
    for j in [2..i]
      console.log j
      if i%j == 0
        k = k + 1
    if k == 1
      console.log i

number5 20