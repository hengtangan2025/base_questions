puts "====第1题===="
def math1 n
  p n.to_s.length
end

math1 16554

puts "====第2题===="
def math2 n
  (0..n.to_s.length - 1).sort.reverse.each do |i|
    puts n.to_s[i]
  end  
end

math2 16554

puts "====第3题===="
def math3 n
  last_bounce_height = 100*(0.5**n)
  bounce_height_sum = 100
  (1..n - 1).each do |i|
    bounce_height_sum += 100*(0.5**i)*2
  end
  puts "它在第#{n}次落地时，共经过#{bounce_height_sum}米,第#{n}次反弹#{last_bounce_height}米高"
end

math3 10

puts "====第4题===="
def math4 n
  (n >= 90) ? (puts "A"): (n >=60) ? (puts "B") : (puts "C")
end

math4 99

puts "====第5题===="
def rabbit_sum n
  if (n == 1 || n == 2)
    return 1
  else
    return rabbit_sum(n - 1) + rabbit_sum(n - 2)
  end
end

def math5 n
  number = rabbit_sum n
  puts "在#{n}个月后，兔子的总数为#{number}对"
end

math5 20