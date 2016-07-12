def number2 n
  if 100 <= n
    (100..n).each do |i|
      p i 
    end
  else
    (n..100).sort.reverse.each do |i|
      p i
    end
  end
end

number2 88