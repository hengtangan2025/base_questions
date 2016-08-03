fs = require('fs')
file1 = (filename, string)->
  fs.writeFile filename,string,(err)->
    if err
      console.error err
    console.log "====第1题===="
    console.log "创建成功"

file2 = (filename)->
  fs.readFile filename,(err,data)->
    if err
      console.error err
    console.log "====第2题===="
    console.log data.toString()

file3 = (filename)->
  fs.exists filename,(err,data)->
    if err
      console.log "====第3题===="
      console.error err

file4 = (filename, n)->
  array = []
  if n > 1
    for i in [1..n]
      array.push(i.toString() + "\n")

  content = array.join("")
  fs.writeFile filename,content,(err)->
    if err
      console.error err
    console.log "====第4题===="
    console.log "创建成功" 

file5 = (filename)->
  fs.writeFile filename,"",(err)->
    if err
      console.error err
    console.log "====第5题===="
    console.log "创建成功 5秒后删除"

  setTimeout ()->
    fs.unlink filename,(err)->
      if err 
        console.error err
      console.log "====第5题===="
      console.log "已删除"
  ,5000 


file1("text1.txt","54321")

file2("text1.txt")

file3("text1.txt")

file4("text4.txt",5)

file5("text5.txt")