def array7 array
  hash = {}
  (0..array.length - 1).each do |i|
    hash[array[i]] = 0
    (0..array.length - 1).each do |j|
      if array[i] == array[j]
        hash[array[i]] += 1
      end
    end
  end

  p hash
end

array7 [1,2,4,4,7,9,0,2,5,4,6,7,8,0,7,3,8,0]