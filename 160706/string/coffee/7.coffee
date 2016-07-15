string7 = (input_str, n)->
  output_str = input_str.substring(n, input_str.length) + input_str.substring(0,n)
  console.log  output_str
  
string7 "123456", 4