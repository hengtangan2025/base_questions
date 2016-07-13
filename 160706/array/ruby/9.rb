def array9 a1,a2
  output_array = []
  (0..a1.length - 1).each do |i|
    (0..a2.length - 1).each do |j|
      if a1[i] == a2[j]
        output_array.push(a1[i])
      end
    end
  end

  p output_array
end

array9 [1,2,3],[2,3,4]