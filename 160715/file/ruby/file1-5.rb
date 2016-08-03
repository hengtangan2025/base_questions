p "====第1题===="
def file1 filename,string
  file = File.open(File.join(filename), "w+")
  file.puts(string)
  file.close
  p "创建成功"
end

file1 "test1.rb", "123"

p "====第2题===="
def file2 filename
  file = File.open(File.join(filename), "r")
  file.each{ |line| puts line}
end

file2 "test1.rb"

p "====第3题===="
def file3 filename
  p File::exists?(filename)
end

file3 "test1.rb"

p "====第4题===="
def file4 filename,n
  f=File.open(File.join(filename), "w+")
  (1..n).each do |i|
    f.puts(i)
  end
  f.close
  p "创建成功"
end

file4 "test4.rb", 5

p "====第5题===="
def file5 filename
  File.new(filename, "w+")
  p "创建成功 5秒后删除"
  sleep 5
  File.delete(filename)
  p "已删除"
end

file5 "test5.rb"