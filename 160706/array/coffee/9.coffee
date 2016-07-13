array9 = (a1,a2)->
  output_array = []
  for i in [0..a1.length - 1]
    for j in [0..a2.length - 1]
      if a1[i] == a2[j]
        output_array.push(a1[i])

  console.log output_array

array9([1,2,3],[2,3,4])