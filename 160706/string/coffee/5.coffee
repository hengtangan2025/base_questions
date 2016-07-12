string5 = (str1, str2)->
  if str1.length > str2.length
    console.log  str1

  if str1.length < str2.length
    console.log  str2

  if str1.length == str2.length
    console.log  "两个字符串的长度相等"

string5 "23456","234567"