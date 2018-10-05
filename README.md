# ETF2L4J

Java wrapper for the ETF2L API

[Download 1.0](https://github.com/t-taylor/ETF2L4J/raw/master/ETF2L4J-1.0.jar)

## Usage

```java
ETF2L4J etf2l = new ETF2L4J();

// Can also take a STEAMID or STEAMID64
String playerId = "115791";

// Returns a call object for you to handle
Call<PlayerResponse> playerCall = etf2l.getPlayer(playerId);

String name = playerCall.execute().body().getPlayer().getName();

// prints 'planck'
System.out.println(name);
```
