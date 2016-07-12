array10 = (a1,a2)->
  merge_array = []
  for i in [0..a1.length - 1]
    merge_array.push(a1[i])

  for j in [0..a2.length - 1]
    merge_array.push(a2[j])

  merge_array.sort()
  output_array = [merge_array[0]]
  for k in [1..merge_array.length - 1]
    if merge_array[k] != merge_array[k - 1]
      output_array.push(merge_array[k])

  console.log  output_array

array10([1,2,3],[2,3,4])