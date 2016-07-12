def number5 n
  (2..n).each do |i|
    k = 0
    (2..i).each do |j|
      if i%j == 0
        k = k + 1
      end
    end
    
    if k == 1
      p i 
    end
  end
end

number5 20