def array8 array
  hash = {}
  (0..array.length - 1).each do |i|
    if i % 2 == 0
      hash[array[i]] = array[i + 1]
    end
  end

  p hash
end

array8 [1,2,4,7,3,8,0,9]