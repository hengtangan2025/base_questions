def array6 array
  (0..array.length - 1).each do |i|
    k = rand(0..i)
    number = array[k]
    array[k] = array[i]
    array[i] = number
  end

  p array
end

array6 [1,2,4,7,3,8,0]