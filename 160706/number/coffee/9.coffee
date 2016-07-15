number9 = (n)->
  max_length = n*2 - 1
  for i in [1..max_length]
    if i <= n
      x_length = i*2 - 1
      blank_length = (max_length - x_length)/2
    else
      x_length = (max_length - i)*2 + 1
      blank_length = (max_length - x_length)/2
    
    console.log  " ".repeat(blank_length) + "x".repeat(x_length) + " ".repeat(blank_length)

number9 4