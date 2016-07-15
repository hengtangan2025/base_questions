def number6 n
  (2..n).each do |i|
    k = 0
    (1..i ** (1.0/2)).each do |j|
      if i%j == 0
        k = k + 1
        if k == 2 
          break
        end
      end
    end
    
    if k != 1
      p i 
    end
  end
end

number6 20000