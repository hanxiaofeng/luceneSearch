# luceneSearch
lucene search demo，lucene v8.4.0


### 1.介绍

lucene库的jar包使用的是[android-lucene](https://github.com/shashavali-d/android-lucene)，需要的可以自行下载，感谢作者。

### 2.流程

    - 创建搜索内容的索引文件createIndex;
    - 我测试中分别对两个文件创建了索引，然后把两个合并为1个;
    - 根据关键字搜索合并后的索引，拿到结果;

### 3.result

(```) 
2020-05-19 14:54:33.939 9955-9955/org.lukhnos.lucenesearchdemo I/System.out: 开始读取文件:/mnt/sdcard/lucene/content1/万物在更新.txt
2020-05-19 14:54:35.598 9955-9955/org.lukhnos.lucenesearchdemo I/System.out: 开始读取文件:/mnt/sdcard/lucene/content2/靠在车位上熄灭了火.txt
2020-05-19 14:54:35.883 9955-9955/org.lukhnos.lucenesearchdemo I/System.out: 索引文件合并成功!
2020-05-19 14:54:35.907 9955-9955/org.lukhnos.lucenesearchdemo I/System.out: 共找到匹配处：1 hits
2020-05-19 14:54:35.907 9955-9955/org.lukhnos.lucenesearchdemo I/System.out: 共找到匹配文档数：1
2020-05-19 14:54:35.908 9955-9955/org.lukhnos.lucenesearchdemo I/System.out: -----------------------------------------
2020-05-19 14:54:35.908 9955-9955/org.lukhnos.lucenesearchdemo I/System.out: 靠在车位上熄灭了火.txt:/mnt/sdcard/lucene/content2/靠在车位上熄灭了火.txt
2020-05-19 14:54:35.982 9955-9955/org.lukhnos.lucenesearchdemo I/System.out: 时辰，坐起来处理一些事情，倒不用坐在电脑前去忍受寒冷。有了手机倒也方便了许多，<span style="backgroud:red">一个个</span>应用软件处理完毕，已经是午夜两点了，精神有些亢奋的睡不着了。本想听听音乐舒缓一下情绪，想想还是算了吧，明天早晨还得早起
2020-05-19 16:42:34.671 11321-11321/com.coo.lucenesearch I/System.out: 开始读取文件:/mnt/sdcard/lucene/content1/万物在更新.txt
2020-05-19 16:42:36.239 11321-11321/com.coo.lucenesearch I/System.out: 开始读取文件:/mnt/sdcard/lucene/content2/靠在车位上熄灭了火.txt
2020-05-19 16:42:36.419 11321-11321/com.coo.lucenesearch I/System.out: 索引文件合并成功!
2020-05-19 16:42:36.463 11321-11321/com.coo.lucenesearch I/System.out: 共找到匹配处：1 hits
2020-05-19 16:42:36.463 11321-11321/com.coo.lucenesearch I/System.out: 共找到匹配文档数：1
2020-05-19 16:42:36.466 11321-11321/com.coo.lucenesearch I/System.out: -----------------------------------------
2020-05-19 16:42:36.467 11321-11321/com.coo.lucenesearch I/System.out: 靠在车位上熄灭了火.txt:/mnt/sdcard/lucene/content2/靠在车位上熄灭了火.txt
2020-05-19 16:42:36.518 11321-11321/com.coo.lucenesearch I/System.out: 时辰，坐起来处理一些事情，倒不用坐在电脑前去忍受寒冷。有了手机倒也方便了许多，<span style="backgroud:red">一个个</span>应用软件处理完毕，已经是午夜两点了，精神有些亢奋的睡不着了。本想听听音乐舒缓一下情绪，想想还是算了吧，明天早晨还得早起

(```)