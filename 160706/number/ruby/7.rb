def get_prime_number n
  prime_number_array = []
  (2..n).each do |i|
    k = 0
    (2..i).each do |j|
      if i%j == 0
        k = k + 1
      end
    end
    
    if k == 1
      prime_number_array.push(i) 
    end
  end
  return prime_number_array
end

def is_prime_number? n 
  k = 0
  (2..n).each do |i|
    if n%i == 0
      k = k + 1
    end
  end
  
  if k == 1
    return true
  else
    return false
  end
end

def get_non_prime_number n
  non_prime_number_array = []
  (2..n).each do |i|
    k = 0
    (2..i).each do |j|
      if i%j == 0
        k = k + 1
      end
    end
    
    if k != 1
      non_prime_number_array.push(i)
    end
  end
  return non_prime_number_array
end

def number7 n
  non_prime_number_array = get_non_prime_number n
  non_prime_number_array.each do |i|
    #质因式分解数组
    prime_factorisation_array = []
    prime_factorisation_str = "#{i}="
    prime_number_array = get_prime_number i
    prime_number_array.each do |j|
      while i != j do
        if i%j == 0
          prime_factorisation_array.push(j)
          i = i/j
          if is_prime_number? i
            prime_factorisation_array.push(i)
          end 
        else
          break;
        end
      end
    end
    prime_factorisation_array.each do |i|
      prime_factorisation_str += "#{i}*"
    end
    p prime_factorisation_str.chop
  end
end

number7 20