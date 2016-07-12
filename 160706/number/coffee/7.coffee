get_prime_number = (n)->
  prime_number_array = []
  for i in [2..n]
    k = 0
    for j in [2..i]
      if i%j == 0
        k = k + 1
    
    if k == 1
      prime_number_array.push(i) 

  return prime_number_array


is_prime_number = (n)-> 
  k = 0
  for i in [2..n]
    if n%i == 0
      k = k + 1
  
  if k == 1
    return true
  else
    return false

get_non_prime_number = (n)->
  non_prime_number_array = []
  for i in [2..n]
    k = 0
    for j in [2..i]
      if i%j == 0
        k = k + 1
  
    if k != 1
      non_prime_number_array.push(i)

  return non_prime_number_array


number7 = (n)->
  non_prime_number_array = get_non_prime_number n
  for i in non_prime_number_array
    #质因式分解数组
    prime_factorisation_array = []
    prime_factorisation_str = "#{i}="
    prime_number_array = get_prime_number i
    for j in prime_number_array
      while i != j
        if i%j == 0
          prime_factorisation_array.push(j)
          i = i/j
          if is_prime_number i
            prime_factorisation_array.push(i)
        else
          break
    for i in prime_factorisation_array
      prime_factorisation_str += "#{i}*"

    prime_factorisation_str = prime_factorisation_str.substring(0,prime_factorisation_str.length - 1)
    console.log  prime_factorisation_str

number7 20