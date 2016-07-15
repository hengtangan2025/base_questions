number6 = (n)->
  for i in [2..n]
    k = 0
    for j in [1..Math.sqrt(i)]
      if i%j == 0
        k += 1
        if k == 2
          break
    if k != 1
      console.log i

number6 20