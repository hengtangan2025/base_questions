def number10 n,m
  if n <= m
    (n..m).each do |i|
      puts "x" * i
    end
  else
    (m..n).sort.each do |i|
      puts "x" * i 
    end
  end
end

number10 6,2