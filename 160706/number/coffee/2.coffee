number2 = (n)->
  if 100 <= n
    for i in [100..n]
      console.log i
  else
    for j in [n..100]
      console.log j

number2 88