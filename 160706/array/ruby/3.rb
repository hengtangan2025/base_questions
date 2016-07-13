def reverse array
  (0..array.length - 1).each do |i|
    (0..array.length - i - 2).each do |j|
      if array[j] < array[j + 1]
        number = array[j + 1]
        array[j + 1] = array[j]
        array[j] = number
      end
    end
  end

  return array
end

def array3 input_array
  reverse_array = reverse input_array
  reverse_array.each do |i|
    p i 
  end
end

array3 [1,2,4,7,3,8,0]