fs = require('fs')
file6 = (filename)->
  fs.exists filename,(err, data)->
    if err
      s = fs.statSync filename
      console.log "====第6题===="
      console.log s.size

file7 = (a,b,c)->
  str = ""
  fs.readFile a,(err, data)->
    if err
      console.error(err)
    str = str + data.toString()


  fs.readFile b,(err, data)->
    if err
      console.error(err)
    str = str + data.toString()
    
    fs.writeFile c,str,(err)->
      if err
        console.error(err)

      console.log "====第7题===="
      console.log("创建成功")
  
file8 = (path)->
  fs.exists path, (resualt)->
    console.log "====第8题===="
    console.log resualt

file9 = (path)->
  exec = require('child_process').exec
  cmd_str = "pwd #{path}"
  exec cmd_str, (err,stdout,stderr)->
    console.log "====第9题===="
    if err 
      console.log stderr
    else
      console.log stdout

file10 = (filename)->
  console.log "====第10题===="
  console.log "5秒后删除"

  setTimeout ()->
    fs.unlink filename,(err)->
      if err 
        console.error err
      console.log "====第10题===="
      console.log "已删除"
  ,5000 

file6("text1.txt")

file7("f1","f2","fout")

file8("../../file/coffee")

file9("../../file/coffee/text4.txt")

file10("text10.txt")