### 查看java thread

jps -l (能看到包名和类名 以及进程编号)  


#### 查看是否使用了默认的参数
形式如 
jinfo -flag PrintGCDetails  进程编号

结果形如 -XX:-PrintGCDetails

-XX：- 表示没有使用  -XX：+ 已经使用了

jinfo -flag UseSerialGC 4465

结果-XX:-UseSerialGC 

表示 没有当前 运行jvm 没有 使用 UseSerialGC  (串行垃圾收集器) 

#### 查看 某个属性的默认值 

展示 jvm MetaspaceSize(元数据空间大小)的 默认大小

jinfo -flag MetaspaceSize 进程编号

jinfo -flag InitialHeapSize 进程编号


#### cpu occupy highly 

1. top  
find the most occupy highly progressId

1. top -Hd progressId  
find the most occupy  highly threadId

1. printf "%X\n" threadId threadId to the Hexadecimal

1. jstack progressId  | grep  Hexadecimal threadId  -A 60 



 