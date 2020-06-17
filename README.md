# Simple Flight Status API

A micro api to test other applications.. ;)

## Installation

Run the FlightstatusApplication.java  as a springboot application and you are ready to go.
It contains below statuses on start up. 

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
You can add or update more statusess using a POST call. Retrieve status using a GET call using flightNumber


###### Retrieve Status -  GET http://localhost:8080/KL1111
```

Expected respose 
{
    "flightNumber": "KL1111",
    "status": "SCHEDULED"
}

```


###### Add/Update Status -  POST http://localhost:8080/KL8888

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
