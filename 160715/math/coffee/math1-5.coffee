console.log  "====第1题===="
math1 = (input_number)->
  length = input_number.toString().length
  console.log length

math1 15456

console.log  "====第2题===="
math2 = (input_number)->
  input_str = input_number.toString()
  length = input_str.length
  for i in [0..length - 1].reverse()
    console.log  input_str[i]
math2 12345

console.log  "====第3题===="
math3 = (times)->
  last_bounce_height = 100*(0.5**times)
  bounce_height_sum = 100
  for i in [1..times - 1]
    bounce_height_sum += 100*(0.5**i)*2
  console.log  "它在第#{times}次落地时，共经过#{bounce_height_sum}米,第#{times}次反弹#{last_bounce_height}米高"
math3 10

console.log  "====第4题===="
math4 = (input_number)->
  level = if input_number >= 90 then "A" else if input_number >= 60 then "B" else "C"
  console.log level
math4 55

console.log  "====第5题===="
rabbit_sum = (month)->
  if month == 1 || month == 2
    return 1
  else
    return rabbit_sum(month - 1) + rabbit_sum(month - 2)

math5 = (month)->
  number = rabbit_sum month
  console.log  "在#{month}个月后，兔子的总数为#{number}对"
math5 14