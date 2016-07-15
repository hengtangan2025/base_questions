def array7 array
  hash = {}
  array.each do |i|
    hash[array[i]] = 0
    array.each do |j|
      if array[i] == array[j]
        hash[array[i]] += 1
      end
    end
  end

  p hash
end

array7 ['1','2','4','4','7','9','0','2']