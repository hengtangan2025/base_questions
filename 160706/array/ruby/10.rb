def sort array
  (0..array.length - 1).each do |i|
    (0..array.length - i - 2).each do |j|
      if array[j] > array[j + 1]
        number = array[j + 1]
        array[j + 1] = array[j]
        array[j] = number
      end
    end
  end

  return array
end

def array10 a1,a2
  merge_array = []
  (0..a1.length - 1).each do |i|
    merge_array.push(a1[i])
  end

  (0..a2.length - 1).each do |j|
    merge_array.push(a2[j])
  end

  sort_array = sort merge_array
  output_array = [sort_array[0]]
  (1..sort_array.length - 1).each do |k|
    if sort_array[k] != sort_array[k - 1]
      output_array.push(sort_array[k])
    end
  end

  p output_array
end

array10 ["a","cs","d1"],["d2","cs"]