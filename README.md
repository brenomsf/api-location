# api-location

Microserviço em java que retorna estados da federação. 

## Gerando o pacote da aplicação

Você pode gerar o .jar para deploy seguindo o comando abaixo:
```shell script
mvn clean install
```

## Adicional

A aplicação esta rodando na aws através do Elastic Beanstalk pela url http://apilocation-env.eba-fmjpijzw.us-east-1.elasticbeanstalk.com/locations/states e o repositório também esta integrado com uma esteira de CI/CD criado com o codepipeline da aws. Para testar, basta apenas incluir mais um estado no arquivo .json (State.json) da pasta de resource.
