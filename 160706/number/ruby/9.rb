def number9 n
  (0..n).each do |i|
    p " "*i + "x"*n + " "*(n - i)
  end
end

number9 4