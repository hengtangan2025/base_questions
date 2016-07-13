def array8 array
  hash = {}
  (0..array.length - 1).each do |i|
    if i % 2 == 0
      hash[array[i]] = array[i + 1]
    end
  end

  p hash
end

array8 ["ab","cd","ef","gh","ij","kl","mn","or"]