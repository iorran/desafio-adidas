# Adidas DB

Microservice to acess database

## Getting Started

Process to run adidas-db microservice

### Prerequisites

What things you need to install the software and how to install them

```
Maven
Docker
Git
Swagger codegen ( download it here: http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/2.3.1/swagger-codegen-cli-2.3.1.jar)

```

### Building

#### Clone this repo

```
git clone https://github.com/iorran/adidas-db.git
```

#### Build micro service

```
cd adidas-db

mvn install

cd ..
```
### Running

#### Create a container

```
sudo docker build adidas-db -t adidas-db

```
#### Start the container

```
sudo docker run -p 5000:8080 adidas-db
```

#### Access OpenAPI Specification

```
URL: http://localhost:5000/adidas-db/v2/api-docs

Save the spec api in the same folder as you saved "swagger-codegen-cli-2.3.1.jar"

```

#### Generate API Client

```
Run the command below

java -jar swagger-codegen-cli-2.3.1.jar generate \
  -i adidas-db.json \
  --api-package com.adidas.db.client.api \
  --model-package com.adidas.db.client.model \
  --invoker-package com.adidas.db.client.invoker \
  --group-id com.adidas.db \
  --artifact-id adidas-db-api \
  --artifact-version 1.0.0 \
  -l spring \
  --library spring-cloud \
  -o adidas-db-api \

java -jar swagger-codegen-cli-2.3.1.jar generate \
  -i adidas-evt.json \
  --api-package com.adidas.evt.client.api \
  --model-package com.adidas.evt.client.model \
  --invoker-package com.adidas.evt.client.invoker \
  --group-id com.adidas.evt \
  --artifact-id adidas-evt-api \
  --artifact-version 1.0.0 \
  -l spring \
  --library spring-cloud \
  -o adidas-evt-api \

java -jar swagger-codegen-cli-2.3.1.jar generate \
  -i adidas-email.json \
  --api-package com.adidas.email.client.api \
  --model-package com.adidas.email.client.model \
  --invoker-package com.adidas.email.client.invoker \
  --group-id com.adidas.email \
  --artifact-id adidas-email-api \
  --artifact-version 1.0.0 \
  -l spring \
  --library spring-cloud \
  -o adidas-email-api
  
 cd adidas-db-api
 
 mvn install
```


## Authors

* **Iorran Castro** - (https://github.com/iorran) 

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
 
