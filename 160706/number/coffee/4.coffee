number4 = (n,m)->
  if n <= m
    for i in [n..m]
      console.log i
  else
    for i in [m..n]
      console.log i

number4 18,5