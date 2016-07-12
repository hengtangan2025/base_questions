number9 = (n)->
  for i in [0..n]
    console.log  " ".repeat(i) + "x".repeat(n) + " ".repeat(n - i)

number9 4