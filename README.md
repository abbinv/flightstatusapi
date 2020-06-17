# Simple Flight Status API

A micro api to test other applications.. ;)

## Installation

Run the FlightstatusApplication.java  as a springboot application and you are ready to go.

It contains below statuses on start up, you can add, or update using a POST call.

```
[
  {
    "flightNumber": "KL1111",
    "status": "SCHEDULED"
  },
  {
    "flightNumber": "KL2222",
    "status": "DEPARTED"
  },
  {
    "flightNumber": "KL3333",
    "status": "ARRIVED"
  },
  {
    "flightNumber": "KL4444",
    "status": "DELAYED"
  },
  {
    "flightNumber": "KL1234",
    "status": "SCHEDULED"
  }
]

```


###### GET http://localhost:8080/KL1111
```

Expected respose 
{
    "flightNumber": "KL1111",
    "status": "SCHEDULED"
}

```


###### POST http://localhost:8080/KL1111

```
Request body = 
{
    "flightNumber": "KL8888",
    "status": "DEPARTED"
}

Expected response 
{
    "flightNumber": "KL8888",
    "status": "DEPARTED"
}

```


## Contributing
Pull requests are welcome. 


## License
[MIT](https://choosealicense.com/licenses/mit/)
