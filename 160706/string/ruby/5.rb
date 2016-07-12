def string5 str1, str2
  if str1.length > str2.length
    p str1
  end

  if str1.length < str2.length
    p str2
  end

  if str1.length == str2.length
    p "两个字符串的长度相等"
  end
end

string5 "23456","234567"