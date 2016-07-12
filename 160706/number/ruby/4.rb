def number4 n,m
  if n <= m
    (n..m).each do |i|
      p i
    end
  else
    (m..n).each do |i|
      p i
    end
  end
end

number4 18,5