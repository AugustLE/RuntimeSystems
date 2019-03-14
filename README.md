# Runtime Systems

# About

For our project, we want to dig deeper into Python and Java and compare the two languages on different properties, such as performance, runtime, memory, productivity, etc.
To compare the languages, we want to implement more complex programs and algorithms. For instance, when looking at the differences by running algorithms like the Mandelbrot and n-body, big differences will be revealed between the two languages.

Documentation link: https://gdoc.pub/doc/e/2PACX-1vTWfIYI0D71U-qFzV_JD34DMJgV3Z8QTnHSCGuSakor1vF6rZnBpoGMqzai3luURnfk83EdAQpf1aOn

# Team Members

## [Kasper Berg](https://github.com/kasperkberg)
![Kasper](headshots/bilde.jpg)

## [August Eilertsen](https://github.com/augustle)
![August](headshots/bilde_aug.jpg)


# Profiling
## Java
We used the YourKit Java profiler. It costs money, but we used a free trial period.
Run a Java proram from above, and go to YourKit and start the profiler.

## Python
We used mprofiler.
Uncomment (or insert if not already there) @profile above the main-method. Then run

```$ python3 -m memory_profiler example.py``` 

in the terminal.

We also profiled time-based memory usage. Remove/uncomment @profile above the main method.
Then run
```
$ mprof run example.py
$ mprof plot
```
