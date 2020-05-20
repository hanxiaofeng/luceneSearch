# luceneSearch
lucene search demo，lucene v8.4.0


### 1.介绍

   - lucene库的jar包使用的是[android-lucene](https://github.com/shashavali-d/android-lucene)，需要的可以自行下载，感谢作者;
   - 部分代码来自[lucene-demo](https://github.com/sxei/lucene-demo)，用户可自行前往查看;


### 2.流程

   - 准备：准备两个txt文件，放在指定目录用于对其创建索引并搜索;
   - 创建搜索内容的索引文件createIndex（此处我在sdcard放了两个txt文件测试）;
   - 我测试中分别对两个文件创建了索引，然后把两个合并为1个;
   - 根据关键字搜索合并后的索引，拿到结果;

### 3.执行结果

![result](https://github.com/hanxiaofeng/luceneSearch/blob/master/image/result.png "result")

### 输出执行过程和搜索结果：

```

2020-05-19 16:42:34.671 11321-11321/com.coo.lucenesearch I/System.out: 开始读取文件:/mnt/sdcard/lucene/content1/万物在更新.txt
2020-05-19 16:42:36.239 11321-11321/com.coo.lucenesearch I/System.out: 开始读取文件:/mnt/sdcard/lucene/content2/靠在车位上熄灭了火.txt
2020-05-19 16:42:36.419 11321-11321/com.coo.lucenesearch I/System.out: 索引文件合并成功!
2020-05-19 16:42:36.463 11321-11321/com.coo.lucenesearch I/System.out: 共找到匹配处：1 hits
2020-05-19 16:42:36.463 11321-11321/com.coo.lucenesearch I/System.out: 共找到匹配文档数：1
2020-05-19 16:42:36.466 11321-11321/com.coo.lucenesearch I/System.out: -----------------------------------------
2020-05-19 16:42:36.467 11321-11321/com.coo.lucenesearch I/System.out: 靠在车位上熄灭了火.txt:/mnt/sdcard/lucene/content2/靠在车位上熄灭了火.txt
2020-05-19 16:42:36.518 11321-11321/com.coo.lucenesearch I/System.out: 时辰，坐起来处理一些事情，倒不用坐在电脑前去忍受寒冷。有了手机倒也方便了许多，<span style="backgroud:red">一个个</span>应用软件处理完毕，已经是午夜两点了，精神有些亢奋的睡不着了。本想听听音乐舒缓一下情绪，想想还是算了吧，明天早晨还得早起

```

### 4.注意事项

1. api要大于等于26，也就android 8.0才可以使用，目前没找到合适的解决办法，有了解的希望告知。

2. 本demo仅作测试调研用，希望对你有帮助。

3. 你也可以编译其他版本的lucene包，修改[android-lucene](https://github.com/shashavali-d/android-lucene)的版本号，然后导入intellij idea，点开右侧的gradle--app--build,执行后会在项目build/libs目录下生成对应版本的jar包，然后就可以使用了。