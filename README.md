# StackExchange

Disclaimer: This has nothing to do with the network of Q&A sites that is also called Stack Exchange.

Stack Exchange is a stack-based language that involves exchanging stacks.

See [the wiki](https://github.com/ysthakur/StackExchange/wiki) for more info.

## Installation:

You probably don't want to install this, but anyway, if you need to:
- For the last release, go [here](https://github.com/cgccuser/StackExchange/releases) and download the sole jar.
- For hemorrhaging edge eveningly builds:
  - Click on the latest green workflow [here](https://github.com/cgccuser/StackExchange/actions/workflows/makejar.yml)
  - Scroll down to the artifacts section and download the thing saying `stackexchange`
  - For whatever reason, it's a zip file, so extract `StackExchange.jar` from that

## Running

The inputs are optional
```
java -jar StackExchange.jar "program" "input1" "input2" "input*"
```
