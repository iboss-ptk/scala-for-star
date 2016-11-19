# Scala for *

## Prerequisities
1. Installing SBT
    - [Mac OS X](http://www.scala-sbt.org/0.13/docs/Installing-sbt-on-Mac.html)
        Homebrew is recommended
    - [Windows](http://www.scala-sbt.org/0.13/docs/Installing-sbt-on-Windows.html)
    - [Linux](http://www.scala-sbt.org/0.13/docs/Installing-sbt-on-Linux.html)
    
2. Intelli J community edition with Scala plugin
    https://www.jetbrains.com/idea/?fromMenu#chooseYourEdition
    
3. Java SDK 8.0 latest version 

## Quick Start
```
> git clone git@github.com:iboss-ptk/scala-for-star.git
> cd scala-for-star.
> sbt
```
It may take long time — can take a break or sleep for 1 night

After that, start SBT and run the following command:
run - To compile and run code in main
```
sbt> run
```

The result will look like this.
```
...
[info] Running example.Hello 
hello
[success] Total time: 33 s .....
```

REPL - start REPL(Scala console) by sbt
```
sbt> console
```
The result will be
```
scala> 
```
you can interactively try your scala code here.

