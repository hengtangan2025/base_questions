console.log  "====第6题===="
math6 = (input_number,n)->
  output_number = parseInt(input_number).toString(n)
  console.log "#{input_number}的#{n}进制数是#{output_number}"

math6(28,3)

console.log  "====第7题===="
math7 = (n)->
  console.log 2/2**n

math7(6)