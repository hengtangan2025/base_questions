def number10 n,m
  if n <= m
    (n..m).each do |i|
      p "x" * i
    end
  else
    (m..n).sort.reverse.each do |i|
      p "x" * i 
    end
  end
end

number10 6,2