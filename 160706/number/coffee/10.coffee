number10 = (n,m)->
  if n <= m
    for i in [n..m]
      console.log  "x".repeat(i)
  else
    for i in [m..n]
      console.log  "x".repeat(i)

number10 6,2