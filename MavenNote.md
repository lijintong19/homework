###Maven

###1.什么是Maven？

Maven英文翻译为“专家”、“内行”，是APache下的一个纯Java开发的开源项目。基于项目对象模型（POM）概念。
Maven利用一个中央信息片段能够管理一个项目的构建，报告和文档等步骤。
Maven是一个项目管理工具，可以对java项目进行构建，依赖管理。

###2.Maven可以帮助我们做什么？
Maven能够帮助开发者完成以下工作：
1.构建
2.文档生成
3.报告
4.依赖
5.SCMs
6.发布
7.分发
8.邮件列表

###3.Maven的特点
1.项目设置遵循统一的规则
2.任意工程中共享
3.依赖管理包括自动更新
4.一个庞大且不断增长的库。
5.可扩展，能够轻松编写java或脚本语言的插件
6.只需很少或不需要额外配置即可及时访问新功能

###Maven的生命周期
Maven有以下三个标准的生命周期

1.clean：项目清理的处理
2.default（或build）:项目部署的处理
3.site：项目站点文档创建的处理


###Maven常用构建命令
  1.validate:验证项目是正确的，所有必要的信息都是可用的。
  2.compile:编译项目的源代码
  3.test:使用适当的单元测试框架测试编译后的源代码，这些测试不应要求将代码打包或部署
  4.package:使用以编译的代码，并将其打包成可分布格式，例如JAR
  5.verify：对集成测试的结果进行任何检查，以确保满足质量标准。
  6.install：将包安装到本地存储库中，以便在本地其他项目中使用该包。
  7.deploy:在构建环境中完成，将最终的包复制到远程存储库总，以便于其他开发人员和项目共享。
  
  ###clean生命周期
  当我们执行mvn post-clean命令时，Maven调用clean生命周期，它包含以下阶段
  1.pre-clean：执行一些需要在clean之前完成的工作
  2.clean：移除所有上一次构建生成的文件
  3.post-clean:执行一些需要在clean之后立刻完成的工作
  
  在一个生命周期中。运行某个阶段的时候，他之前的所有阶段都会被运行。
  
  ###Default生命周期
  1.validate                           验证项目是正确的，所有必要的信息都是可用的。
  2.initialize                         初始化构建状态，例如设置属性或创建目录。                                 
  3.generate-sources                   生成包含在编译中的任何源代码。
  4.process-sources                    处理源代码，例如过滤任何值。
  5.generate-resources                 生成包含在包中的资源。 
  6.process-resources                  将资源复制并处理到目标目录中，准备打包。 
  7.compile                            编译项目的源代码。 
  8.process-classes                    从编译后生成生成的文件，例如在Java类上执行字节码增强。 
  9.generate-test-sources              生成包含在编译中的任何测试源代码。 
  10.process-test-sources              处理测试源代码，例如过滤任何值。 
  11.generate-test-resources           为测试创建资源。 
  12.process-test-resources            将资源复制并处理到测试目标目录中。 
  13.test-compile                      将测试源代码编译到测试目标目录。 
  14.process-test-classes              从测试编译后post-process生成文件，例如在Java类上执行字节码增强。对于Maven 2.0.5和以上。 
  15.test                              使用合适的单元测试框架运行测试。这些测试不应该要求打包或部署代码。 
  16.prepare-package                   在实际包装前执行必要的准备工作。这通常会导致包的一个未打包的、经过处理的版本。(Maven 2.1及以上) 
  17.package                           使用已编译的代码，并将其打包成可部署格式，例如JAR。 
  18.pre-integration-test              执行集成测试之前需要执行的操作。这可能涉及到设置所需的环境等问题。 
  19.integration-test                  在需要集成测试的环境中，处理并部署包。 
  20.post-integration-test             执行集成测试后所需要的操作。这可能包括清理环境。 
  21.verify                            运行任何检查以验证包是否有效，并满足质量标准。 
  22.install                           将该包安装到本地存储库中，作为本地其他项目的依赖项。 
  23.deploy                            在集成或发布环境中完成，将最终包复制到远程存储库中，以便与其他开发人员和项目共享。 
  
  ###Site生命周期
  1.pre-site        在实际的项目站点生成之前执行过程
  2.site            生成项目的站点文档
  3.post-site       执行确定站点生成的过程，并为站点部署做好准备
  4.site-deploy     将生成的站点文档部署到指定的web服务器

