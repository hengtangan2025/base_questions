puts "====第6题===="
def number_length input_number,n,length
  if input_number >= n
    length += 1
    number_length input_number/n,n,length
  else
    return length
  end
end

def get_output_number input_number,n,length,output_number
  xishu = input_number/(n ** length)
  next_num = input_number % (n ** length)
  output_number += xishu * (10 ** length)
  if next_num >= n
    length = length - 1
    get_output_number next_num,n,length,output_number
  else
    output_number += next_num
    return output_number
  end
end

def math6 input_number,n
  output_number = 0
  length = number_length input_number,n,0
  output_number = get_output_number input_number,n,length,output_number
  puts "#{input_number}的#{n}进制数是#{output_number}"
end

math6 62,7

puts "====第7题===="
def math7 n
  puts 2.to_f/(2**n).to_f
end

math7 3