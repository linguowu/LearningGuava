把本地的项目上传至GitHub的步骤：
1,运行git bash;
2,进入项目目录;
3,运行命令：git init;
4,运行命令: git add .                       (git add . "."表示添加当前目录中的所有文件)
5,运行命令: git commit -m "first commit"     (表示你对这次提交的注释)
6,运行命令：git remote add origin https://github.com/XXX/XXXX.git
7,运行命令：git push -u origin master(表示提交，需要输入用户名和密码)