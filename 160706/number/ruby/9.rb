def number9 n
  max_length = n*2 - 1
  (1..max_length).each do |i|
    if i <= n
      x_length = i*2 - 1
      blank_length = (max_length - x_length)/2
    else
      x_length = (max_length - i)*2 + 1
      blank_length = (max_length - x_length)/2
    end

    puts " "*blank_length + "x"*x_length + " "*blank_length
  end
end

number9 4