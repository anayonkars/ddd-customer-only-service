#run main class using following command on terminal
gradle run

Request

{
"addressRequest": {
"city": "pune"
}
}

curl --location --request POST 'http://localhost:8080/customers' \
--header 'Content-Type: application/json' \
--data-raw '{   
"addressRequest" :{
"city": "pune"
}

}'


curl --location --request PUT 'http://localhost:8080/customers/53b0c526-4318-44b5-8b38-b1dc0d9d1814/address' \
--header 'Content-Type: application/json' \
--data-raw '{
"city": "mumbai"
}'


//        events.add(new CustomerAddressUpdatedEvent(customerId.getCustomerId(),
new com.ddd_bootcamp.domain.events.AddressData(address.getCity())));