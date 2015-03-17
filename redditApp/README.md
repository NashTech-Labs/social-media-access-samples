# braggr-ui-platform
Who needs a resume just Bragg!

-----------------------------------------------------------------------
###Development environment
-----------------------------------------------------------------------
* Execute `./activator clean compile` to build the product
* Execute `./activator "~run"` to execute the product
* braggr.me should now be accessible at `localhost:9000`

-----------------------------------------------------------------------
###Test environment
-----------------------------------------------------------------------
check the application code quality
```
$ ./activator scalastyle
```
test the application
```
$ ./activator test
```
tests with coverage enabled by entering:
```
$ ./activator clean coverage test
```
or if you have integration tests as well
```
$ ./activator clean coverage it:test
```
to generate coverage report
```
$ ./activator coverageReport
```