# xingyun_schedule
转自：http://git.oschina.net/uncode/uncode-schedule

增加了一个属性
 ![image](https://raw.githubusercontent.com/qianchengjava/files/master/ZKScheduleManager%E4%BF%AE%E6%94%B9.png)
相关类修改
 ![image](https://raw.githubusercontent.com/qianchengjava/files/master/ScheduleDataManager4ZK%E4%BF%AE%E6%94%B9%20.png)

配置文件
 ![image](https://raw.githubusercontent.com/qianchengjava/files/master/%E9%85%8D%E7%BD%AE%E6%96%87%E4%BB%B6.png)
该属性作用，某一时刻仅有一台机器执行定时任务，
当服务器1停止，服务器2在1000ms后可被激活。
也可不配置。