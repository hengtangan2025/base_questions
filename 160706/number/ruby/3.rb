def number3 n,m
  if n <= m
    (n..m).each do |i|
      p i
    end
  else
    (m..n).sort.reverse.each do |i|
      p i
    end
  end
end

number3 18,11