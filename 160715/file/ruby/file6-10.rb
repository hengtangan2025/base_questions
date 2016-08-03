p "====第6题===="
def file6 filename
  p File.size?(filename)
end

file6 "test1.rb"

p "====第7题===="
def file7 f1,f2,fout
  string = ""
  file1 = File.open(File.join(f1), "r")
  file2 = File.open(File.join(f2), "r")
  file_out = File.open(File.join(fout), "w+")
  file1.each do |line|
    string += line
  end

  file2.each do |line|
    string += line
  end

  file_out.puts(string)
end

file7 "test1.rb","test4.rb","test7.rb"

p "====第8题===="
def file8 filename
  p File.directory?filename
end

file8 "file/ruby/test1.rb"

p "====第9题===="
def file9 path
  puts File.dirname(path)
end

file9 "file/ruby/test1.rb"

p "====第10题===="
def file10 filename
  File.new(filename, "w+")
  puts "#{filename}文件已创建"
  sleep 5
  File.delete(filename)
  puts "#{filename}文件已删除"

end

file10 "test10.rb"